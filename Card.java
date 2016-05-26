
public class Card {

	private   CardSuit cardsuit;
	private   CardValue cardvalue;

	
	
	public String toString() {
		
		return this.getValue() + " of " + this.getSuit(); // returns formatted string
	
	}
	//Card Constructor sets initial value for the suits and values
	Card(CardSuit card_suit, CardValue card_val){
		
		this.cardsuit = card_suit;
		this.cardvalue = card_val;
	}
	
	
	 public  CardSuit getSuit() {                //gets suit value
		
		return cardsuit;
	}


	 public CardValue getValue(){ 				// gets card value
		
		return cardvalue;
	}
	
	/* Accepts a card object
	 * as an argument and return a
	 * boolean value  indicating
	 * whether  the first card value(the target of the method call)
	 * is higher than the second card(argument of method call)
	 * */
	
	public boolean winner(Card c) {
		
		if(this.getValue().ordinal() > c.getValue().ordinal()){ //if first card is higher than second return true
		   return (true);
		}
		else if (c.getValue().ordinal()  <  this.getValue().ordinal()){ //else it returns false
			return (false);
		}
		   
		if(this.getValue().ordinal() == c.getValue().ordinal()) {// if both cards are equal
		  if(this.getSuit().ordinal() > c.getSuit().ordinal()){   //then compare suits
			  return (true);
		  }
		}   return (false);
		
		
	}		
	
}
