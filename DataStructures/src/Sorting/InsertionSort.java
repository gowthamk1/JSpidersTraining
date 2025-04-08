package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[]arr= {3,4,2,8,1,0};
		for(int i=1;i<arr.length;i++) {
			int x=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>x) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=x;
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
