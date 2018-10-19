package database;

//  Query1.java:  Query an mSQL database using JDBC.

import java.sql.*;

class Main {

    public static void main (String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://10.243.124.78:5432/testdb","trainee","123456");
            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT * FROM public.person");
            while ( rs.next() ) {
                String lastName = rs.getString(1);
                System.out.println(lastName);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}