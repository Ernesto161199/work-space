package pqej12I;

public class Empleado {
private String nombre;
private int tf;

public Empleado(String nombre, int tf) {
	this.nombre=nombre;
	this.tf=tf;
}
public Empleado(String nombre) {
	this.nombre=nombre;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nuevo) {
	nombre=nuevo;
}
public int getTf() {
	return tf;
}
public void setTf(int tf) {
	this.tf = tf;
}
@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", tf=" + tf + "]";
}

}
