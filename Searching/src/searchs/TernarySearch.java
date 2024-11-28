//package searchs;
//import java.util.*;
//
//
//import java.util.Scanner;
////public class TernarySearch{
////	public static int ternarySearchs(int arr[], int left, int right, int target) {
////	    int result = -1; // Variable to store the first occurrence
////	    while (left <= right) {
////	        int mid1 = left + (right - left) / 3;
////	        int mid2 = right - (right - left) / 3;
////
////	        if (arr[mid1] == target) {
////	            result = mid1; // Update result to the current index
////	            right = mid1 - 1; // Continue searching in the left segment
////	        } else if (arr[mid2] == target) {
////	            result = mid2; // Update result to the current index
////	            right = mid2 - 1; // Continue searching in the left segment
////	        } else if (target < arr[mid1]) {
////	            right = mid1 - 1;
////	        } else if (target > arr[mid2]) {
////	            left = mid2 + 1;
////	        } else {
////	            left = mid1 + 1;
////	            right = mid2 - 1;
////	        }
////	    }
////	    return result;
////	}
////
////public static void main(String[] args) {
////    Scanner sc = new Scanner(System.in);
////    int n = sc.nextInt();
////    int arr[] = new int[n];
////    for (int i = 0; i < n; i++) {
////        arr[i] = sc.nextInt();
////    }
////    int target = sc.nextInt();
////    int pos = ternarySearchs(arr, 0, n - 1, target);
////    if (pos == -1) {
////        System.out.println("Element not found");
////    } else {
////        System.out.println("the element is at index: " + pos);
////    }
////}
////	
////}





























