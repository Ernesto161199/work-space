import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		//ejemplo de clase hecho
		/*Scanner sc=new Scanner(System.in);
		System.out.println("introduce un nombre");
		String nombre=sc.next();
		
		for (int i=0;i<nombre.length();i++) {
			System.out.println(nombre.charAt(i));
			
		}*/
	
		Scanner sc= new Scanner(System.in);
        int i;
        char letra;
        String nombre="asdadas";
        System.out.println(nombre.replace('f', 'a'));
        System.out.println("Press S to stop.");
        for (i = 0; (letra=sc.next().charAt(0)) != 'S'; i++) 
        {
            System.out.println("Pass #" + i);
        }
       System.out.println("fin");
	}

}
