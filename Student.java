/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studentinfo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Student {
    static Connection con;
    public static void main(String [] args) throws Exception {
        Student obj = new Student();
        connect();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Students' Database");
        outer: while(true) {
            System.out.println("Enter 1. to insert\n2. to display\n3. to exit: ");
            switch(sc.nextInt()) {
                case 1:
                    System.out.print("Enter Student roll no. : ");
                    int id = sc.nextInt();
                    System.out.print("Enter Student name : ");
                    String n = sc.next();
                    System.out.print("Enter Student date of birth : ");
                    String d = sc.next();
                    System.out.print("Enter Student's father's name : ");
                    String fn = sc.next();
                    System.out.print("Enter Student's english marks : ");
                    double m1 = sc.nextDouble();
                    System.out.print("Enter Student's maths marks : ");
                    double m2 = sc.nextDouble();
                    System.out.print("Enter Student's science marks : ");
                    double m3 = sc.nextDouble();
                    System.out.print("Enter Student's hindi marks : ");
                    double m4 = sc.nextDouble();
                    
                    obj.insert(id,n,d,fn,m1,m2,m3,m4);
                    System.out.println("yugjh");
                    break;
                case 2 :
                    obj.display();
                    break ;
                case 3 :
                    break outer;
                default :
                    System.out.println("Wrong choice!");
            }
        }
    }
    public static void connect() {
        try {
            Student.class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/School [ on APP]");
            System.out.print(con);
            System.out.println("Connected Successfully !");
            
        } catch (Exception ex) {
            
            System.out.println(ex);
            ex.getStackTrace();
        }
    }

    public void insert(int rollno,String name,String dob,String fname, double mk1,double mk2,double mk3,double mk4) throws Exception {
            PreparedStatement ps = con.prepareStatement("Insert into STUDENT_INFO(Student_roll,"
                    + "Student_name,Student_birth_date,Father_name,English,Maths,Science,Hindi)"
                    + " values(?,?,?,?,?,?,?,?)");
            ps.setInt(1, rollno);
            ps.setString(2,name);
            ps.setString(3,dob);
            ps.setString(4,fname);
            ps.setDouble(5, mk1);
            ps.setDouble(6, mk2);
            ps.setDouble(7, mk3);
            ps.setDouble(8, mk4);
            if (ps.executeUpdate()>0) {
                System.out.println("Inserted successfully!");
            }
    }
    public ResultSet display() throws Exception {
            PreparedStatement ps = con.prepareStatement("select * from STUDENT_INFO");
            ResultSet rs = ps.executeQuery();
        return rs;
    }
}
