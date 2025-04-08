//package HibernateProject.First;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class MainClass1 {
//
//	public static void main(String[] args) {
//		EntityManagerFactory e=Persistence.createEntityManagerFactory("Gowtham");
//		EntityManager m=e.createEntityManager();
//		EntityTransaction t=m.getTransaction();
		
//		Student s=new Student();
//		s.setSID(1);
//		s.setSName("Suhas");
//		s.setSPercentage(67.43);
//		s.setSPhNo(7657689765l);
//		t.begin();
//		m.persist(s);
//		t.commit();
		
//		Student s=m.find(Student.class, 1);
//		System.out.println(s.getSID() + " " + s.getSName() + " " + s.getSPercentage());
//		  
//		Student s=m.find(Student.class, 1);
//		s.setSPhNo(8197916543l);
//		t.begin();
//		m.merge(s);
//		t.commit();
//		 
//		Student s=m.find(Student.class, 1);
//		t.begin();
//		m.remove(s);
//		t.commit();
//	}
//
//}
