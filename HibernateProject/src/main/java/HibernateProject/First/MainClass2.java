//package HibernateProject.First;
//
//import java.io.FileInputStream;
//import java.time.LocalDate;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class MainClass2 {
//
//	public static void main(String[] args) throws Exception{
//		EntityManagerFactory e=Persistence.createEntityManagerFactory("Gowtham");
//		EntityManager m=e.createEntityManager();
//		EntityTransaction t=m.getTransaction();
		
		//------------------Adding Object--------------------
		
//		Student1 st1=new Student1();
//		st1.setSName("Luke");
//		st1.setSPhNo(6576876789l);
//		st1.setDOB(LocalDate.of(2003, 03, 23));
//		FileInputStream fis = new FileInputStream("//Users//gowthamk//Downloads//WhatsApp Image 2024-09-04 at 18.27.50.jpeg");
//		byte[] arr = new byte[fis.available()];
//		fis.read(arr);
//		st1.setImage(arr);
////		
//		t.begin();
//		m.persist(st1);
//		t.commit();
		
		//------------------Update Values--------------------
		
//		Student1 s1=m.find(Student1.class, 4);
//		s1.setSName("Prajwal");
//		t.begin();
//		m.merge(s1);
//		t.commit();
		
		//------------------Fetching Object--------------------
//		
//		Student1 s1=m.find(Student1.class, 4);
//		System.out.println(s1.getSID()+" "+s1.getSName()+" "+s1.getSPhNo()+" "+s1.getDOB()+" "+s1.getObjectCreationTime()+" "+s1.getUpdatedTime()+" "+s1.getImage());
		
		//------------------Deleting Object--------------------
		
//		Student1 s1=m.find(Student1.class, 4);
//		t.begin();
//		m.remove(m);
//		t.commit();
//	}
//
//}
