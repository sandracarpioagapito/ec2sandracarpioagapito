package EC2.SandraCarpio.Idat.controller;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import EC2.SandraCarpio.Idat.dto.UsuarioDTORequest;
import EC2.SandraCarpio.Idat.dto.UsuarioDTOResponse;
import EC2.SandraCarpio.Idat.security.TokenUtil;
import EC2.SandraCarpio.Idat.security.UserDetailService;
import ch.qos.logback.classic.pattern.Util;



@RestController
public class UsuarioControler {
	
	@Autowired
	private TokenUtil util;
	
	@Autowired
	private UserDetailService service;     
	
	@RequestMapping(path = "/crearToken",method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UsuarioDTORequest request){
		
		UserDetails user =Service.loadUserByUsername(request.getUsuario());
		if(user.getPassword().equals(request.getContrasenia()))
			return ResponseEntity.ok(new UsuarioDTOResponse(Util.generateToken(user.getUsername())));
		else
			throw new UsernameNotFoundException("Contraseña invalidad");
	}

}
