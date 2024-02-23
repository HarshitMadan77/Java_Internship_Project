package pack;
import java.util.Scanner;

public class Problem_1 {
	public static int countDigits(int n) {
	    if (n == 0) {
	      return 1;
	    }
	    int count = String.valueOf(Math.abs(n)).length();
	    return count;
	  }

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Enter an integer: ");
	    int num = scan.nextInt();

	    System.out.println("Number of digits: " + countDigits(num));

	    scan.close();
	  }
}
