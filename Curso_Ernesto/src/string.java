
public class string{

	public static void main(String[] args) {
		
		String nombre="Ernesto";
		System.out.println("mi nombre es " + nombre);
		System.out.println("mi nombre tiene "+ nombre.length() + " letras.");
		System.out.println("la primera letra de " +nombre+ " es la " + nombre.charAt(0));
		int ultima_letra;
		ultima_letra=nombre.length();
		System.out.println("y la ultima letra es la " + nombre.charAt(ultima_letra-1));
	}

}
