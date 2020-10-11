package tiendaShell;

public class ClienteDeposito extends Cliente {
	
	private int DNI;
	PersonaDeposito cuenta;
	public ClienteDeposito(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pagar() {
		super.setEstado(true);		
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

}
