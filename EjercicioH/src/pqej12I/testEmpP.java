package pqej12I;

public class testEmpP {

	public static void main(String[] args) {
		Empleado[] emps=new Empleado[5];
		emps[0]=new Empleado("pepe");
		Empleado e1=new Empleado("eva",54543);
		emps[1]=e1;
		Programador p1=new Programador("jc",222,"java","python");
		emps[2]=p1;
		Programador p2=new Programador("jc",221);
		emps[3]=p2;
		emps[4]=new Programador("maria",333,"php","prolog","java","c#","fortran");
		
		for (Empleado e:emps) {
			System.out.println(e);
		}
		/*for (int i=0;i<emps.length;i++) {
			System.out.println(emps[i]);
		}*/
		Programador[] misProgramadores=new Programador[4];
		misProgramadores[0]=p2;
		misProgramadores[1]=(Programador)emps[4];
		misProgramadores[2]=p1;
		misProgramadores[3]=new Programador("antonio",11,"java");
		System.out.println("lista de candidatos");
		for (String dato:Programador.mejoresCandidatos("php",misProgramadores)) {
			if (dato!=null)
			System.out.println(dato);
		}
		
		
	}

}
