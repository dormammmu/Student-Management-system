/**import java .sql.*;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee2;

/**
 *
 * @author sidd
 */
public class Demo1 {
    public static void main(String [] args)
    {
     try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:??localhost:3306?faculty","root","");
            String q = "insert into info values ('107','amit','HR','20000','987654390')";
            Statement stmt= con.createStatement();
            int rs = stmt.executeUpdate(q);
            if(rs!=0)
            {
                System.out.println("Succesful");
                
            }
            con.close();
        }
        catch (Exceptipon ex)
        {
            System.out.println(ex);
        }
        
    } 
}

    
