package tiendaShell;

public class PersonaPagare {
	
	private int DNI;
	private double cantidad;
	private String nombre; 
	private String numPagare;
	
	public PersonaPagare(String nombre,int dni, String numPagare,double cantidad) {
		this.setNombre(nombre);
		this.setCantidad(cantidad);
		this.setDNI(dni);
		this.setNumPagare(numPagare);
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setDNI(int dni) {
		this.DNI= dni;
	}
	public void setCantidad(double cantidad) {
		this.cantidad= cantidad;
	}
	public void setNumPagare(String numPagare) {
		this.numPagare=numPagare;
	}
	public String getNombre() {
		return nombre;
	}
	public int getDNI() {
		return DNI;
	}
	public double getcantidad() {
		return cantidad;
	}
	public String getNumPagare() {
		return numPagare;
	}
}
