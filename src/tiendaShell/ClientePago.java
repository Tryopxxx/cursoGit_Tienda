package tiendaShell;

public class ClientePago extends Cliente {

	public ClientePago(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pagar() {
		super.setEstado(true);
		
	}

}
