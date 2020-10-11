package tiendaShell;

import java.util.Date;

public abstract class Cliente {
	private String nombre;
	private Date fechaEntrega;
	private boolean pagado=false;
	
	public Cliente(String nombre) {
		fechaEntrega= new Date();
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public String getFecha(){
		return fechaEntrega.toString();
	}
	public void setEstado(boolean a) {
		pagado=a;
	}
	public boolean getEstado() {
		return pagado;
	}
	public abstract void pagar();	
}
