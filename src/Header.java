import java.awt.Color;
import java.awt.GridLayout;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JPanel;

public class Header extends JPanel {
	private HeaderValueBtn currentHoldings;
	private HeaderValueBtn currentSalePrice;
	private HeaderValueBtn salePriceMargin;
	
	// constructor
	public Header() {
		this.setBackground(Color.BLACK);
		this.setLayout(new GridLayout(1,3));
		currentHoldings = new HeaderValueBtn(HeaderValueType.PRICE_BOUGHT_AT_GBP); 
		currentSalePrice = new HeaderValueBtn(HeaderValueType.CURRENT_PRICE_GBP); 
		salePriceMargin = new HeaderValueBtn(HeaderValueType.PERCENTAGE_PROFIT_MARGIN); 
		
		this.add(currentHoldings);
		this.add(salePriceMargin);
		this.add(currentSalePrice); 
	}

	
	public void test() {
		currentHoldings.update(4650.00);
		
		for (int i = 0; i< 2000000; i++) {

			double y = ThreadLocalRandom.current().nextDouble(4895, 5000);

			currentSalePrice.update(y);
			salePriceMargin.update(TraderMath.calculatePercentageChange(currentHoldings.getValue(), y));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}
	
	public HeaderValueBtn getCurrentHoldings() {
		return currentHoldings;
	}
}
