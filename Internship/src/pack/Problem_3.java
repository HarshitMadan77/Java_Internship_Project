package pack;
import java.util.Scanner;

public class Problem_3 {
	public static int findLarger(int num1, int num2) {
	    return (num1 > num2) ? num1 : num2;
	}
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Enter the first number: ");
		    int num1 = scan.nextInt();

		System.out.print("Enter the second number: ");
		    int num2 = scan.nextInt();

		int largerNumber = findLarger(num1, num2);
	    System.out.println("The larger number is: " + largerNumber);

		scan.close();
	}
}
