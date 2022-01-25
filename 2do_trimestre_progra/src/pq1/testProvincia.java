package pq1;

public class testProvincia {

	public static void main(String[] args) {
		provincia p1=new provincia("madrid","madrid",5456,5589);
		System.out.println(p1);
		System.out.println("la densidad es "+p1.densidad());
		p1.muestra();
		provinciaCostera pc=new  provinciaCostera("almeria", "andalucia", 5000 ,1000 , 200);
		System.out.println(pc);
		pc.muestra();
		provincia[] ps=new provincia[2];
		ps[0]=p1;
		ps[1]=pc;
		for (provincia p:ps) {
			p.muestra();
		}
		pc.getKmsCosta();
	}

}
