import java.util.*;
public class matrices2_arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int[] matriz_aleatorios=new int[150];
		
		for (int i=0; i<matriz_aleatorios.length; i++) {
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
			
		}
		
		for (int numeros:matriz_aleatorios) {
			System.out.print(numeros + " ");
			
		}
		
		
		//String [] paises= {"España","Mexico","colombia","peru","chile","argentina","ecuador","venezuela"};

		/*for(int i=0; i<paises.length; i++) {
			System.out.println("Pais " + (i+1)+ " " + paises[i] );
			
		}*/
		

		
	}

}
