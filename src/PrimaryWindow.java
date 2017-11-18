import java.awt.*;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;

public class PrimaryWindow extends JFrame {
	Random rand = new Random();
	HeaderValue currentHoldings;
	HeaderValue currentSalePrice;
	HeaderValue salePriceMargin; 
	Header h = new Header();
	//PurchasesList ss = new PurchasesList();
	
	// constructor
	public PrimaryWindow() {
		constructWindow();
	}
	
	private void constructWindow() {	    
		// build content pane
		Container contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout()); 
		
		// north 
		contentPane.add(h, BorderLayout.NORTH);
		
		// center
		//contentPane.add(ss, BorderLayout.CENTER);
		
		// west 
		contentPane.add(new NotificationPanel(), BorderLayout.WEST);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setContentPane(contentPane);
		this.pack();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
	}
	
	// main
	public static void main(String[] args) {
		PrimaryWindow pw = new PrimaryWindow();
		pw.h.test();
		//pw.ss.s1.test();
		//pw.ss.s2.test();
	}
}
