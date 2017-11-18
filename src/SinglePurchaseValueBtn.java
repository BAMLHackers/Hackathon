import java.awt.Font;

public class SinglePurchaseValueBtn extends ValueBtn {

	private static Font FONT = new Font("Arial", Font.PLAIN, 30); 

	
	public SinglePurchaseValueBtn(HeaderValueType valueType) {
		super(valueType);
		
		// set text properties
		this.setFont(FONT);
	}
}
