package university.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;        
    
    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "codeforprojects");
            s = c.createStatement();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}