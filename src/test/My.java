package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class My {
        static final String host = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)}; DBQ=c:\\base.mdb;";
        static final String user = "postgres";
        static final String pass = "22091985";

        public static String RS() throws Exception
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        }

        public static int RI() throws Exception
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(reader.readLine());
        }

        public static void readLn() throws Exception
        {
            My.RS();//
        }
        public static String test()
        {
            try (
                    Connection conn = DriverManager.getConnection(host, user, pass);
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from clients")
      /* stmt.executeUpdate for insert, update or delete */
            ) {
                while(rs.next()) {
                    //int id = rs.getInt("id");
                    String client = rs.getString("Client");
                    //String phone = rs.getString("phone");
                    //Date changed = rs.getDate("last_changed");

                    System.out.println(client);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return "test ok";
        }
    }

