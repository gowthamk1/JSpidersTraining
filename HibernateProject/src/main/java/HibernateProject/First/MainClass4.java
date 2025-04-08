package HibernateProject.First;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass4 {
	public static void main(String[] args) throws Exception{
		EntityManagerFactory e=Persistence.createEntityManagerFactory("NEW Company");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
//		Employee e1=new Employee();
//		e1.seteName("larthik");
//		e1.seteDept("ECE");
//		e1.setePhNo(9974748378l);
//		
//		t.begin();
//		m.persist(e1);
//		t.commit();
		
//		Employee e2=m.find(Employee.class, 6);
//		e2.seteName("Ramya");
//		t.begin();
//		m.merge(e2);
//		t.commit();
		
//		Employee e2=m.find(Employee.class, 6);
//		System.out.println("Employee name: "+e2.geteName()+" "+"Employee ID: "+e2.getEmpId()+" "+"Employee Dept: "+e2.geteDept()+" "+"Employee PH: "+e2.getePhNo());
//		
		Employee e1=m.find(Employee.class, 5);
		t.begin();
		m.remove(e1);
		t.commit();
		
		System.out.println("Removed entry: "+e1);
	}
}
