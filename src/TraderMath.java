
public class TraderMath {

	public static Double calculatePercentageChange(Double v1, Double v2) {
		return (Math.abs(v2 - v1)/v1)*100;
	}
}
