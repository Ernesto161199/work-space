package pqej12I;

public class Animal {
private String categoria;
private int patas;
public Animal(String categoria,int patas) {
	this.categoria=categoria;
	this.patas=patas;
}
public Animal(String categoria) {
	this.categoria=categoria;
	this.patas=0;
}
//get
public String getCategoria() {
	return categoria;
}
//set
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
//get
public int getPatas() {
	return patas;
}
//set
public void setPatas(int patas) {
	this.patas = patas;
}
public void comoSueno() {
	System.out.println("todavia no lo se");
}

@Override
public String toString() {
	return "Animal [categoria=" + categoria + ", patas=" + patas + "]";
}
}
