package tiendaShell;

public class PersonaServicio {
	private String nombre;
	private String description;
	private int codigo;
	
	public PersonaServicio(String nombre, int codigo, String descripcion) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.setDescription(descripcion);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
