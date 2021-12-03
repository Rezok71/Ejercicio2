package ejercicio2;

public class Card {

	public String suit; //crea 2 Strings "suit" y "value"
	public String value;
	
	public Card (String suit, String value) {
		this.suit = suit;//llama a el String suit y le da el valor suit, al igual que a value justo debajo
		this.value = value;
	}
	
	public String toString () {
		return (this.suit+"-"+this.value); //devuelve el valor de ambos String
	}
}
