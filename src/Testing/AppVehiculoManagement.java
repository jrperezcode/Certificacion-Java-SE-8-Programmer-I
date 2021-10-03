package Testing;

public class AppVehiculoManagement {

	/*
	 * CODIGO CARRO -> C
	 * CODIGO MOTO -> M
	 */
	static String cadena;
	
	static Vehiculo vehiculo;
	
	
	public static void main(String[] args) {
		cadena = cadena + "concat";
		System.out.println(cadena);
		vehiculo = new Vehiculo();
		vehiculo.mensajeRuedas("C");
		
		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo();
		v1.ruedas = 3; 
		v2 = v1; // INTERESANTE PROBAR EL CASO INVERSO v1 = v2;
		System.out.println(v2.ruedas);
	}
	
}
