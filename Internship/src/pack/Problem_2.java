package pack;
import java.util.Scanner;

public class Problem_2 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Enter the net price including taxes: ");
	    double netPrice = scan.nextDouble();

	    System.out.print("Enter the tax rate: ");
	    double taxRate = scan.nextDouble();

	    double grossPrice = calculateGrossPrice(netPrice, taxRate);

	    System.out.println("Gross price before taxes: $" + grossPrice);

	    scan.close();
	  }
	public static double calculateGrossPrice(double netPrice, double taxRate) {

	    double grossPrice = netPrice / (1 + taxRate);
	    return grossPrice;
	  }
}
