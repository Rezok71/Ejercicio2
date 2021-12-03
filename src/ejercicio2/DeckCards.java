package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };//esta linea y la anterior crean strings con valores introducidos

		ArrayList<Card> deck = new ArrayList<Card>(); //crea un nuevo arraylist "deck"

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) { // crea todas las cartas posibles para cada palo
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}

		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i); // baraja las cartas de la baraja anterior, dejándolas en posiciones aleatorias
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i)); // imprime las primeras 5 cartas de la baraja ya barajada.
		}

	}

}
