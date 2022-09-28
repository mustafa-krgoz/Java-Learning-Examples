
public class Overloading {
	
	public static int f(int a , int b) {
		System.out.print("1.Metot:");
		return a+b;
	}
	public static double f(int a , double b) {
		System.out.print("2.Metot:");
		return a+b;
	}
	public static double f(double a, double b, int c) {
		System.out.print("3.Metot:");
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		System.out.println(f(3,5));
		System.out.println(f(4,5.2));
		System.out.println(f(8, 3.3, 5));
		
	}

}
