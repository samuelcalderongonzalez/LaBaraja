package clases;

import java.util.ArrayList;

public class Baraja {
	// Propiedades
	private ArrayList<Carta> lista_cartas;

	// Constructores
	public Baraja() {

		
	}

	public Baraja(int tipobaraja) {
		lista_cartas = new ArrayList<Carta>();
		if (tipobaraja == 1 || tipobaraja == 2) {
			for (int i = 1; i < (40 * tipobaraja) + 1; i++) {
				if (i < 41)
					this.lista_cartas.add(new Carta(i));
				else
					this.lista_cartas.add(new Carta(i - 40));
			}
		}
	}

	public Baraja(int tipobaraja, boolean barajar) {
		this.lista_cartas = new ArrayList<Carta>();
		if (tipobaraja == 1 || tipobaraja == 2) {
			for (int i = 1; i < (40 * tipobaraja) + 1; i++) {
				if (i < 41)
					this.lista_cartas.add(new Carta(i));
				else
					this.lista_cartas.add(new Carta(i - 40));
			}
		}
		ArrayList<Carta> aux = new ArrayList<Carta>();
		int con = this.lista_cartas.size();
		while(!this.lista_cartas.isEmpty()) {
			int random = (int)(Math.random()*con);			
			aux.add(this.lista_cartas.get(random));
			this.lista_cartas.remove(random);
			con--;
		}
		for (int i = 0; i < aux.size(); i++) {
			this.lista_cartas.add(aux.get(i));
		}
		
	}

	// Metodos
	public void Barajar() {
		ArrayList<Carta> aux = new ArrayList<Carta>();
		int con = this.lista_cartas.size();
		while(!this.lista_cartas.isEmpty()) {
			int random = (int)(Math.random()*con);			
			aux.add(this.lista_cartas.get(random));
			this.lista_cartas.remove(random);
			con--;
		}
		for (int i = 0; i < aux.size(); i++) {
			this.lista_cartas.add(aux.get(i));
		}
	}
	public void Cortar(int posicion) {
		ArrayList<Carta> aux = new ArrayList<Carta>();
		for (int i = 0; i < posicion; i++) {
			aux.add(this.lista_cartas.get(0));
			this.lista_cartas.remove(0);
		}
		for (int i = 0; i < posicion; i++) {
			this.lista_cartas.add(aux.get(i));
		}
	}
	
	public Carta robar() {
		Carta robada = new Carta(this.lista_cartas.get(0).getId());
		this.lista_cartas.remove(0);
		return robada;
	}

	public void insertaCartaFinal(int id_carta) {
		int aux = id_carta;
		this.lista_cartas.add(new Carta(aux));
	}

	public void insertaCartaPrincipio(int id_carta) {
		int aux = id_carta;
		this.lista_cartas.add(0, new Carta(aux));
	}

	public void insertaCartaFinal(Carta c) {
		this.lista_cartas.add(c);
	}

	public void insertaCartaPrincipio(Carta c) {
		this.lista_cartas.add(0, c);
	}

	public int getNumeroCartas() {
		int numero = this.lista_cartas.size();
		return numero;
	}

	public boolean isVacia() {
		if (this.lista_cartas.isEmpty())
			return true;
		else
			return false;
	}
}
