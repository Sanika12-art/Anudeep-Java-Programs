/* 2. Write a JDBC program to select  a record from a database (Table:Student: id,name,age,phone_no,email) */

mysql> USE college;

mysql> SELECT * FROM Student;
+-----+------+-----+------------+------------------+
| id  | name | age | phone_no   | email            |
+-----+------+-----+------------+------------------+
| 101 | Sani | 22  | 9306079354 | sani@gmail.com   |
| 102 | Pall | 21  | 9125465212 | pall@gmail.com    |
+-----+------+-----+------------+------------------+


Logic:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class SelectStudent {
    public static void main(String[] args) {

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college", "root", "root");

            
            Statement stmt = con.createStatement();

            String query = "SELECT * FROM Student";

            
            ResultSet rs = stmt.executeQuery(query);

            
            while(rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age") + " " +
                        rs.getString("phone_no") + " " +
                        rs.getString("email")
                );
            }

            
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

/*

OUTPUT:

101 Sani 22 9306079354 sani@gmail.com
102 Pall 21 9125465212 pall@gmail.com

*/