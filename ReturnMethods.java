
public class ReturnMethods {
	
	public static int pow(int number1, int number2) {
		int result = 1;
		for(int i = 1; i<= number2; i++) {
			result*=number1;
		}
		return result;
	}

	public static void main(String[] args) {
		int r1 = pow(10,2);
		System.out.println("Cevap:" + r1);
		int r2 = pow(4,3);
		System.out.println("Cevap:" + r2);
	}

}
