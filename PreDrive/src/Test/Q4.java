package Test;

import java.util.Scanner;

public class Q4 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        int maxSum = findMaxSubarraySum(arr);
	        System.out.println("The maximum subarray sum is: " + maxSum);
	        scanner.close();
	    }
	    public static int findMaxSubarraySum(int[] arr) {
	        int maxSoFar = arr[0];
	        int currentMax = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            currentMax = Math.max(arr[i], currentMax + arr[i]);
	            maxSoFar = Math.max(maxSoFar, currentMax);
	        }

	        return maxSoFar;
	    }
	}