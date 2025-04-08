package twodarray;

public class MainClass2 {
	public static void main(String[] args) {
		BookMyShow book=new BookMyShow(5,5);
		book.bookMyTicket(1, 1, "Gowtham K", 22, 564576587, "Bhageera");
		book.bookMyTicket(1, 2, "Suhas", 23, 563576587, "Bhageera");
		book.bookMyTicket(2, 3, "Varun", 22, 564576587, "Bhageera");
		book.bookMyTicket(3, 1, "manoj", 21, 564566587, "Bhageera");
		book.printAllData();
		book.searchBySeatNo("A1");
	}
}
