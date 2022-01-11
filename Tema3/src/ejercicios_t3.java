
public class ejercicios_t3 {

	public static void main(String[] args) {
		//ejercicio uno (i)
		/*int primero=(int)(Math.random()*1000);
		System.out.println(primero);
		int num;
		boolean si=true;
		for (int i = 1; i < 10; i++) {
			num=(int)(Math.random()*1000);
			System.out.println(num);
			if (primero!=num) {
				si=false;
			}
		}
		if (si==true) {
			System.out.println("todos son iguales");
		}else {
			System.out.println("no todos son iguales");
		}*/
		
		//ejercicio ii
		
		/*int suma = 0;
		for (int i = 1; i <=20; i++) {
			int n1 = (int) (Math.random()*100);
			suma += n1;
			System.out.println(n1 + ",  ");
		}
		System.out.println("\n\nLa media es: " + (suma / 20));
		System.out.println("fin del programa"); */
		
		//ejercicio iii
		
		int maximo = 0; int contadoRepeteciones=0;
		System.out.println("mis valores son:");
		for (int i = 0; i < 40; i++) {
			int numero = (int) (Math.random()*40);
			System.out.println(numero);
			int contadoRepeticiones = 0;
			if (numero > maximo) {
				maximo = numero;
				contadoRepeticiones = 1;
			}else if (numero == maximo) {
				contadoRepeticiones++;
			}
		}
		System.out.println("\nel maximo valor introducido ha sido " +maximo);
	}

}
