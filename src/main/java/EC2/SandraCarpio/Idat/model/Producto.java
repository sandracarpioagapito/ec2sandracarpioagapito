package EC2.SandraCarpio.Idat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "producto")
public class Producto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	private String Producto ;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	@ManyToMany(mappedBy = "Producto", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Cliente> cliente = new ArrayList<>();
	
	@OneToMany(mappedBy = "Producto")
	private List<Bodega> bodega =new ArrayList<>();
	



	public Integer getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}


	public String getProducto() {
		return Producto;
	}


	public void setProducto(String producto) {
		Producto = producto;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	} 
	
	
	

}
