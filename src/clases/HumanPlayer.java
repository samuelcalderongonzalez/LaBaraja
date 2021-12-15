package clases;

public class HumanPlayer extends AbstractPlayer {

	public HumanPlayer(String nombre, Mesa mesa) {
		super(nombre, mesa);

	}

	@Override
	public void jugarTurno() {

		
	}

	@Override
	public double getPuntos() {
		return this.puntos;
		
	}

	@Override
	public void setPuntos(double p) {
		this.puntos += p;
	}

	@Override
	public String getNombre() {
		return this.nombre;
		
	}
	

}
