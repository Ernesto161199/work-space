package aves;

public class Ave {
	private String nombreVulgar;
	private String nombreCientifico;
	int numeroIndividuos;
	
	public Ave(String nombreVulgar, String nombreCientifico, int numeroIndividuos) {
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		if(numeroIndividuos>0) {
			this.numeroIndividuos = numeroIndividuos;
		}
		
	}
	void incrementarNumeroIndividuos(int n) {
	if (n>0) {
	numeroIndividuos+=n;
	//System.out.println("el numero de individuos es: "+numeroIndividuos);
	}else {
		//System.out.println("Entrada incorrecta");
	}
	}
	
	void decrementoNumeroIndividuos(int n) {
		if(n>0) {
	if(numeroIndividuos>=n) {
		numeroIndividuos-=n;
		
	}else {
		numeroIndividuos=0;
	}
		//System.out.println("el numero de individuos es: "+numeroIndividuos);
		}else {
			//System.out.println("Entrada incorrecta");
		}
	}
	
	public boolean peligroExtincion() {
		if (numeroIndividuos<100) {
			return true;
		}else {
			return false;
		}
			
	}
	public String getNombreVulgar() {
		return nombreVulgar;
	}
	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	
	@Override
	public String toString() {
		return "Ave [nombreVulgar=" + nombreVulgar + ", nombreCientifico=" + nombreCientifico + ", numeroIndividuos="
				+ numeroIndividuos + "]";
	}
	
	
}
