import java.util.Date;
public class TestDate {

	public static void main(String[] args) {
		
		java.util.Date date = new java.util.Date();
		System.out.println("The elapsed time since  Jan1, 1970 is " + date.getTime() + " miliseconds");
		System.out.println(date.toString());

	}

}
