package twodarray;

public class BookMyShow {
	Audiance[][] data;
	public BookMyShow(int row,int col) {
		data=new Audiance[row][col];
	}
	public void bookMyTicket(int row,int col,String Name,int Age,int PhNo,String MovieName) {
		try {
			if(data[row-1][col-1]==null) {
			String SeatNo=(char)(65+(row-1))+" "+col;
			Audiance a1=new Audiance(Name,Age,PhNo,MovieName,SeatNo);
			System.out.println("The seat is confirmed");
			data[row-1][col-1]=a1;
			System.out.println("Your seat for the movie "+MovieName+" is "+SeatNo);
			}
			else {
				System.out.println("The seat is not available");
			}
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid input");
		}
	}
	public void printAllData(){
		System.out.println("The Values are : ");
		for(int row=0;row<data.length;row++) {
			for(int col=0;col<data[0].length;col++) {
				System.out.println(data[row][col]+" ");
			}
			System.out.println();
		}
	}
	public void searchBySeatNo(String SeatNo) {
		int row=SeatNo.charAt(0)-65;
		System.out.println(row);
		int col=Integer.parseInt(SeatNo.replaceAll("[^0-9]", ""));
		System.out.println(col-1);
		try {
			if(data[row][col-1]!=null) {
				System.out.println(data[row][col-1].getName()+" is booked at seatno is "+data[row][col-1].getSeatno());
				return;
			}
			else {
				System.out.println("not found");
			}
		}
		catch(Exception e){
			System.out.println("Invalid SeatNo");
		}
	}
}
