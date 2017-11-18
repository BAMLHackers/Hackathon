import java.awt.Color;
import java.awt.Font;

public class HeaderValueBtn extends ValueBtn {

	private static Font FONT = new Font("Arial", Font.PLAIN, 60); 

	
	public HeaderValueBtn(HeaderValueType valueType) {
		super(valueType);
		
		// set text properties
		this.setFont(FONT);
	}
}
