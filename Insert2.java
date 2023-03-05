import java.sql.*;

public class Insert2 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "gunace123");
            // String q = "insert into table1 (ID,Name,Age) values(?,?,?)";
            // create insert statement to insert unknown values
            String q = "insert into table1 (ID,Name,Age) values(?,?,?)";
            PreparedStatement psmt = con.prepareStatement(q);

            psmt.setInt(1, 2);
            psmt.setString(2, "Asha");
            psmt.setInt(3, 25);
            psmt.executeUpdate();
            System.out.println("Data inserted");

            con.close();

        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}