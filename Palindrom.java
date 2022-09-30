import java.util.Scanner;

public class Palindrom {

	
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		  public static void checkPalindrome(String s)
		  {
		    String reverse = new StringBuffer(s).reverse().toString();
		    if (s.equals(reverse))
		      System.out.println("Palindromdur");
		  
		    else
		      System.out.println("Palindrom Deðildir ");
		  }
		  
		  public static void main (String[] args)
		          
		  {
		    checkPalindrome("ada");
		  }
	}

