package FinalMock.Employeedetails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Employee {
	@Id
	private int Id;
	@Column(nullable=false)
	private String EName;
	private int ESalary;
	@Column(unique=true)
	private long EPhNo;
	@Lob
	private byte[]EPhoto;
	public byte[] getEPhoto() {
		return EPhoto;
	}
	public void setEPhoto(byte[] ePhoto) {
		EPhoto = ePhoto;
	}
	private LocalDate EDOB;
	@CreationTimestamp
	private LocalDateTime ObjectCreationTime;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public int getESalary() {
		return ESalary;
	}
	public void setESalary(int eSalary) {
		ESalary = eSalary;
	}
	public long getEPhNo() {
		return EPhNo;
	}
	public void setEPhNo(long ePhNo) {
		EPhNo = ePhNo;
	}
	public LocalDate getEDOB() {
		return EDOB;
	}
	public void setEDOB(LocalDate eDOB) {
		EDOB = eDOB;
	}
	public LocalDateTime getObjectCreationTime() {
		return ObjectCreationTime;
	}
	public void setObjectCreationTime(LocalDateTime objectCreationTime) {
		ObjectCreationTime = objectCreationTime;
	}
	
}
