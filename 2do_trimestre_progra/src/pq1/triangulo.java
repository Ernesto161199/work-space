package pq1;

public class triangulo extends forma2d {
private String estilo;
public triangulo(String estilo,double w) {
	super(w);
	this.estilo=estilo;

}
public String getEstilo() {
	return estilo;
}

public void setEstilo(String estilo) {
	this.estilo = estilo;
}
double area() {
	return getWidth() * getHeight() / 2;
}
void showStyle() {
	System.out.println("This is" + estilo);
}
}
