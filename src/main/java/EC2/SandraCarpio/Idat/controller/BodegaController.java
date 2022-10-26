package EC2.SandraCarpio.Idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import EC2.SandraCarpio.Idat.model.Bodega;
import EC2.SandraCarpio.Idat.service.BodegaService;


public class BodegaController {
	
	@Autowired
	private BodegaService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Bodega>> listar(){
		return new ResponseEntity<List<Bodega>>(service.listar(), HttpStatus.OK) ;
	}
	
	@RequestMapping(path="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Bodega bodega ){
		service.guardar(bodega);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Bodega> obtenerPorId(@PathVariable Integer id){
		
		Bodega bodega = service.obtener(id);
		
		if( bodega != null) {
			return new ResponseEntity<Bodega>(bodega, HttpStatus.OK);
		}else {
			return new ResponseEntity<Bodega>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Bodega bodega){
		
		Bodega bd = service.obtener(bodega.getIdbodega());
		
		if( bd != null) {
			service.actualizar(bodega);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void>eliminar(@PathVariable Integer id){
		
		Bodega bodega = service.obtener(id);

		if(bodega != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}



}
