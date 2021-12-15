package clases;

import java.util.ArrayList;

import enums.ModoJuego;

public abstract class AbstractGame {
	protected boolean finished;
	protected ArrayList<AbstractPlayer> jugadores;
	protected Mesa mesa;
	protected int ronda;
	protected ModoJuego modo;
	
	abstract void bienvenida();
	abstract void menuPrincipal();
	abstract AbstractPlayer nextTurno();
	abstract void start();
	
	void barajar() {
		
	}
	void finish() {
		
	}

}
