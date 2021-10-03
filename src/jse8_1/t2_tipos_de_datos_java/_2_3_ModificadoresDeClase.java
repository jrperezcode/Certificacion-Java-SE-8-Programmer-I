package jse8_1.t2_tipos_de_datos_java;

class Cliente {
	
	private String variablePrivada;
	protected String variableProtegida;
	public String variablePublica;
	String variableDefault;
	
	public void calcularVenta() {
		// 1. Desde la misma clase podemos acceder a todos los niveles de acceso
		variablePrivada = "";
		variableProtegida = "";
		variablePublica = "";
		variableDefault = "";
	}
	
}

public class _2_3_ModificadoresDeClase {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
	}
	
}
