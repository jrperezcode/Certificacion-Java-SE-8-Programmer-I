package jse8_1.t6_metodos_y_encapsulacion;

import java.io.File;
import java.io.IOException;

class Persona{
	
	public void grabarInfo() {
		System.out.println("grabarInfo Persona");
	}
	
	public Double calcularSueldo() {
		return 0.0;
	}
	public Double calcularSueldo(String i) {
		return 0.0;
	}
	public void calcularSueldo(Integer i) {
		return;
	}
}

class Cliente extends Persona {
	
	public void grabarInfo() {
		System.out.println("grabarInfo Cliente");
	}
	
	public Double calcularSueldo(String i, Double base) {
		return 0.0;
	}
	
}

public class _6_1_MetodosSobreescritosYSobrecargados {

	public static void main(String[] args) throws IOException {
		Cliente cliente = new Cliente();
		cliente.grabarInfo();
		File file = new File("");
		file.createNewFile();
	}
	
}
