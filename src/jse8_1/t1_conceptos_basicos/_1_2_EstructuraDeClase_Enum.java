package jse8_1.t1_conceptos_basicos;

enum TamanioDeCafe{ 
	//LOS ENUM PUEDEN SOBREESCRIBIR METODOS
	CHICO(5){
		public String getCalidad() {
			return "C";
		}
		@Override
		public String getMensaje() {
			return "CHICO C";
		}
	}, MEDIANO(8){
		public String getCalidad() {
			return "B";
		}
		@Override
		public String getMensaje() {
			return "MEDIANO B";
		}
	}, GRANDE(10){
		public String getCalidad() {
			return "A";
		}
		@Override
		public String getMensaje() {
			return "GRANDE A";
		}
	};
	
	private int onzas;

	TamanioDeCafe(int onzas) {
		this.onzas = onzas;
	}
	public int getOnzas() {
		return onzas;
	}
	public String getCalidad() {
		return "A";
	}
	
	//cuando se declara un metodo abstracto, este debera ser implementado en cada enum
	abstract public String getMensaje();
	
	//recorrer un enum
	public static int getOnzasLitros(TamanioDeCafe cafeEnum) {
		int onzas = 0;
		for(TamanioDeCafe c : TamanioDeCafe.values()) {
			if(cafeEnum == c)
				onzas = c.getOnzas();
		}
		return onzas;
	}
}

public class _1_2_EstructuraDeClase_Enum {
	//Los enum puede estar dentro de una clase
	enum BarajaCartas {DIAMANTE, CORAZON, ESPADA, TREBOL}

	//Un enum puede ser un tipo de datos
	TamanioDeCafe tamanioPorDefecto = TamanioDeCafe.CHICO;
	
	public static void main(String[] args) {
		
		TamanioDeCafe tamanioSeleccionado = TamanioDeCafe.valueOf("MEDIANO");
		System.out.println(tamanioSeleccionado);
		System.out.println(tamanioSeleccionado.getOnzas());
		System.out.println(tamanioSeleccionado.getCalidad());
		System.out.println(tamanioSeleccionado.getMensaje());
		System.out.println(TamanioDeCafe.getOnzasLitros(TamanioDeCafe.CHICO));
	}
	
}

class RecorrerEnum {
	
	public static void main(String[] args) {
	
		for(TamanioDeCafe c : TamanioDeCafe.values()) {
		}
	}
	
}

//PREGUNTA_01_02
enum Fish {
	GOLDFISH, ANGELFISH, GUPPY;
}

class EnumTest2 {
	public static void main(String[] args) {
		Fish f = Fish.valueOf("GUPPY");
		// los enum tienen un comportamiento como el de las constantes, por tanto lo de abajo es tru
		if (f == Fish.GUPPY)
			System.out.println("Are equal");
		if (f.equals(Fish.GUPPY))
			System.out.println("Are equal");
	}
}

//PREGUNTA_02_02

class BloqueInicial {
	BloqueInicial() {
		System.out.println("no-arg const");
	}

	static {
		System.out.println("1st static init");
	}
	{
		System.out.println("1st instance init");
	}

	public static void main(String[] args) {
		{ System.out.println("Bloque main");} //ojo con este bloque que tambien se imprime
		new BloqueInicial();
		new BloqueInicial();
	}
}