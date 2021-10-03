package jse8_1.t3_operadores_y_construcciones_de_decision;


interface Domesticable{
	
	
}

class Animal {
	
}

class Perro extends Animal implements Domesticable {
	
}

public class _3_1_OperadoresJava {
	
	
	
	public static void main(String[] args) {
		//instanceof
		
		Perro p = new Perro();
		boolean esTrue0 = p instanceof Perro;
		boolean esTrue1 = p instanceof Animal;
		boolean esTrue2 = p instanceof Domesticable;
		
		Animal a = new Animal();
				boolean esTrue3 = a instanceof Domesticable;
				
		System.out.println(esTrue0);
		System.out.println(esTrue1);
		System.out.println(esTrue2);
		System.out.println(esTrue3);
				
	}
}
