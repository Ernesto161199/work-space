import java.util.*;

public class bucles4_for_each {

	public static void main(String[] args) {
		// comprueba mail
		Scanner sc=new Scanner(System.in);
		
		
		int arroba=0;
		boolean punto=false;
		
		System.out.println("Introduce mail");
		
		String mail=sc.next();

		for(int i=0; i<mail.length();i++){
			
			if(mail.charAt(i)=='@') {
			
				arroba++;
			}
			
			if(mail.charAt(i)=='.') {
			
				punto=true;
			}
			
		}
		
		if(arroba==1 && punto==true) {
			System.out.println("ES CORRECTO");
		}else {
			System.out.println("NO ES CORRECTO");
		}
		
	}

}
