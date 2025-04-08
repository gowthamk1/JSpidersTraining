package twodarray;

public class Audiance {
	private String name;
	private int age;
	@Override
	public String toString() {
		return "Audiance [name=" + name + ", age=" + age + ", phno=" + phno + ", moviename=" + moviename + ", seatno="
				+ seatno + "]";
	}

	private int phno;
	private String moviename;
	private String seatno;
	
	protected Audiance(String Name,int Age,int PhNo,String MovieName,String SeatNo) {
		super();
		this.name=Name;
		this.age=Age;
		this.phno=PhNo;
		this.moviename=MovieName;
		this.seatno=SeatNo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPhno() {
		return phno;
	}

	public String getMoviename() {
		return moviename;
	}

	public String getSeatno() {
		return seatno;
	}
	
}
	
