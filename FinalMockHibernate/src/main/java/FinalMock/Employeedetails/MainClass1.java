package FinalMock.Employeedetails;

import java.io.FileInputStream;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass1 {
	
	public static void main(String[] args) throws Exception {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("FinalMockHibernate");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
	
		Employee E=new Employee();
		E.setId(7);
		E.setEName("Rahul");
		E.setESalary(80000);
		E.setEPhNo(729767897l);
		FileInputStream fis = new FileInputStream("//Users//gowthamk//Downloads//iron-fist-poster-to.jpg");
		byte[] ar = new byte[fis.available()];
		fis.read(ar);
		E.setEPhoto(ar);
		E.setEDOB(LocalDate.of(2004, 03, 23));
		
		t.begin();
		m.persist(E);
		t.commit();
		
//		Employee E=m.find(Employee.class, 4);
//		E.setEName("Prajwal");
//		t.begin();
//		m.merge(E);
//		t.commit();
		
//		Employee E=m.find(Employee.class, 4);
//		System.out.println(E.getId()+" "+E.getEName()+" "+E.getEPhNo()+" "+E.getEDOB()+" "+E.getObjectCreationTime()+" "+E.getESalary()+" "+E.getEPhoto());
//		
//		Employee E=m.find(Employee.class, 1);
//		t.begin();
//		m.remove(m);
//		t.commit();
	}
}
