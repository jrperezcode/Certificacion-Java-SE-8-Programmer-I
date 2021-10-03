package jse8_1.t1_conceptos_basicos;

/*
Nota_01:
	Solomente la clase que tenga el public debe coincidir con el nombre del fichero
*/

public class _1_2_EstrucutaDeClase {

	public static void main(String[] args) {
		
	}
	
}


class Computadora {

}


//Bloques de inicializacion
class ClasePadre {
	ClasePadre() {
		System.out.println("inicio clase padre");
	}
}

class InitMembersOfClass extends ClasePadre {
	InitMembersOfClass(int x) {
		System.out.println("1-arg const");
	}

	InitMembersOfClass() {
		System.out.println("no-arg const");
	}

	static {
		System.out.println("1st static init");
	}
	{ 	// los bloques de instancia son los segundos en ser ejecutados y
		// se ejecutan de acuerdo al orden en que se encuentran en la clase.
		System.out.println("1st instance init::");
	}
	{
		System.out.println("2nd instance init");
	}
	static { 
		// los bloques static son los primeros en ser ejecutados y
		//se ejecutan de acuerdo al orden en que se encuentran en la clase.
		System.out.println("2nd static init");
	}

	public static void main(String[] args) {
		
//		{
//			System.out.println("Bloque main");
//		}
		
		/*Test_01 
		 1. Se imprime los bloques static
		 3. Se llama al super() del constructor de la clase
		 3. Se imprime los bloque de instancia
		 4. Finalmente se imprime el cuerpo del constructor 
		*/
		new InitMembersOfClass();
		
		//Test_02
		new InitMembersOfClass(7);
		
		/*Notas
		Los bloques static solo se ejecutan una sola vez y es al inicio del programa
		Los bloques de instancia se ejecutan cada vez que la clase es intanciada
		Importante: Los bloque de instancia se ejecutan despues que el constructor llame al super() y
		antes que se ejecute alguna linea del cuerpo del constructor */
 	}
	
}


class AplicandoBloques {
	
	int x;
	String nombre;
	
	{
		nombre = "nombre de bloque";
		x = x+6;
	}
	
	static {
		System.out.println("Bloque static");
	}
	
	public static void main(String[] args) {
		{
			System.out.println("Bloque interno");
		}
		
		System.out.println(new AplicandoBloques().nombre + new AplicandoBloques().x);
	}
	
}