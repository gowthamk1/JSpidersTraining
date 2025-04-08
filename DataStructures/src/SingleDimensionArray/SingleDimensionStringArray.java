package SingleDimensionArray;

public class SingleDimensionStringArray {
	String[] arr;

//	creation
	public SingleDimensionStringArray(int size) {// ------>O(N)
		arr = new String[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = null;
		}
	}

//	insertion
	public void insertion(int index, String value) {
		try {
			if (arr[index] == null) {
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

	public void searching(String search) {// ------> O(N)
		for (int i = 0; i < arr.length; i++) {
			if (search.equalsIgnoreCase(arr[i])) {
				System.out.println("\nThe value is present in the index of: " + i);
				return;
			}
		}
		System.out.println("The value is not present");
	}
	public void deletion(int index) {// ------>O(N)
		try {
		if(arr[index]!=null) {
			System.out.println("The value "+arr[index]+" is deleted");
			arr[index]=null;
		}
		else {
			System.out.println("No element inserted in the given index");
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
}

