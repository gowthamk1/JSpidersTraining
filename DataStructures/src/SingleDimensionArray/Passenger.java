package SingleDimensionArray;

class Passenger {
	private String name;
	private char gender;
	private int phone;
	private int trackId;
	private String fromPlace;
	private String destinationPlace;
	private int seatNo;

	protected Passenger(String name, char gender, int phone2, int phone3, String fromPlace,
			String destinationPlace, int seatNo) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone2;
		this.trackId = phone3;
		this.fromPlace = fromPlace;
		this.destinationPlace = destinationPlace;
		this.seatNo = seatNo;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public int getPhone() {
		return phone;
	}

	public int getTrackId() {
		return trackId;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public String getDestinationPlace() {
		return destinationPlace;
	}

	public int getSeatNo() {
		return seatNo;
	}
}
