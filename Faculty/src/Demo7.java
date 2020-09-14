import java.sql.*;

public class Demo7 
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","");
             String q= "Select *from detail3";
             Statement stmt = con.createStatement();
             ResultSet rs =stmt .executeQuery(q);
             while(rs.next())
             {
                 System.out.println(rs.getString("rno"));
                  System.out.println(rs.getString("name"));
                   System.out.println(rs.getString("marks"));
             }
             con.close();
        
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            
        }
    }
}
