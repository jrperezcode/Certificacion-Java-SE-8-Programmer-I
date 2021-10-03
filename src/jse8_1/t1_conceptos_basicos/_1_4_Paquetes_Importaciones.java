package jse8_1.t1_conceptos_basicos;

/*los import regulares(es decir no estaticos), sirve para incluir una clase o un conjunto de clases (se utiliza *)
de un determinado paquete*/
import java.math.*;
import java.math.BigDecimal;
import java.math.BigDecimal.*; // ojo que esto si compila pero no tiene ningun efecto

/*los import static Se utilizan para importar uno o varios miembros estáticos de una
clase. Asi mismo se debe respetar la sintaxis y colocar import static  */
import static java.lang.Math.*;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.System.out;



class ArrayList<T>{
	
}

public class _1_4_Paquetes_Importaciones {

	public static void main(String[] args) {
		//La prioridad la tiene la clase creada en el fichero y no la del API
		ArrayList<String> cadenas = new ArrayList();
		java.util.ArrayList<String> cadenasApi = new java.util.ArrayList<String>();
		cadenasApi.add("Junior");
		
		//Gracias a la importacion estatico puede llamar directamente al metodo static sin anteponer el nombre de la clase
		abs(-3);
		
		System.out.println(MAX_VALUE);
		out.println("Inclusion static");
	}
	
}