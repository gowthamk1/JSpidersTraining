package Practise1;
import java.sql.*;

public class MainClass1 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Beastboy@th11");
		PreparedStatement p=c.prepareStatement("create database newJSpider");
		boolean e=p.execute();
		System.out.println(e);
		c.close();
	}

}
