package pq1;

public class test_Demo {
	public static void main(String[] args) {
		DemoPrivate dp=new DemoPrivate();
		System.out.println(dp.xx());
		DemoProtected dpro=new DemoProtected();
		dpro.mostrarP();
	}

}
