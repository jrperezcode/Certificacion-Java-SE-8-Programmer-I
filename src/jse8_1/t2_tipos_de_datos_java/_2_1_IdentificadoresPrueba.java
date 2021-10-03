package jse8_1.t2_tipos_de_datos_java;

public class _2_1_IdentificadoresPrueba {
	
	//identificadores legales
	int $y = 0; // solo el caracter $ , _ son los unicos caracteres extraños que pueden ser usados 
	int _y = 0;
	int y4 = 12; // los numeros solo pueden ser usados a partir del segundo caracter
	float t = 300;
	Double d1 = (double)200;
	Double d2 = 302d;
	
	static int String = 7;
	int ArrayList = 213;
	
	static int valorEntero;
	static float valorFloat;
	static String valorCadena;
	static boolean valorBooleano;
	static double valorDouble;
	
	public static void main(String[] args) {
		System.out.println(String);
		
		byte b = 127;
		//byte b1 = 128; No compilas
		/*jerarquia
		 * enteros
		 * byte > short > int
		 * punto flotante
		 * float > double
		 */
		
		System.out.println(valorEntero);
		System.out.println(valorFloat);
		System.out.println(valorBooleano);
		System.out.println(valorDouble);
		System.out.println(valorCadena);
		
		
		/*
		 * IMPORTANTE: LAS VARIABLES LOCALES DEBEN SER SIEMPRE INICIALIZADAS
		 */
		int porFavorInicializar;
		//System.out.println(porFavorInicializar);
		

	}
	
}


class LiteralesPrimitivos {
	
	public static void main(String[] args) {
		
		// binario (base 2): empiezan con 0b
		int b1 = 0B11;
		System.out.println(b1);
		// octales (base 8): empiezan con 0
		int ocho = 010;
		System.out.println(ocho);
		// hexadecimales (base 16): empiezan con 0x
		int x1 = 0x0001;
		int y1 = 0X7F; //puede ser mayúscula o minúscula
		System.out.println(x1);
		System.out.println(y1);
		
		// formas equivalentes
		int y2 = 1000000;
		int y3 = 1_000_000;
		
		/*
		 * Por defecto los numeros decimales son double
		 */
		double d1 = 2323.2323;
		double d2 = 2323.2323D;
		// aqui se demuestra que por defecto los decimales se entienden como double
		float f1 = (float) 2323.2323;
		float f2 = (float) 2323.2323F;
		
		char letraA = 'a';
		char arroba = '@';
		char letraN = '\u004E';
				System.out.println(letraN);
				
		/*
		 * @Casting de primitivoS
		 */
				
		//implicitos
		byte b5 = 9;
		short s5 = 2;
		int i5 = b5;
		int i6 = s5;
		
		//explicitos (se necesita castear)
		byte b6 = (byte) i5;
		byte b7 = (byte) 1_000;
		
		/*
		 * IMPORTANTE: En java por defecto un número con punto flotante es
 			DOUBLE y un número sin punto flotante es INT
		 */
		byte b = 3;
		b = (byte) (b + 7);

		int i = (int) 233.123F;
		System.out.println(i);
		
	}
	
}

//Pregunta02_02

class Dark {
	int x = 3;

	public static void main(String[] args) {
		new Dark().go1();
	}

	void go1() {
		//int x; aqui se cumple shadowwing y tambien un error de compilacion porque no esta inicializada la variable
		go2(++x);
	}

	void go2(int y) {
		int x = ++y;
		System.out.println(x);
	}
}