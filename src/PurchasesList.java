import java.util.ArrayList;

import javax.swing.JPanel;

public class PurchasesList extends JPanel {
	
	//ArrayList<SinglePurchaseRecord> obj = new ArrayList<String>();
	SinglePurchaseRecord s1 = new SinglePurchaseRecord();
	SinglePurchaseRecord s2 = new SinglePurchaseRecord();
	
	// constructor 
	public PurchasesList() {
		this.add(s1);
		this.add(s2);
	}
	
}
