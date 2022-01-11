public class ejercicios_t3_for1 {

	//public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=sc.nextInt();
		for (int y=1;y>numero;y++) {
			numero=numero*y;
		}
		System.out.println(numero);
		System.out.println("fin");
		sc.close();
		}*/
	
	//si es primo o no
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=sc.nextInt();
		boolean b=true; //es primo mientras no se demuestre lo contrario
		for (int y=numero-1;y>1;y--) {
			if(numero%y==0) {
				System.out.println(numero+" no es primo");
				b=false;
				break;
			}
		}
		if(b) {
		System.out.println("es primo");
		}
		System.out.println("fin");
		sc.close();*/
		
		//calcular el factorial
	/*for (int j = 1; j < 11; j++) {
		int resultado = 1;
		for (int i = 2; i < j + 1; i++) {
			resultado=resultado * i;
		}
		System.out.println("El factorial de " + j + " es " +resultado );
	}
		System.out.println("fin del programa");*/
		
public static int Factorial(int numero) {
	int resultado = 1;
	for (int i = 2; i < numero + 1; i++) {
		resultado=resultado * i;
		}
	return resultado;
}
public static void main(String[] args) {
	//calcular factorial
	for (int j = 1; j< 11; j++) {
		System.out.println("el facotrial de " + j+ " es " + Factorial(j));
	}
	System.out.println("fin");
	}
}

