package searchs;
import java.util.*;

public class Ternary {
	public static int ts(int[] arr, int left, int right, int key) {
		int result=-1;
		
		while(left<=right) {
			int mid1 = left+(right-left)/3;
			int mid2 = right-(right-left)/3;
			
			
			if(arr[mid1]==key) {
				result = mid1;
				right = mid1-1;
			}
			else if(arr[mid2] == key) {
				result = mid2;
				right=mid2-1;
			}
			else if(key<arr[mid1]) {
				right = mid1-1;
			}
			else if(key>arr[mid2]) {
				left = mid2+1;
			}
			else {
				left = mid1+1;
				right = mid2-1;
				
			}
			
		}
		return result;
		
		
	
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
		Arrays.sort(arr);
		int key = sc.nextInt();
		int pos = ts(arr,0,n-1,key);
		if(pos==-1) {
			System.out.println("Elemenr not found ");
		}
		else {
			System.out.println("Found at index" + pos);
		}
		sc.close();
	}

}
