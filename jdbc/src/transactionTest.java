import java.sql.*;

public class transactionTest {

    public static Connection getJDBC() {
        final String url = "jdbc:mysql://localhost:3306/dmladvanced";
        final String user = "root";
        final String pass = "thanhphuong0350";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//load driver
            //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection(url,user,pass);//Open Connection
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        Connection a = getJDBC();
        Statement s = a.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        //transaction
        a.setAutoCommit(false);
        try {
            s.executeUpdate("insert into committees(name) values('An')");
            ResultSet rs = s.executeQuery("select * from committees");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
            System.out.println("ok");
            s.executeUpdate("insert into committees(name) values(1,1)");
            ResultSet rs1 = s.executeQuery("select * from committees");
            while (rs1.next()) {
                System.out.println(rs1.getInt(1) + " " + rs1.getString(2));
            }
            System.out.println("ok");
        }
        catch (Exception e) {
            a.rollback();
            System.out.println("roll back");
            ResultSet rs1 = s.executeQuery("select * from committees");
            while (rs1.next()) {
                System.out.println(rs1.getInt(1) + " " + rs1.getString(2));
            }
        }
    }
}
