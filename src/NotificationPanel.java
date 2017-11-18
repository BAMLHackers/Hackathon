import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class NotificationPanel extends JPanel {
	
	// constructor
	public NotificationPanel() {
		this.setBackground(Color.GRAY);
		this.setSize(new Dimension(30, 600));
		//this.setLayout(new GridLayout());
		this.add(new Notification("Price has been reached!", "dfjhdfjdfjhdfjhdfhjfhjdfhjdfhjdfhjdfhjdfhfdhjdfghjdghdfjghjghjdjh"));
	}
	
}
