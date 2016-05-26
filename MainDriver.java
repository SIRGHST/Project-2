
public class MainDriver {

	static final int HANDS = 52;
	
	public static void main(String[] args) {

		Deck player1 = new Deck();
		Deck player2 = new Deck();
		
		int player1Score = 0, player2Score = 0;
		
		Card c1 = player1.draw();  //player 1 draw
		Card c2 = player2.draw();  // player 2 draw
		
		for(int i = 0; i < HANDS; i++){
			System.out.println("P1 has drawn: " + player1.draw() +" and P2: " + player2.draw());
			
			if(c1.winner(c2)){
			   System.out.println("We have a WINNER: " + c1.toString());  //if card 1 is higher
				player1Score++;
		    } else{
		    	System.out.println("We have a WINNER: " + c2.toString()); //if card 2 is higher
		    	 player2Score++;
		    }
			 //draw again
			 c1 = player1.draw();  
			 c2 = player2.draw();  
		}	 
		
		
		System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
		
		//System.out.println(player1.draw().toString());
		//System.out.println(player1.Deck.length);
		
	}

}
