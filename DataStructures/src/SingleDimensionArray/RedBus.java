package SingleDimensionArray;

public class RedBus {
		public static void main(String[] args) {
			Booking book=new Booking(5);
			book.ticketBooking(1, "Manoj", 'M', 97897890, "Bengaluru", "Mysore");
			book.ticketBooking(2, "charan",'M', 90808098, "bengaluru", "Mysore");
			book.ticketBooking(3, "Sudeep",'M', 90808099, "bengaluru", "Mysore");
			book.ticketBooking(4, "Alpash",'M', 90808097, "bengaluru", "Mysore");
			book.ticketBooking(5, "Ram",'M', 90808096, "bengaluru", "Mysore");
			System.out.println("All passengers data");
			book.printAllPassengerData();
			System.out.println("Searching");
			book.searchByName("ram");
			book.searchBySeatNumber(3);
			book.cancelByName("ram");
			book.cancelByName("ram");
			book.cancelBySeatNumber(4);
			book.cancelBySeatNumber(4);
			book.availableSeats();
		}
}
