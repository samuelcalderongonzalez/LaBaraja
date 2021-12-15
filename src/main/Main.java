package main;

import java.util.Scanner;

import clases.AbstractPlayer;
import clases.CPUPlayer;
import clases.Carta;
import clases.HumanPlayer;
import clases.Mesa;

public class Main {

	public static void main(String[] args) {
		jugar7ymedia();

	}

	public static void jugar7ymedia() {
		Mesa mesa = new Mesa();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Cual es su nombre?: ");
		String nombre = sc.nextLine();
		AbstractPlayer jugador1 = new HumanPlayer(nombre, mesa);
		System.out.println("Bienvenido " + jugador1.getNombre());
		System.out.println("Elija el modo de juego:\n1. Solitario\t2. UnoVSPCU");
		int modojuego = Integer.parseInt(sc.nextLine());
		boolean terminar = false;
		boolean cpuperder = false;
		boolean perder = false;

		if (modojuego == 1) {
			do {
				if (jugador1.getPuntos() <= 7.5) {
					System.out.println("¿Qué desea hacer?   Su puntuación actual es: " + jugador1.getPuntos()
							+ "\n1. Coger Carta\t2. Plantarse");
					int elegir = Integer.parseInt(sc.nextLine());
					switch (elegir) {
					case 1:
						Carta aux = new Carta(mesa.getBaraja().robar().getId());
						System.out.println("Has sacado el " + aux.getNombreCarta());
						jugador1.setPuntos(aux.getValor7ymedia());
						break;
					case 2:
						System.out.println("Se ha plantado con " + jugador1.getPuntos() + " puntos");
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
		} else if (modojuego == 2) {
			AbstractPlayer cpu = new CPUPlayer("cpu", mesa);
			do {
				if (jugador1.getPuntos() <= 7.5) {
					System.out.println("¿Qué desea hacer?   Su puntuación actual es: " + jugador1.getPuntos()
							+ "\n1. Coger Carta\t2. Plantarse");
					int elegir = Integer.parseInt(sc.nextLine());
					switch (elegir) {
					case 1:
						Carta aux = new Carta(mesa.getBaraja().robar().getId());
						System.out.println("Has sacado el " + aux.getNombreCarta());
						jugador1.setPuntos(aux.getValor7ymedia());
						break;
					case 2:
						System.out.println("Se ha plantado con " + jugador1.getPuntos() + " puntos");
						terminar = true;
						break;
					default:
						System.out.println("No se ha reconocido la opción");
						break;
					}

				}
				else if (jugador1.getPuntos() > 7.5) {
					terminar = true;
					System.out.println("Ha perdido");
					perder = true;
				}

				if (!(jugador1.getPuntos() > 7.5)) {
					if (cpu.getPuntos() <= 4) {
						Carta aux1 = new Carta(mesa.getBaraja().robar().getId());
						System.out.println("CPU ha sacado el " + aux1.getNombreCarta());
						cpu.setPuntos(aux1.getValor7ymedia());
					} else if (cpu.getPuntos() > 4){
						System.out.println("CPU se ha plantado con " + cpu.getPuntos() + " puntos");
						terminar = true;
					}
					if (cpu.getPuntos() > 7.5) {
						System.out.println("La CPU se ha pasado, ha ganado");
						terminar = true;
						cpuperder = true;
					}
				}
			} while (!terminar);
			if(!(perder && cpuperder)) {
				if(cpu.getPuntos() > jugador1.getPuntos())
					System.out.println("Ha perdido con " + jugador1.getPuntos() + " puntos frente a " + cpu.getPuntos() + " puntos");
				else
					System.out.println("Ha ganado con " + jugador1.getPuntos() + " puntos frente a " + cpu.getPuntos() + " puntos");
			}
			
		}
	}
}
