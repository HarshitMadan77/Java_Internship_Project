package pack;
import java.util.Scanner;

public class Problem_4 {
	public static int findMedian(int[] num) {
	    int len = num.length;
	    if (len == 0) {
	    	return -1;
	    }
	    if (len % 2 == 0) {
	    	int mid1 = len / 2 - 1;
		    int mid2 = len / 2;
		    return (num[mid1] + num[mid2]) / 2;
		} 
	    else {
		    int mid = len / 2;
		    return num[mid];
		}
	}
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.println("Enter the size of the array: ");
	    int size = scan.nextInt();

	    System.out.println("Enter the sorted array:");
	    int[] arr = new int[size];
	    for (int i = 0; i < size; i++) {
	      arr[i] = scan.nextInt();
		}
	
	    int median = findMedian(arr);

	    System.out.println("The median of the array is: " + median);

	    scan.close();
	}
}
