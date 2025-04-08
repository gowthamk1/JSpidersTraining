package HibernateProject.First;

import java.time.LocalDate;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Student1 {
	@Id
	@GeneratedValue
	private int SID;
	@Column(nullable=false, unique = true)
	private String SName;
	@Column(unique=true, nullable=false )
	private long SPhNo;
	private LocalDate DOB;
	@Lob
	private byte[] image;
	@CreationTimestamp
	private LocalDateTime ObjectCreationTime;
	@UpdateTimestamp
	private LocalDateTime UpdatedTime;
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
	public long getSPhNo() {
		return SPhNo;
	}
	public void setSPhNo(long sPhNo) {
		SPhNo = sPhNo;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public LocalDateTime getObjectCreationTime() {
		return ObjectCreationTime;
	}
	public void setObjectCreationTime(LocalDateTime objectCreationTime) {
		ObjectCreationTime = objectCreationTime;
	}
	public LocalDateTime getUpdatedTime() {
		return UpdatedTime;
	}
	public void setUpdatedTime(LocalDateTime updatedTime) {
		UpdatedTime = updatedTime;
	}
	
}
