package main;

import java.util.Scanner;

import clases.Baraja;
import clases.Carta;

public class Main {

	public static void main(String[] args) {

		jugar7ymedia();
	}

	public static void jugar7ymedia() {
		Baraja baraja = new Baraja(1, true);
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al juego de las 7 y media");
		boolean terminar = false;
		double puntuacion = 0;
		do {
			if (puntuacion < 7.5) {
				System.out.println("¿Qué desea hacer?   Su puntuación actual es: " + puntuacion
						+ "\n1. Coger Carta\t2. Plantarse");
				int elegir = Integer.parseInt(sc.nextLine());
				switch (elegir) {
				case 1:
					Carta aux = new Carta(baraja.robar().getId());
					System.out.println("Has sacado el " + aux.getNombreCarta());
					puntuacion += aux.getValor7ymedia();
					break;
				case 2:
					System.out.println("Se ha plantado con " + puntuacion + " puntos");
					terminar = true;
					break;
				default:
					System.out.println("No se ha reconocido la opción");
					break;
				}
			} else {
				System.out.println("Se ha pasado");
				terminar = true;
			}
		} while (!terminar);
		sc.close();
	}
}
