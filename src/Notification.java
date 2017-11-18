import java.awt.*;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class Notification extends JPanel {
	private static Font TITLE_FONT = new Font("Arial", Font.PLAIN, 20); 
	private static Font DESC_FONT = new Font("Arial", Font.PLAIN, 15); 
	
	String title;
	String description;
	String timestamp;
	
	// constructor 
	public Notification(String title, String description) {
		this.title = title;
		this.description = description;
		this.timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		constructNotification();
	}
	
	public void constructNotification() {
		this.setBackground(Color.ORANGE);
		this.setLayout(new BorderLayout());
		
		JLabel titleLbl = new JLabel(title);
		titleLbl.setFont(TITLE_FONT);
		
		JLabel descLbl = new JLabel(description);
		descLbl.setFont(DESC_FONT);
		
		JLabel timeLbl = new JLabel(description);
		descLbl.setFont(DESC_FONT);
		this.add(titleLbl, BorderLayout.NORTH);
		this.add(descLbl, BorderLayout.SOUTH);
	}
}