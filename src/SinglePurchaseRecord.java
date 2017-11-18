import java.awt.Color;
import java.awt.GridLayout;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JPanel;

public class SinglePurchaseRecord extends JPanel {
	
	private SinglePurchaseValueBtn currentHoldings;
	private SinglePurchaseValueBtn currentSalePrice;
	private SinglePurchaseValueBtn salePriceMargin;
	
	// constructor
	public SinglePurchaseRecord() {
		this.setBackground(Color.GRAY);
		this.setLayout(new GridLayout(1,3));
		currentHoldings = new SinglePurchaseValueBtn(HeaderValueType.PRICE_BOUGHT_AT_GBP); 
		currentSalePrice = new SinglePurchaseValueBtn(HeaderValueType.CURRENT_PRICE_GBP); 
		salePriceMargin = new SinglePurchaseValueBtn(HeaderValueType.PERCENTAGE_PROFIT_MARGIN); 
		
		
		this.add(currentHoldings);
		this.add(salePriceMargin);
		this.add(currentSalePrice);
		
		test();
	}
	private Double calculatePercentageChange(Double v1, Double v2) {
		return (Math.abs(v2 - v1)/v1)*100;
	}
	
	public void test() {
		currentHoldings.update(4650.00);
		
		for (int i = 0; i< 20; i++) {

			double  y = ThreadLocalRandom.current().nextDouble(4895, 5000);

			currentSalePrice.update(y);
			salePriceMargin.update(calculatePercentageChange(currentHoldings.getValue(), y));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
	
	public SinglePurchaseValueBtn getCurrentHoldings() {
		return currentHoldings;
	}

}
