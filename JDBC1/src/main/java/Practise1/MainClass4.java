package Practise1;
import java.sql.*;
import java.util.*;

public class MainClass4 {
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employes","root","Beastboy@th11");;
		PreparedStatement p=c.prepareStatement("select * from Details where empId=?");
		System.out.println("Enter the ID");
		p.setInt(1, sc.nextInt());
		ResultSet s=p.executeQuery();
		while(s.next()) {
			System.out.println(s.getString(2)+" "+s.getString(3)+" "+s.getLong(4));
			}
		c.close();
	}
}

