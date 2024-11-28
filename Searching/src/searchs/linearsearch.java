package searchs;
import java.util.*;

public class linearsearch {
	
	public static int lsearch(int arr[], int n, int x) {
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				return i;
			}	
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the element to search for: ");
		int x = sc.nextInt();
		  System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		//int n = arr.length;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//int x=41;
		  int result = lsearch(arr, n, x);
	        
	        if (result == -1) {
	            System.out.println("Element not found.");
	        } else {
	            System.out.println("Element found at index: " + result);
	        }
	        sc.close();
		
	}
}
	


	

