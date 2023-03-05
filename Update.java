import java.sql.*;
public class Update {
    public static void main(String[] args) {
        try {
            Class.forName(("com.mysql.cj.jdbc.Driver"));
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "gunace123");
            String q = "update table1 set Name='Gunace' where ID=1";
            PreparedStatement p = conn.prepareStatement(q);
           p.executeUpdate();
            System.out.println("Data updated");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
