package pack;
import java.util.Scanner;

public class Problem_7 {
	public static double compoundedInflation(double rate, int years) {
	    rate = rate / 100;
	    double compoundedRate = Math.pow((1 + rate), years);
	    return compoundedRate;
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.print("Enter the rate of retail inflation (in percentage): ");
		double rate = scan.nextDouble();
		    
		System.out.print("Enter the number of years: ");
		int years = scan.nextInt();

		double compoundedRate = compoundedInflation(rate, years);
		System.out.printf("The compounded retail inflation at the end of %d years will be %.2f = %.2f%%.", years,
		compoundedRate, (compoundedRate - 1) * 100);

		scan.close();
	}
}