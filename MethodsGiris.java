
public class MethodsGiris {

	public static void main(String[] args) {
		System.out.print("Birinci Methodun Cevabý:");
		f(4);
		System.out.print("Ýkinci Methdun Cevabý:");
		f(6);
		
		pow(2,6);
		pow(3,2);

	}
	public static void f(int x) {
		int result = (x+2)*6;
		System.out.println(result);
		
	}
	public static void pow(int number1, int number2) {
		int result = 1;
		for(int i = 1; i<= number2; i++) {
			result*=number1;
		}
		System.out.println("Cevap:" + result);
	}

}
