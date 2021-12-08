package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BookDB {
	public static Connection connection() {
		Connection con=null;
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String myConn="jdbc:mysql://localhost:3306/books?characterEncoding=utf8";
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
	public static void Query1(Connection abc,Scanner sc) throws SQLException{
		Display(abc,sc);
		System.out.println("Enter the firstname of the author");
		String FName=sc.next();
		String q="select title from book b,bookauthor ba,author a where b.ISBN=ba.bookId and ba.authorId=a.authorId and a.firstname='"+FName+"'";
	    Statement stmt=abc.createStatement();
	    ResultSet rs=stmt.executeQuery(q);
	    System.out.println("book titles");
	    while(rs.next()) {
	    	System.out.println(rs.getString(1));
	    }
	}
	public static void Query2(Connection abc,Scanner sc) throws SQLException {
		int a_id,book_id=0;
		System.out.println("Enter the book title:");
		String bookTitle = sc.next();
		System.out.println("Enter the price of the book:");
		int price = sc.nextInt();
		Statement stmt=abc.createStatement();
		String query = "insert into book(title,price) values('"+bookTitle+"',"+price+");";
		int result = stmt.executeUpdate(query);
		ResultSet rs = stmt.executeQuery("select last_insert_id();");
		while(rs.next()) {
		book_id = rs.getInt(1);
		System.out.println(book_id);
		}
		verifyMsg(result,"Insert a record into book table");
		a_id=Create(abc,sc);
		String query2 = "insert into bookauthor values ("+book_id+","+a_id+");";
		int result2 = stmt.executeUpdate(query2);
		verifyMsg(result2,"inserted a record into bookauthor");
		}
	
	public static void Query3(Connection abc,Scanner sc) throws SQLException {
		Display(abc,sc);
		System.out.println("Enter the Author Name to update the price:");
		String authorName = sc.next();
		System.out.println("Enter the price of the book to be Updated:");
		int price = sc.nextInt();
		String Query = "update book set price = "+price+" where book.ISBN in (select bookId from bookauthor ba where ba.authorId in (select authorId from author where firstname = '"+authorName+"'));";
		
		
		Statement stmt= abc.createStatement();
		int result = stmt.executeUpdate(Query);
		verifyMsg(result,"Update of price");
		}
	
	public static void verifyMsg(int result,String msg) {
		if(result==1) {
		System.out.println(msg+" Sucessfull...");
		}
		else{
		System.out.println(msg+" Failed.....");
		}
		}
	
	public static int Create(Connection abc,Scanner sc) throws SQLException {
		int author_id=0;
		System.out.println("Enter the first name of author");
		Scanner sc2=new Scanner(System.in);
		String first_name=sc2.nextLine();
		System.out.println("Enter the middle name of author ");
		String middle_name=sc2.nextLine();
		System.out.println("Enter the last name of author ");
		String last_name=sc2.nextLine();
		System.out.println("Enter the phone number ");
		int phoneno=sc.nextInt();
		String q1="insert into author(firstname,middlename,lastname,phoneNo) values('"+first_name+"','"+middle_name+"','"+last_name+"',"+phoneno+")";
		Statement stmt=abc.createStatement();
        int m=stmt.executeUpdate(q1);
        ResultSet rs = stmt.executeQuery("select last_insert_id();");
        while(rs.next()) {
        author_id = rs.getInt(1);
        }
        verifyMsg(m,"Insert into author table");
        return author_id;
        }
	
	
	public static void Update(Connection abc,Scanner sc) throws SQLException {
		System.out.println("Enter id of author that needs to be updated");
		int author_id=sc.nextInt();
		System.out.println("Enter the firstname");
		Scanner sc1=new Scanner(System.in);
		String fname=sc1.nextLine();
		System.out.println("Enter the secondname");
		String sname=sc1.nextLine();
		System.out.println("Enter the lastname");
		String lname=sc1.nextLine();
		String q2="update author SET firstname='"+fname+"',middlename='"+sname+"',lastname='"+lname+"'where authorId="+author_id;
		Statement stmt=abc.createStatement();
		int n=stmt.executeUpdate(q2);
	}
	
	public static void Delete(Connection abc,Scanner sc) throws SQLException {
		System.out.println("Enter the ID of author to delete the record");
		int aid=sc.nextInt();
		String q3="delete from author where authorId="+aid;
		Statement stmt=abc.createStatement();
		int o=stmt.executeUpdate(q3);
	}
	
	public static void Display(Connection abc,Scanner sc) throws SQLException {
		System.out.println("Displaying the result");
		String dq="select * from author";
		Statement stmt=abc.createStatement();
		ResultSet rs=stmt.executeQuery(dq);
		System.out.print("Id |");
		System.out.print("First Name |");
		System.out.println("Middle Name |");
		System.out.println("Last Name |");
		System.out.println("Phone number |");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" |");
			System.out.println(rs.getString(2)+" |");
			System.out.println(rs.getString(3)+" |");
			System.out.println(rs.getString(4)+" |");
			System.out.println(rs.getInt(5)+" |");
			
		}
		
	}
public static void main(String args[]) throws SQLException {
	
	       Connection abc = connection();
			while(true) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("press 1 to create a new record");
				System.out.println("press 2 to update a new record");
				System.out.println("press 3 to delete a new record");
				System.out.println("press 4 to display the records");
				System.out.println("press 5 to get book title based on author name");
				System.out.println("press 6 to insert book and author details into database");
				System.out.println("press 7 to update the price of the book");
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
					Display(abc,sc);
					break;
				case 5:
					System.out.println("The Booktitle with respect to author name is ");
					Query1(abc,sc);
					break;
				case 6:
					Query2(abc,sc);
					break;
				case 7:
					Query3(abc,sc);
				case 8:
					System.out.println("Exiting from the program");
					abc.close();
					System.exit(0);
				default:
					System.out.println("Please Enter the Correct Value");
				}
			}
		}
	
		
	
}
