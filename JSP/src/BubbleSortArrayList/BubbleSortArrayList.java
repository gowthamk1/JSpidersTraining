package BubbleSortArrayList;
import java.util.*;
import java.util.Arrays;

public class BubbleSortArrayList {
	
	public static void main(String[] args) {
		
//		WITH INBUILT METHOD
		ArrayList array=new ArrayList(Arrays.asList(4,1,3,5,2));
		Collections.sort(array);
		System.out.println(array);
		
//		WITHOUT INBUILT METHOD
		ArrayList array1=new ArrayList(Arrays.asList(4,1,22,5,2));
		for(int i=0;i<array1.size();i++) {
			for(int j=0;j<array.size()-1-i;j++) {
				if((int)array1.get(j)>(int)array1.get(j+1)) {
					
					int temp=(int)array1.get(j);
					array1.set(j, (int)array1.get(j+1));
					array1.set(j+1,temp);
				}
			}
		}
		System.out.println(array1);
	}

}
