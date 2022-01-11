package ED;

public class Animal implements InterfaceAnimal {

	private String color;
	private String tipo;
	private int patas;
	
	/**
	 * @return the color
	 */
	@Override
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	@Override
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the tipo
	 */
	@Override
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	@Override
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the patas
	 */
	@Override
	public int getPatas() {
		return patas;
	}
	/**
	 * @param patas the patas to set
	 */
	@Override
	public void setPatas(int patas) {
		this.patas = patas;
	}
	


}
