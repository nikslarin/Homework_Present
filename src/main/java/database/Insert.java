package database;
import java.sql.*;


class Insert {

    public static void main (String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://10.243.124.78:5432/testdb","trainee","123456");
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO purchase " +
                    "VALUES ('Small Widget', 'GA', '2011-07-15', 7.00)");
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
}