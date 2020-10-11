package tiendaShell;

public class PersonaDeposito {
	private int numCuenta;
	private String nombre;
	public PersonaDeposito(String nombre, int numC) {
		this.setNombre(nombre);
		this.setNunCuenta(numC);
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setNunCuenta(int numC) {
		this.numCuenta=numC;
	}
	public String getNombre() {
		return nombre;
	}
	public int numCuenta() {
		return numCuenta;
	}
}
