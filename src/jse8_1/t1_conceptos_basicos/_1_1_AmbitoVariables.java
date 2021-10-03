package jse8_1.t1_conceptos_basicos;

class Persona {

	private String nombre;

	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		nombre = nombre;
	}
}

public class _1_1_AmbitoVariables {

	String mensaje = "Cuidado";
	String valueMethod = "valorDeMetodo";

	public static void main(String[] args) {
		int valor = 8;

		if (valor < 10) {
			String mensaje = "Hola";
		}
		System.out.println(valor);

		{
			{
				String palabra = "Adios";
			}
			{
				String palabra = "Adios";
			}

			// System.out.println(palabra);
		}

		// accediendo a la variable y metodo de instancia "mensaje" medienta una
		// instancia de la clase
		_1_1_AmbitoVariables ambito = new _1_1_AmbitoVariables();
		System.out.println(ambito.mensaje);
		System.out.println(ambito.scopeVariableInstancia());

		// NOTA
		/*
		 * System.out.println(mensaje); // al colocar mensaje solo, el compilador asume
		 * que esta asi -> this.mensaje
		 */
		
		Persona persona = new Persona();
		persona.setNombre("Junior");
		System.out.println(persona.getNombre());
	}

	String scopeVariableInstancia() {
		System.out.println(this.valueMethod);
		return "return metodo";
	}

}

class Layout {

	static int s = 343; // variable de clases (estatica)

	int x; // variable de instancia

	{
		x = 7;
		int x2 = 5;
	} // variable de bloque

	Layout() {
		x += 8;
		int x3 = 6;
	}

	void doSuff() {

		int y = 0;

		for (int z = 0; z < 4; z++) {
			y += z + x;
		}
	}

	public static void main(String[] args) {

		System.out.println(new Layout().x);
		// System.out.println(new Layout().x2); //no podemos acceder a x2 porque esta
		// fuera de alcance
	}

}

class Ciudadano {
	private String nombre = "nombre_ciudadano";
	private String apellidos; // variable de instancia

	public void mostrarSaludo(){
		String nombre = this.nombre; // Shadowing
		System.out.println(nombre);
	}

	public void mostrarSaludo(String apellidos){ //Shadowing
		//apellidos = apellidos; // Esto no marca error, pero no hace nada
		// porque se actualizaría la variable local apellidos
		// con su mismo valor
		this.apellidos = apellidos;
		System.out.println(this.nombre + apellidos);
	}
	
	public static void main(String[] args) {
		new Ciudadano().mostrarSaludo();
	}
	
}
