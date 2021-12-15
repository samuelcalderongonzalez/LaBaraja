package clases;

public class Carta {
	// Propiedades
	private int numero;
	private int palo;

	// Constructores
	public Carta(int numero, int palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	public Carta(int id) {
		super();
		if (id != 10 && id != 20 && id != 30 && id != 40)
			this.numero = id % 10;
		else if (id == 10 || id == 20 || id == 30 || id == 40)
			this.numero = 10;
		this.palo = (id - 1) / 10;
	}

	// M�todos
	public int getId() {
		int id = (this.numero) + (this.palo * 10);
		return id;
	}

	public int getNumero() {
		return this.numero;
	}

	public int getPalo() {
		return this.palo;
	}

	public String getNombreNumero() {
		String nombreNumero;
		switch (this.numero) {
		case 1:
			nombreNumero = "As";
			break;
		case 2:
			nombreNumero = "Dos";
			break;
		case 3:
			nombreNumero = "Tres";
			break;
		case 4:
			nombreNumero = "Cuatro";
			break;
		case 5:
			nombreNumero = "Cinco";
			break;
		case 6:
			nombreNumero = "Seis";
			break;
		case 7:
			nombreNumero = "Siete";
			break;
		case 8:
			nombreNumero = "Sota";
			break;
		case 9:
			nombreNumero = "Caballo";
			break;
		case 10:
			nombreNumero = "Rey";
			break;
		default:
			nombreNumero = "No se ha podido reconocer el numero";
			break;
		}
		return nombreNumero;
	}

	public String getNombrePalo() {
		String nombrePalo;
		switch (this.palo) {
		case 0:
			nombrePalo = "Oros";
			break;
		case 1:
			nombrePalo = "Copas";
			break;
		case 2:
			nombrePalo = "Espadas";
			break;
		case 3:
			nombrePalo = "Bastos";
			break;
		default:
			nombrePalo = "No se ha podido reconocer el palo, asegurate de que el n�mero introducido es entre 0 y 3";
			break;
		}
		return nombrePalo;
	}

	public String getNombreCarta() {
		String nombreNumero;
		String nombrePalo;
		switch (this.numero) {
		case 1:
			nombreNumero = "As";
			break;
		case 2:
			nombreNumero = "Dos";
			break;
		case 3:
			nombreNumero = "Tres";
			break;
		case 4:
			nombreNumero = "Cuatro";
			break;
		case 5:
			nombreNumero = "Cinco";
			break;
		case 6:
			nombreNumero = "Seis";
			break;
		case 7:
			nombreNumero = "Siete";
			break;
		case 8:
			nombreNumero = "Sota";
			break;
		case 9:
			nombreNumero = "Caballo";
			break;
		case 10:
			nombreNumero = "Rey";
			break;
		default:
			nombreNumero = "No se ha podido reconocer el numero";
			break;
		}
		switch (this.palo) {
		case 0:
			nombrePalo = "Oros";
			break;
		case 1:
			nombrePalo = "Copas";
			break;
		case 2:
			nombrePalo = "Espadas";
			break;
		case 3:
			nombrePalo = "Bastos";
			break;
		default:
			nombrePalo = "No se ha podido reconocer el palo, asegurate de que el n�mero introducido est� entre 0 y 3";
			break;
		}
		String nombreComplejo = nombreNumero + " de " + nombrePalo;

		return nombreComplejo;
	}

	public int getValorTute() {
		int valorTute;
		if (this.numero == 1)
			valorTute = 11;
		else if (this.numero == 3)
			valorTute = 10;
		else if (this.numero == 8)
			valorTute = 2;
		else if (this.numero == 9)
			valorTute = 3;
		else if (this.numero == 10)
			valorTute = 4;
		else
			valorTute = this.numero;
		return valorTute;
	}

	public int getValorMus() {
		int valorMuse;
		if (this.numero == 1 || this.numero == 2)
			valorMuse = 1;
		else if (this.numero == 3 || this.numero == 8 || this.numero == 9 || this.numero == 10)
			valorMuse = 10;
		else
			valorMuse = this.numero;
		return valorMuse;
	}

	public double getValor7ymedia() {
		double valor7;
		if (this.numero == 8 || this.numero == 9 || this.numero == 10)
			valor7 = 0.5;
		else
			valor7 = (double) this.numero;
		return valor7;
	}

}
