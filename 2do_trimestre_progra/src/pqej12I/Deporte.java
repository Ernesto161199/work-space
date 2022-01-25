package pqej12I;

public class Deporte {

	private String nombre;
	private int numeroDeEquipos;
	private int numeroDeJugadoresEquipos;
	
	public Deporte(String nombre, int numeroDeEquipos, int numeroDeJugadoresEquipos) {
		super();
		this.nombre = nombre;
		this.numeroDeEquipos = numeroDeEquipos;
		this.numeroDeJugadoresEquipos = numeroDeJugadoresEquipos;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDeEquipos() {
		return numeroDeEquipos;
	}

	public void setNumeroDeEquipos(int numeroDeEquipos) {
		this.numeroDeEquipos = numeroDeEquipos;
	}

	public int getNumeroDeJugadoresEquipos() {
		return numeroDeJugadoresEquipos;
	}

	public void setNumeroDeJugadoresEquipos(int numeroDeJugadoresEquipos) {
		this.numeroDeJugadoresEquipos = numeroDeJugadoresEquipos;
	}
	
	

}
