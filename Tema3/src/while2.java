import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadorIntentos = 10;
		int numUsu;
		int numMaq = (int) (Math.random() * 100 + 1);
		do {
		System.out.println("Acierta un num del 1 al 100");
		numUsu = sc.nextInt();
		contadorIntentos--;
		if (numMaq == numUsu) {
			System.out.println("has acertado el nª era " + numMaq + " en el numero de inteto " + (10 - contadorIntentos));
		} else if (numMaq > numUsu) {
			System.out.println("fallaste, te quedaste por debajo ");
		} else {
			System.out.println("fallaste, te quedaste por encima");
		}
		}while (contadorIntentos>0 && numMaq!=numUsu);
		System.out.println("fin del programa");
	}
}


