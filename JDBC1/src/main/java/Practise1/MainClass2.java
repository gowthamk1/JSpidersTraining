package Practise1;
import java.sql.*;

public class MainClass2 {
	
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employes","root","Beastboy@th11");
//		PreparedStatement p=c.prepareStatement("create table Details(empId int primary key,empName varchar(30),empDept varchar(20),empPhoneNumber bigint)");
//		PreparedStatement p=c.prepareStatement("alter table Details add empPhoneNumber bigint");
//		PreparedStatement p=c.prepareStatement("insert into Details values(2,'Kavya','Dept2',7658576578),(3,'Varun','Dept3',9658576578),(4,'Rahul','Dept4',9858576578)");
		PreparedStatement p=c.prepareStatement("select * from details");
		ResultSet s=p.executeQuery();
		while(s.next()) {
		System.out.println(s.getInt(1)+" "+s.getString(2)+" "+s.getString(3)+" "+s.getLong(4));
		}
		c.close();
	}
}
