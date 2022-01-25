package pq1;

public class DemoProtected {
	public void mostrarP() {
		System.out.println("estudio java");
	}
	
	public String xx() {
		mostrarP();
		DemoDefault d=new DemoDefault();
		d.mostrarD();
		String salida=" con gusto";
		return salida;
	}
}
