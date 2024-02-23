package pack;
import java.util.Scanner;

public class Problem_8 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Enter the number of seconds: ");
	    int seconds = scan.nextInt();
		
	    String res = convertSeconds(seconds);
		System.out.println(res);

		scan.close();
	}
	public static String convertSeconds(int seconds) {
		int days = seconds / (24 * 3600);
			seconds = seconds % (24 * 3600);
		    
		int hours = seconds / 3600;
			seconds %= 3600;
		
		int minutes = seconds / 60;
		    seconds %= 60;

		StringBuilder res = new StringBuilder();
		res.append(days).append(" Day(s) ").append(hours).append(" Hour(s)").append(minutes).append(" Minute(s) ")
		.append(seconds).append(" Second(s)");

		return res.toString();
	}
}
