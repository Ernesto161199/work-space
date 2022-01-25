package pqej12I;

public class Caracal extends Animal {

	private String habitat; 

	public Caracal(String categoria, int patas, String habitat) {
		super(categoria, patas);
	    this.habitat=habitat;
	}
	@Override
	public void comoSueno() {
		System.out.println("miau miau");
	}
//get
	public String getHabitat() {
		return habitat;
	}
//set	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	@Override
	public String toString() {
		return super.toString()+"Caracal [habitat=" + habitat + "]";
	}
		



}
