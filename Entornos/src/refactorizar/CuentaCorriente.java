package refactorizar;
public class CuentaCorriente {

	private static final int Zero = 0;
	/**
	 * 
	 */
	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the zero
	 */
	public static int getZero() {
		return Zero;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CuentaCorriente() {
	}

	public CuentaCorriente(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}

	public void asignarNombre(String nom) {
		nombre = nom;
	}

	public String getNombre() {
		return nombre;
	}

	public double estado() {
		return saldo;
	}

	public void ingresar(double cantidad) throws Exception {
		if (cantidad < Zero) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		getSaldo(saldo + cantidad);
	}

	public void retirar(double cantidad) throws Exception {
		if (cantidad < Zero) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		getSaldo(saldo - cantidad);
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public void getSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInterés) {
		this.tipoInteres = tipoInterés;
	}
}
