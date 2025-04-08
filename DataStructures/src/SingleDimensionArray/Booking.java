package SingleDimensionArray;

import java.util.Iterator;

public class Booking {
	Passenger[] bus;

	public Booking(int size) {
		bus = new Passenger[size];
	}

	public void ticketBooking(int seatNo, String name, char gender, int phone, String fromPlace,String destinationPlace) {
		try {
			Passenger p1 = new Passenger(name, gender, phone, phone, fromPlace, destinationPlace, seatNo);
			if (bus[seatNo - 1] == null) {
				System.out.println("Seat is confirmed");
				System.out.println("Name: "+name+"\n"+"Gender: "+gender+"\n"+"Phone: "+phone+"\n"+"From: "+fromPlace+"\n"+"Destination: "+destinationPlace+"\n");
			}
			
			else {
				System.out.println("Seat is already booked");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid seat number");
		}
	}
	public void printAllPassengerData() {
		System.out.println("SeatNo\tName\tGender\tPhone\tFrom\tDestination");
		for (int i=0;i<bus.length;i++) {
			if(bus[i]!=null) {
				System.out.println(bus[i].getSeatNo()+"\t"+bus[i].getName()+"\t"+bus[i].getGender()+"\t"+bus[i].getPhone()+"\t"+bus[i].getFromPlace()+"\t"+bus[i].getDestinationPlace());
			}
		}
	}
	public void searchByName(String name) {
		for(int i=0;i<bus.length;i++) {
			if(bus[i]!=null && bus[i].getName().equalsIgnoreCase(name)) {
				System.out.println("The passenger "+bus[i].getName()+" travelling in the seat "+bus[i].getSeatNo());
				return;
			}
			else {
				System.out.println("The passenger is not travelling in the bus");
			}
		}
	}
	public void searchBySeatNumber(int seatNo) {
		try {
			if(bus[seatNo-1]!=null) {
				System.out.println("The passenger "+bus[seatNo-1].getName()+" travelling in the bus");
			}
			else {
				System.out.println(("The seat is not booked"));
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid seat number");
		}
	}
	public void cancelByName(String name) {
		for(int i=0;i<bus.length;i++) {
			if(bus[i]!=null && bus[i].getName().equalsIgnoreCase(name)) {
				bus[i]=null;
				System.out.println("The ticket is cancelled");
				return;
			}
		}
		System.out.println("The seat is not booked");
	}
	public void cancelBySeatNumber(int seatNo) {
		try {
			if(bus[seatNo-1]!=null) {
				bus[seatNo-1]=null;
				System.out.println("The tickect is cancelled");
			}
			else {
				System.out.println(("The seat is not booked"));
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid seat number");
		}
	}
	public void availableSeats() {
		System.out.println("Availble seats: ");
		for(int i=0;i<bus.length;i++) {
			if(bus[i]==null) {
				System.out.println(bus[i].getSeatNo());
			}
			
		}
	}
}
