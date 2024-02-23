package pack;
import java.util.Scanner;

public class Problem_10 {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);

		    System.out.print("Enter the size of the array: ");
		    int size = scan.nextInt();

		    int[] arr = new int[size];
		    System.out.println("Enter the array elements:");
		    for (int i = 0; i < size; i++) {
		      arr[i] = scan.nextInt();
		    }
		    int secondLargest = findSecondLargest(arr);

		    System.out.println("The second largest number is: " + secondLargest);
		    scan.close();
	  }

	  public static int findSecondLargest(int[] arr) {
		  int max = Integer.MIN_VALUE;
		  int secondMax = Integer.MIN_VALUE;

		  for (int i : arr) {
			  if (i > max) {
				  secondMax = max;
				  max = i;
		      } 
		      else if (i > secondMax && i != max) {
		    	  secondMax = i;
		      }
		   }
		   return secondMax;
	  }
}