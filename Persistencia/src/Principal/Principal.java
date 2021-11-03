package Principal;

public class Principal {

	public static void main(String[] args) 
	{
		try {
			VentanaPrincipal window = new VentanaPrincipal();
			window.mostrarVentana();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
