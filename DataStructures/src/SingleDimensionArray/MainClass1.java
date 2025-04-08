package SingleDimensionArray;

public class MainClass1 {
	public static void main(String args[]) {
		SingleDimensionStringArray sda1=new SingleDimensionStringArray(5);
		sda1.insertion(0, "Ravi");
		sda1.insertion(1, "Ram");
		sda1.insertion(2, "Ravan");
		sda1.insertion(3, "Reva");
		sda1.insertion(4, "Rakesh");
		sda1.traverse();
		sda1.searching("Ram");
		sda1.deletion(4);
		sda1.traverse();
	}
}
