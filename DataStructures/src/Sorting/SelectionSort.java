package Sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[]arr= {4,6,2,3,8,1};
		for (int i=0;i<arr.length;i++) {
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
