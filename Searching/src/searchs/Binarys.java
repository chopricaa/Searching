package searchs;
import java.util.*;

public class Binarys {
	public static int bs(int arr[], int x) {
		int low=0; 
		int high = arr.length-1;
		while(low<=high) {
			int mid=low + (high-low)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]<x) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter to search");
		int x = sc.nextInt();
		System.out.println("enter size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int result = bs(arr,x);
		if(result == -1) {
			System.out.println("Ele not found" );
		}
		else {
			System.out.println("found" +result);
		}
		sc.close();
		
		
	}
	

}
