import java.sql.*;
import java .util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidd
 */
public class Demo6 
{
     public static void main(String[] args)
     {    
        try
       {
               Scanner sc = new Scanner(System.in);
               Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root",""); 
              System.out.println("enter roll.no, name,marks");
              int r=sc.nextInt();
                String name = sc.next();
               float marks=sc.nextFloat();
                String q = "insert into detail values ('"+r+"','"+name+"','"+marks+"')";
                 Statement stmt = con.createStatement();
                  int rs= stmt.executeUpdate(q);
                     if(rs!=0)
                       {
                          System.out.println("save");
                        }
                              con.close();
        }
                catch(Exception ex)
                    {
                        System.out.println(ex);
                      }


    }
    
}
