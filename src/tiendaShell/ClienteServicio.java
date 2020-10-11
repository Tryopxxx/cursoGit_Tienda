package tiendaShell;

public class ClienteServicio extends Cliente{

	public ClienteServicio(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pagar() {
		this.setEstado(true);
		
	}

}
