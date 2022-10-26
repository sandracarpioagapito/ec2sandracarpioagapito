package EC2.SandraCarpio.Idat.model;

public class Usuario {
	
	private Integer idusuario;
	private String usuario;
	private Integer password;
	private String rol;
	public Usuario(Integer idusuario, String usuario, Integer password, String rol) {
		super();
		this.idusuario = idusuario;
		this.usuario = usuario;
		this.password = password;
		this.rol = rol;
	}
	public Integer getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	

}
