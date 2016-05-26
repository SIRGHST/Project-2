
public class CardGui {

	setTitle("Card Data Set");
	setSize(300,200); // default size is 0,0
	setLocation(10,200); // default is 0,0 (top left corner)

	// Window Listeners
	addWindowListener(new WindowAdapter() {
	  	public void windowClosing(WindowEvent e) {
		   System.exit(0);
	  	} //windowClosing
	} );
  } 

  public static void main(String[] args) {
    JFrame f = new CardGui();
    f.show();
  } //REDO








}
