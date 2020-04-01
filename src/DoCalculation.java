/**
 * DoCalculation class file to do addition operation
 * 
 * @author Mohan
 *
 */
public class DoCalculation {
	
	private static int valueA=0;
	private static int valueB=0;
	private static int calculationResult=0;
	private static final String addition="Addition :";
	
	public static void main(String[] args) {
		valueA=100;
		valueB=50;
		calculationResult=addition(valueA,valueB);
		displayResult(calculationResult,addition);
	}

	private static int addition(int A, int B) {
		return A+B;
	}
	
	private static void displayResult(int result, String description) {
		System.out.println(description+result);
	}


}
