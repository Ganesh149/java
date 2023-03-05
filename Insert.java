import java.sql.*;

public class Insert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "gunace123");

            String q = "insert into table1 (ID, Name, Age) values(1,'Ganesh',25)";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);

            System.out.println("Data inserted");

            con.close();

        }

        catch (Exception e) {
            System.out.println(e);
        }
    }

}
