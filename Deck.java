import java.util.Random;



public class Deck {
    
	
	public Card[] DeckofCards = new Card[52]; //array of type card
	
	
	
	public Deck() {
		
	
		  int i = 0; 
		
		for(CardSuit s : CardSuit.values() ){     //iterates through CardSuit and store in s
			for(CardValue v : CardValue.values()){// iterates through CardValue and store in v
				DeckofCards[i] = new Card(s, v); 
				i++;
			}
			
		}
		
		/*
		for(int j = 0; j < 52; j++){
			System.out.println(Deck[j]);
			
		}
		*/
	}


	
	
	public Card draw() {
		
		int i = 51;
		Random card_obj = new Random();
	    
		int randomNum =  card_obj.nextInt(51 - 0 + 1) + 0;
		Card temp = DeckofCards[randomNum];
		DeckofCards[randomNum] = DeckofCards[i];
		DeckofCards[i] = null;
		i--;
		return temp;
		
		
	
	}
}
