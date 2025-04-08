package HibernateProject.First;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	
	@Id
	private String BName;
	private int BID;
	private String BAddress;
	
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	public int getBID() {
		return BID;
	}
	public void setBID(int bID) {
		BID = bID;
	}
	public String getBAddress() {
		return BAddress;
	}
	public void setBAddress(String bAddress) {
		BAddress = bAddress;
	}
}
