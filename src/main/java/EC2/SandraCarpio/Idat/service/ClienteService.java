package EC2.SandraCarpio.Idat.service;

import java.util.List;

import EC2.SandraCarpio.Idat.model.Cliente;


public interface ClienteService {
	
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);

}
