import java.sql.*;

public class Delete {
    public static void main(String[] args) {
        try {
            Class.forName(("com.mysql.cj.jdbc.Driver"));
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "gunace123");
            String q = "Delete from table1 where ID=3";
            PreparedStatement p = conn.prepareStatement(q);
            p.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
