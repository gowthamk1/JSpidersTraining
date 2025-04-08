package Practise1;
import java.sql.*;
import java.util.*;

public class MainClass3 {
	
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employes","root","Beastboy@th11");;
		PreparedStatement p=c.prepareStatement("insert into Details values(?,?,?,?)");
		System.out.println("Enter the employee ID");
		p.setInt(1, sc.nextInt());
		System.out.println("Enter the employee Name");
		p.setString(2, sc.next());
		System.out.println("Enter the employee Department");
		p.setString(3, sc.next());
		System.out.println("Enter the employee PhoneNumber");
		p.setLong(4, sc.nextLong());
		int a=p.executeUpdate();
		System.out.println(a);
		c.close();
	}
}

