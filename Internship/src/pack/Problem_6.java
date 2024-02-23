package pack;
import java.util.Scanner;

public class Problem_6 {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);

		    System.out.print("Enter the number of strings: ");
		    int n = scan.nextInt();
		    scan.nextLine();

		    String[] str = new String[n];
		    for (int i = 0; i < n; i++) {
		      System.out.print("Enter string " + (i + 1) + ": ");
		      str[i] = scan.nextLine();
		    }
		    String arr = findStringWithMostVowels(str);

		    System.out.println("String with the most vowels: " + arr);
		    scan.close();
		  }

		  public static String findStringWithMostVowels(String[] strings) {
		    String result = "";
		    int max = 0;

		    for (String str : strings) {
		      int count = countVowels(str);
		      if (count > max) {
		        max = count;
		        result = str;
		      }
		    }

		    return result;
		  }

		  public static int countVowels(String str) {
		    int count = 0;
		    str = str.toLowerCase();
		    for (int i = 0; i < str.length(); i++) {
		      char ch = str.charAt(i);
		      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		        count++;
		      }
		    }
		    return count;
		  }
}
