package HibernateProject.First;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class Person {
	
	@Id
	private String PName;
	private int PId;
	
	@OneToMany
	private java.util.List<Bank> b;
	public java.util.List<Bank> getB() {
		return b;
	}
	public void setB(java.util.List<Bank> b) {
		this.b = b;
	}
	
	
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public int getPId() {
		return PId;
	}
	public void setPId(int pId) {
		PId = pId;
	}

}
