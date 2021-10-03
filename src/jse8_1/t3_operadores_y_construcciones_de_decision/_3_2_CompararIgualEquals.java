package jse8_1.t3_operadores_y_construcciones_de_decision;

class Cliente {
	
	private String dni;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if (obj instanceof Cliente) {
			Cliente clienteAEvaluar = (Cliente)obj;
			if(this.getDni().equals(clienteAEvaluar.getDni())) {
				return true;
			}
		}
		return false;
	}
}

public class _3_2_CompararIgualEquals {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.setDni("48062107");
		Cliente c2 = new Cliente();
		c2.setDni("48062107");
		Cliente c3 = c1;
		System.out.println(c1 == c2);// el == esta validando si ambos a puntan a la misma direccion de memoria
		System.out.println(c3 == c1);
		System.out.println(c1.equals(c2));
		
		String s1 = new String("hola");
		String s2 = new String("hola");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
	
}