package twodarray;

public class TwoDArray {
	int arr[][];
	public TwoDArray(int row,int col) {
		arr=new int[row][col];
		for(row=0;row<arr.length;row++) {
			for(col=0;col<arr.length;col++) {
				arr[row][col]=Integer.MIN_VALUE;
			}
		}
	}
	
	public void insertion(int row,int col,int value){
		try {
			if(arr[row][col]==Integer.MIN_VALUE) {
				arr[row][col]=value;
				System.out.println("The value is inserted "+value);
			}
			else {
				System.out.println("the cell is already filled");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("invalid index");
			
		}
	}
	
	
	public void traverse(){
		System.out.println("the values are : ");
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr.length;col++) {
				System.out.print(arr[row][col]+" ");
			}
		}
		System.out.println();
		
	}
	
	public void searchByindex(int row,int col) {
			if(arr[row][col]!=Integer.MIN_VALUE) {
				System.out.println("the value in the index is "+arr[row][col]);
			}
			else {
				System.out.println("invalid index");
			}
	}
	
	public void searchByvalue(int value){
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr.length;col++) {
				if(arr[row][col]==value) {
					System.out.println("the value "+value+" is present in row:"+row+" and col:"+col);
					return;
				}
				
			}
			System.out.println();
		}
		System.out.println("invalid value");
		
	}
	
	public void deleteByindex(int row,int col) {
		if(arr[row][col]!=Integer.MIN_VALUE) {
			System.out.println("the value "+arr[row][col]+" has been deleted");
			arr[row][col]=Integer.MIN_VALUE;
		}
		else {
			System.out.println("the value is invalid");
		}
		System.out.println();
	}
	
	public void deleteByvalue(int value) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr.length;col++) {
				if(arr[row][col]==value) {
					System.out.println("the value "+value+" has been delted");
					arr[row][col]=Integer.MIN_VALUE;
					
					return;
				}
			}
			System.out.println();
		}
		System.out.println("invalid value");
	}

}
