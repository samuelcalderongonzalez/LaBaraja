package clases;

public abstract class AbstractPlayer {
	protected String nombre;
	protected double puntos;
	protected Mano mano;
	protected Mesa mesa;
	
	
	public AbstractPlayer(String nombre, Mesa mesa) {
		super();
		this.nombre = nombre;
		this.puntos = 0;
		this.mano = new Mano();
		this.mesa = mesa;
	}



	public abstract void jugarTurno();
	public abstract double getPuntos();
	public abstract void setPuntos(double p);
	public abstract String getNombre();
}
