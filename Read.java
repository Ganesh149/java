import java.sql.*;

public class Read {
    public static void main(String[] args) {
        try {
            Class.forName(("com.mysql.cj.jdbc.Driver"));
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "gunace123");
            String q = "select * from table1";
            PreparedStatement p = conn.prepareStatement(q);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
