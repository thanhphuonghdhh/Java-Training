import java.sql.*;

public class jdbcTest {

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
        if (a != null) System.out.println("OK");
        else System.out.println("fail");
        String query="SELECT * FROM committees;";

        //statement
        Statement s = a.createStatement();
        ResultSet rs =s.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
        String q1 = "INSERT INTO committees(name) values ('JOE')";
        String q2 = "DELETE FROM committees WHERE name='JOE'";
        //int i = s.executeUpdate(q1);
        boolean execute;
        //execute = s.execute(q1);
        execute = s.execute(query);
        if (execute) {
            rs = s.getResultSet();
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
        }
        rs.close();
        s.close();

        //PreparedStatement
        String preQuery = "UPDATE committees SET name = ? where committee_id=?";
        PreparedStatement ps = a.prepareStatement(preQuery);
        ps.setString(1,"JO");
        ps.setInt(2,1);
        ps.execute();

        //CallableStatement
        String csQuery = "{call getcombyname(?)}";
        CallableStatement cs = a.prepareCall(csQuery);
        cs.setString(1,"AMELA");
        rs = cs.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

        //transaction
        a.setAutoCommit(false);
        s.executeUpdate("insert into committees(name) values('An')");


    }
}
