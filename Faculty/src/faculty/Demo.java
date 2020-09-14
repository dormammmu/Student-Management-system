import java.sql.*;
/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculty;

/**
 *
 * @author sidd
 */
public class Demo 
    {
        public static void main(String [] args)
        {
               try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty","root","");
                    String q="insert into profile values('111','ashok','80')";
                    Statement stmt = con.createStatement();
                    int rs=stmt.executeUpdate(q);
                    if(rs!=0)
                    {
                       System.out.println("SUCCESFUL");
                       
                    }
                        con.close();
                    
                }
               catch(Exception ex)
               {
                   
                   System.out.println(ex);
               }
        }
}
               }
    
    

