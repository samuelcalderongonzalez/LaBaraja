package clases;

public class CPUPlayer extends AbstractPlayer {

	public CPUPlayer(String nombre, Mesa mesa) {
		super(nombre, mesa);

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
		
		return null;
	}

	@Override
	public void jugarTurno() {

		
	}

}
