package Testing;

public class Vehiculo {

	int ruedas;
	double peso;
	String color;
	
	public void mensajeRuedas(String codeVehiculo) {
		if(codeVehiculo.equals("C"))
			System.out.println("El vehiculo tiene 4 ruedas");
		else if(codeVehiculo.equals("M")) 
			System.out.println("El vehiculo tiene 3 ruedas");
		else 
			System.out.println("vehiculo no detectedo");
	}
}
