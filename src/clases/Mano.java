package clases;



public class Mano extends Baraja {
	public Mano() {
		super();
	}
	void listarCartas() {
		for(Carta c: this.lista_cartas) {
			System.out.println(c);
		}
	}

}
