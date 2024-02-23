package pack;
import java.util.Scanner;

public class Problem_5 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Enter the income: ");
	    double income = scan.nextDouble();

	    double tax = calculateTax(income);
		
	    System.out.println("Income tax for the income $" + income + " is $" + tax);

		scan.close();
	}
	public static double calculateTax(double income) {
		    
		double tax = 0;

		if (income <= 250000) {
			tax = 0;
		} 
		else if (income <= 500000) {
			tax = (income - 250000) * 0.1;
		} 
		else if (income <= 1000000) {
			tax = 25000 + (income - 500000) * 0.2;
		} 
		else {
			tax = 125000 + (income - 100000) * 0.3;
		}
		    return tax;
	}
}
