package jse8_1.t2_tipos_de_datos_java;

import static java.lang.System.*;

class Persona {
	
	private String nombre;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
}

public class _2_2_VariableInstancia {

	/*Si la variable no está inicializada en
	su declaración, sólo hay 2 lugares
	donde se puede inicializar: 1) En el
	constructor o 2) En un bloque de
	instancia.*/
	final private Persona persona;
	
	public _2_2_VariableInstancia() {
		this.persona = new Persona();

	}
	public static void main(String[] args) {
		final int i = 9;
		out.println(i);
		final Persona persona = new Persona();
		//Nota: las propiedades del objeto pueden cambiar a pesar que la variable de referencia es final
		persona.setNombre("Junior");
		System.out.println(persona.getNombre());
		//persona = null; ¡ERROR DE COMPILACION!
	}
}

// Pregunta_01_02
class Fizz {
	int x = 5;

	public static void main(String[] args) {
		final Fizz f1 = new Fizz();
		Fizz f2 = new Fizz();
		Fizz f3 = FizzSwitch(f1, f2);
		System.out.println((f1 == f3) + " " + (f1.x == f3.x));
	}

	static Fizz FizzSwitch(Fizz x, Fizz y) {
		final Fizz z = x;
		z.x = 6;
		return z;
	}
}

//Pregunta_02_02

class Mirror {
	int size = 7;

	public static void main(String[] args) {
		Mirror m1 = new Mirror();
		Mirror m2 = m1;
		int i1 = 10;
		int i2 = i1;
		go(m2, i2);
		System.out.print(m1.size + " " + i2);
	}

	static void go(Mirror m, int i) {
		m.size = 8;
		i = 12;
	}
}