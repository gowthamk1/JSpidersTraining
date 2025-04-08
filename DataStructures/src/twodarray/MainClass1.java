package twodarray;

public class MainClass1 {
	public static void main(String[] args) {
		TwoDArray td=new TwoDArray(3, 3);
		td.insertion(0, 0, 1);
		td.insertion(0, 1, 2);
		td.insertion(0, 2, 3);
		td.insertion(1, 0, 4);
		td.insertion(1, 1, 5);
		td.insertion(1, 2, 6);
		td.insertion(2, 0, 7);
		td.insertion(2, 1, 8);
		td.insertion(2, 2, 9);
		td.traverse();
		td.searchByindex(1, 0);
		td.searchByvalue(7);
		td.deleteByindex(0, 1);
		td.deleteByvalue(9);
	}

}
