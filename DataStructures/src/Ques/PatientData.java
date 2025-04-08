package Ques;

public class PatientData {
	private String Name;
	private int Age;
	private String Gender;
	private int HeartRate;
	private int GlucoseLevel;
	private String Symptoms;
	
	protected PatientData(String Name,int Age,String Gender,int HeartRate,int GlucoseLevel,String Symptoms) {
		super();
		this.Name=Name;
		this.Age=Age;
		this.Gender=Gender;
		this.HeartRate=HeartRate;
		this.GlucoseLevel=GlucoseLevel;
		this.Symptoms=Symptoms;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public String getGender() {
		return Gender;
	}
	public int getHeartRate() {
		return HeartRate;
	}
	public int getGlucoseLevel() {
		return GlucoseLevel;
	}
	public String getSymptoms() {
		return Symptoms;
	}
	@Override
	public String toString() {
		return "PatientData [Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + ", HeartRate=" + HeartRate
				+ ", GlucoseLevel=" + GlucoseLevel + ", Symptoms=" + Symptoms + "]";
	}
}
