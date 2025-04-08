package HibernateProject.First;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int empId;
	@Column(nullable=false,unique=true)
	private String eName;
	@Column(nullable=false)
	private String eDept;
	@Column(unique=true, nullable=false )
	private long ePhNo;
	public long getePhNo() {
		return ePhNo;
	}
	public void setePhNo(long ePhNo) {
		this.ePhNo = ePhNo;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
}
