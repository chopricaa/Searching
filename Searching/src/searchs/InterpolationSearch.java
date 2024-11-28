package searchs;

import java.util.Scanner;

public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == target) {
                return pos;
            }
            if (arr[pos] < target) {
                low = pos + 1;
            }
            else {
                high = pos - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int result = interpolationSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found in index: " + result);
        } else {
            System.out.println("Element not found");
        }

        scanner.close();
    }
}
