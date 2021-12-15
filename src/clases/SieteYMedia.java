package clases;

import java.util.ArrayList;


public class SieteYMedia extends AbstractGame {

	public SieteYMedia() {
		this.mesa = new Mesa();
		this.jugadores = new ArrayList<AbstractPlayer>();
	}

	@Override
	void bienvenida() {
		System.out.println("Bienvenido/a " + this.jugadores.get(0).nombre + " al juego de las 7 y media.");
		finished = false;
	}


	@Override
	AbstractPlayer nextTurno() {
		return null;
	}

	@Override
	void start() {

	}

	@Override
	void menuPrincipal() {

		
	}



}
