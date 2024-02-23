package pack;
import java.util.Scanner;

public class Problem_9 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Enter an integer: ");
	    int num = scan.nextInt();

	    boolean isSpecial = isTwoDigitSpecialInteger(num);
	
	    if (isSpecial) {
	      System.out.println(num + " is a two-digit special integer.");
	    } 
	    else {
		  System.out.println(num + " is not a two-digit special integer.");
		}
	    scan.close();
	}
	public static boolean isTwoDigitSpecialInteger(int num) {
	    if (num < 10 || num > 99) {
	      return false;
	    }

	    int tensDigit = num / 10;
	    int onesDigit = num % 10; 

	    int sum = tensDigit + onesDigit;

	    int product = tensDigit * onesDigit;

	    return (sum + product) == num;
	}
}
