package jdbc;
import java.sql.*;
import java.util.Scanner;



public class MyJDBC {
	
	public static Connection connection() {
		Connection con=null;
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String myConn="jdbc:mysql://localhost:3306/demo?characterEncoding=utf8";
			String userName="root";
			String password="Youcan01@";
			 con=DriverManager.getConnection(myConn,userName,password);
			if(con!=null)
			{
				System.out.println("connected");
				return con;
	}
			else {
				System.out.println("Not connected ");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}	
	
	
	public static void Create(Connection abc,Scanner sc) throws SQLException {
		System.out.println("Enter Your name");
		Scanner sc2=new Scanner(System.in);
		String name=sc2.nextLine();
		System.out.println("Enter The Amount");
		int salary=sc.nextInt();
		String q1="insert into employee(name,salary) values('"+name+"',"+salary+");";
		Statement stmt=abc.createStatement();
        int m=stmt.executeUpdate(q1);
	}
	
	public static void Update(Connection abc,Scanner sc) throws SQLException {
		System.out.println("Enter id of employee that needs to be updated");
		int id=sc.nextInt();
		System.out.println("Enter the name to be updated");
		Scanner sc1=new Scanner(System.in);
		String cname=sc1.nextLine();
		String q2="update employee SET name='"+cname+"'where id="+id;
		Statement stmt=abc.createStatement();
		int n=stmt.executeUpdate(q2);
	}
	
	public static void Delete(Connection abc,Scanner sc) throws SQLException {
		System.out.println("Enter the ID of Employee to delete the record");
		int did=sc.nextInt();
		String q3="delete from employee where id="+did;
		Statement stmt=abc.createStatement();
		int o=stmt.executeUpdate(q3);
	}
	
	public static void Display(Connection abc) throws SQLException {
		Statement stmt=abc.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM employee");
	}
public static void main(String args[]) throws SQLException {
	
	       Connection abc = connection();
			while(true) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("press 1 to create a new record");
				System.out.println("press 2 to update a new record");
				System.out.println("press 3 to delete a new record");
				System.out.println("press 4 to display the records");
				System.out.println("press 5 to exit");
				int ch=sc.nextInt();
			
				
				switch(ch) {
				case 1:
					Create(abc,sc);
					break;
				case 2:
					
					Update(abc,sc);
					break;
				case 3:
					
					Delete(abc,sc);
					break;
				case 4:
					System.out.println("Displaying the records");
					Display(abc);
					break;
				case 5:
					System.out.println("Exiting from the program");
					abc.close();
					System.exit(0);
					
				default:
					System.out.println("Please Enter the Correct Value");
				}
			}
		}
	
		
	
}

