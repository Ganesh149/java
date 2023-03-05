import java.sql.*;

public class MyConnection {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students",
                    "root",
                    "gunace123");

            String q = "Create table table1 (ID int(20) primary key, Name varchar(100), Age int(10))";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}