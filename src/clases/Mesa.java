package clases;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
	private Baraja baraja;

	public Mesa() {
		this.baraja = new Baraja(1, true);
	}

	public Baraja getBaraja() {
		return this.baraja;
	}
	
	public Carta robarCartaDeBaraja() {
		return this.baraja.robar();
		}
	public List<Carta> robarVariasCartas(int n) {
		ArrayList<Carta> aux = new ArrayList<Carta>();
		for(int i = 0; i < n; i++) {
			aux.add(this.baraja.robar());
		}
		return aux;
	}
	public void addCartaABaraja(Carta c) {
		this.baraja.insertaCartaFinal(c);
	}

	

}
