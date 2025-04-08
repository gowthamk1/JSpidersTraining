package SingleDimensionArray;

public class MainClass {
	public static void main(String args[]) {
		SingleDimensionArray sda=new SingleDimensionArray(5);
		sda.insertion(0, 20);
		sda.insertion(1, 50);
		sda.insertion(2, 10);
		sda.insertion(3, 5);
		sda.insertion(4, 40);
		sda.traverse();
		sda.searching(50);
		sda.deletion(0);
		sda.traverse();
	}
}
