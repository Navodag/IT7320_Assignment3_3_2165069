package dbAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManagement {
	private Connection myConn;
	private ResultSet myRs;
	private PreparedStatement myPstmt;
	private Statement myStmt;
	private int myEu;
	
	public StudentManagement() throws Exception{
		String dbUrl = "jdbc:mysql://localhost:3306/StudentInfor";
		String user = "root";
		String password = "";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		myConn = DriverManager.getConnection(dbUrl,user,password);
		myStmt = myConn.createStatement();
		
		myRs = null;
		myPstmt = null;
		myEu=0;
		
	}

	public String findNameByID(int i) {
		// TODO Auto-generated method stub
		String result="";
		try {
			myPstmt = myConn.prepareStatement("Select StudentName "
					                        + "From student "
					                        + "Where StudentID = ? ");
			myPstmt.setInt(1, i);;
			myRs = myPstmt.executeQuery();

			while(myRs.next()) {
				result = myRs.getString(1);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String findGenderByID(int i) {
		// TODO Auto-generated method stub
		String result="";
		try {
			myPstmt = myConn.prepareStatement("Select StudentGender "
					                        + "From student "
					                        + "Where StudentID = ? ");
			myPstmt.setInt(1, i);;
			myRs = myPstmt.executeQuery();

			while(myRs.next()) {
				result = myRs.getString(1);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public String findCourseByID(int i) {
		// TODO Auto-generated method stub
		String result="";
		try {
			myPstmt = myConn.prepareStatement("Select StudentCourse "
					                        + "From student "
					                        + "Where StudentID = ? ");
			myPstmt.setInt(1, i);;
			myRs = myPstmt.executeQuery();

			while(myRs.next()) {
				result = myRs.getString(1);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
}
}


