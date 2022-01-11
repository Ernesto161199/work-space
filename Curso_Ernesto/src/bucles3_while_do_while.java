import java.util.Scanner;

public class bucles3_while_do_while {

	public static void main(String[] args) {
		// nuestro programa nos pregunta si somos mujer o hombre, peso ideal
		
		Scanner sc=new Scanner(System.in);
		
		String genero="";
		int altura = Integer.parseInt(genero);
		
		
		do {
			
			System.out.println("introduce tu genero");
			
			genero=sc.next();
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
			System.out.println("Introduce la altura en cm ");
			
			altura=sc.nextInt();
			
			int pesoideal=0;
			
			if(genero.equalsIgnoreCase("H")) {
				pesoideal=altura-110;
				
			}
			else if (genero.equalsIgnoreCase("M")) {
				pesoideal=altura-120;
				
			}
			System.out.println("TU PESO IDEAL ES " +pesoideal );
		}			
}


