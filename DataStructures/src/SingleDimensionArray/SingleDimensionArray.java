package SingleDimensionArray;

public class SingleDimensionArray {
	int[] arr;

//	creation
	public SingleDimensionArray(int size) {// ------>O(N)
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

//	insertion
	public void insertion(int index, int value) {
		try {
			if (arr[index] == Integer.MIN_VALUE) {
				arr[index] = value;
				System.out.println("The value " + value + " is inserted");
			} else {
				System.out.println("The cell is already filled");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid");
		}
	}

	public void traverse() { // ------>O(N)
		System.out.println("The values are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void searching(int search) {// ------> O(N)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("\nThe value is present in the index of: " + i);
				return;
			}
		}
		System.out.println("The value is not present");
	}
	public void deletion(int index) {// ------>O(N)
		try {
		if(arr[index]!=Integer.MIN_VALUE) {
			System.out.println("The value "+arr[index]+" is deleted");
			arr[index]=Integer.MIN_VALUE;
		}
		else {
			System.out.println("No element inserted in the given index");
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
}