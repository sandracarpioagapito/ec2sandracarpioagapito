package EC2.SandraCarpio.Idat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;


@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idCliente;
	private String nombre;
	private String direcion;
	private String dni;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "clienteproducto", joinColumns = @JoinColumn(name = "idCliente", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idCliente) references Cliente(idCliente)")), inverseJoinColumns = @JoinColumn(name = "idproducto", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idproducto) references Producto(idProducto)")))
	private List<Producto> productos = new ArrayList<>();
	
	
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirecion() {
		return direcion;
	}
	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
