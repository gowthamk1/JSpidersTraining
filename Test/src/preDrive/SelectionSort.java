package preDrive;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		System.out.println("Enter the elements");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[]arr= new int[a];
		for (int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
