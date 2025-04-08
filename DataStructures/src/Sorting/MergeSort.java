package Sorting;

import java.util.Arrays;

public class MergeSort {
	public static void Divide(int[]arr,int li,int hi) {
		if(li<hi) {
			int mid=(li+hi)/2;
			Divide(arr,0,mid);
			Divide(arr,mid+1,hi);
			Merge(arr,li,mid,hi);
		}
	}
	public static void Merge(int[]arr,int left,int mid,int right) {
		int n1=mid-left+1;
		int n2=right-mid;
		int[]LTA=new int[n1];
		int[]RTA=new int[n2];
		for(int i=0;i<n1;i++) {
			LTA[i]=arr[left+i];
		}
		for(int i=0;i<n2;i++) {
			RTA[i]=arr[mid+1+i];
		}
		int i=0;int j=0;int k=left;
		while(i<n1 && j<n2) {
			if(LTA[i]<RTA[j]) {
				arr[k]=LTA[i];
				i++;k++;
			}
			else
			{
				arr[k]=RTA[j];
				j++;k++;
			}
		}
		while(i<n1) {
			arr[k]=LTA[i];
			i++;k++;
		}
		while(j<n2) {
			arr[k]=RTA[j];j++;k++;
		}
	}
	public static void main(String[] args) {
		int[]a= {8,6,9,5,2,1,4,3};
		Divide(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
