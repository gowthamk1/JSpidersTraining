package HibernateProject.First;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int SID;
	@Column(nullable=false,unique=true)
	private String SName;
	private double SPercentage;
	@Column(unique=true)
	private long SPhNo;
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public double getSPercentage() {
		return SPercentage;
	}
	public void setSPercentage(double sPercentage) {
		SPercentage = sPercentage;
	}
	public long getSPhNo() {
		return SPhNo;
	}
	public void setSPhNo(long sPhNo) {
		SPhNo = sPhNo;
	}
}
