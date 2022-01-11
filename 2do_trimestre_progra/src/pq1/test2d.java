package pq1;

public class test2d {
	
	public static void main(String[] args) {
	forma2d miforma=new forma2d(3.67);
	miforma.setWidth(12.5);
	miforma.setHeight(1.3);
	miforma.showDim();
	triangulo t1=new triangulo("doble continuo",2.4,2.1);
	t1.setWidth(2.4);
	t1.setHeight(2.1);
	t1.setEstilo(" doble continuo");
	t1.showDim();
	System.out.println(t1.area());
	t1.showStyle();
	}

}
