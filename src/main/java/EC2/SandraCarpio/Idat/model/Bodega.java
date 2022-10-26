package EC2.SandraCarpio.Idat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="bodega")
public class Bodega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Integer idbodega;
	private String nombre;
	private String direcion;
	private Integer idProducto;
	
	
	@ManyToOne
	@JoinColumn(name = "idProducto", nullable = false, unique = true, 
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (idProducto) references Producto(idProducto)"))
	private Producto producto;

	
	public Integer getIdbodega() {
		return idbodega;
	}
	public void setIdbodega(Integer idbodega) {
		this.idbodega = idbodega;
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
	public Integer getIdproducto() {
		return idProducto;
	}
	public void setIdproducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	
	
	

}
