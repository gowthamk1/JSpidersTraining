//package HibernateProject.First;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class MainClass3 {
//
//	public static void main(String[] args) throws Exception{
//		EntityManagerFactory e=Persistence.createEntityManagerFactory("OneToMany");
//		EntityManager m=e.createEntityManager();
//		EntityTransaction t=m.getTransaction();
//		
		
//		Bank b1=new Bank();
//		b1.setBName("SBI");
//		b1.setBAddress("Banglore");
//		b1.setBID(10);
//		
//		Bank b2=new Bank();
//		b2.setBName("ICICI");
//		b2.setBAddress("Mysore");
//		b2.setBID(11);
		
//		Bank b3=new Bank();
//		b3.setBName("Canara Bank");
//		b3.setBAddress("Hassan");
//		b3.setBID(12);
		
//		ArrayList<Bank> a=new ArrayList<Bank>();
//		a.add(b1);
//		a.add(b2);
//		a.add(b3);
		
//		Person p =new Person();
//		p.setPName("Varun");
//		p.setPId(12);
//		p.setB(a);
		
//		t.begin();
//		m.persist(b1);
//		m.persist(b2);
//		m.persist(b3);
//		m.persist(p);
//		t.commit();
		
//		Bank b=m.find(Bank.class, "ICICI");
//		b.setBID(10);
//		t.begin();
//		m.merge(b);
//		t.commit();
//	
		
//		Person p=m.find(Person.class,"Suhas");
//		List<Bank> al=p.getB();
//		Iterator<Bank> i=al.iterator();
//		while(i.hasNext());
//		{
//			Bank b =i.next();
//			if(b.getBName().equals("SBI"));
//			{
//				b.setBName("HDFC");
//			}
//		}
//		t.begin();
//		m.merge(p);
//		t.commit();
		
//		Updating child object directly
		
//		Bank b = m.find(Bank.class,"SBI" );
//		b.setBName("HDFC");
//		t.begin();
//		m.merge(b);
//		t.commit();
		
//		Deleting parent Object
		
//		Person p=m.find(Person.class, "Varun");
//		t.begin();
//		m.remove(p);
//		
//	}
//	
//}
