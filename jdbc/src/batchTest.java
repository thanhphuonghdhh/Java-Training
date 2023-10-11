import java.sql.*;

public class batchTest {

    public static Connection getJDBC() {
        final String url = "jdbc:mysql://localhost:3306/dmladvanced";
        final String user = "root";
        final String pass = "thanhphuong0350";
        try {
            return DriverManager.getConnection(url,user,pass);//Open Connection
        }  catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        Connection a = getJDBC();
        Statement s = a.createStatement();
        a.setAutoCommit(false);
        s.addBatch("insert into committees(name) values('Anh')");
        s.addBatch("insert into committees(name) values('Binh')");
        int[] c = s.executeBatch();
        ResultSet rs=s.executeQuery("select * from committees");
        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

        //a.commit();
    }
}
