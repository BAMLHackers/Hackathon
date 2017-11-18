import java.awt.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.*;

public class HeaderValue extends JButton {
	// statics
	private static Font FONT = new Font("Arial", Font.PLAIN, 60); 
	private static Color DEFAULT_TEXT_COLOUR = Color.WHITE;
	private static Color POSITIVE_TEXT_COLOUR = Color.GREEN;
	private static Color NEGATIVE_TEXT_COLOUR = Color.RED;
	private static String ROUNDING_DECIMAL_PLACES = ".##";
	
	private Double value = 0.0;
	private HeaderValueType valueType;
	
	// constructor
	public HeaderValue(HeaderValueType valueType) {
		
		this.valueType = valueType;
		
		// set text properties
		this.setFont(FONT);
		this.setForeground(DEFAULT_TEXT_COLOUR);
		
		// make transparent
		this.setContentAreaFilled(false);
		this.setBorderPainted(false);
	}
	
	public void update(Double newValue) {
		if (valueType != HeaderValueType.PRICE_BOUGHT_AT_GBP) {
			this.setDifferentialColour(newValue);	
		}
		
		this.value = newValue;
		this.setText(newValue);
	}
	
	
	public void setText(Double value) {
		DecimalFormat df = new DecimalFormat(ROUNDING_DECIMAL_PLACES);

		// default is HALF_EVEN
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		String strValue = df.format(value);
		
		 switch (valueType) {
         	case CURRENT_PRICE_GBP: 
         	case PRICE_BOUGHT_AT_GBP:
        	 		strValue = "£" + strValue;
        	 		break;
                 
         	case PERCENTAGE_PROFIT_MARGIN:
        	 		strValue = strValue + "%";
        	 		break;
     }
		this.setText(strValue);
	}
	
	private void setDifferentialColour(Double newValue) {
		if (newValue > value) {
			this.setForeground(POSITIVE_TEXT_COLOUR);
		} else if (newValue < value) {
			this.setForeground(NEGATIVE_TEXT_COLOUR);
		} else {
			this.setForeground(DEFAULT_TEXT_COLOUR);
		}
	}
	
	public Double getValue() {
		return value;
	}
}
