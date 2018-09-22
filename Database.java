/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pro
 */
public class Database {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        try (Connection conn = DriverManager.getConnection(url, "root", ""); Statement st = conn.createStatement();) {
            //conn.setAutoCommit(true);
       
           st.execute("create table if not exists "+
                   " contacts (name TEXT,phone INTEGER,email TEXT)");
//           st.execute("insert into contacts (name,phone,email)"
//                   + "values ('bright',3354443,'bright@gmail.com')   ");

//st.execute("Delete from contacts where name='bright'");

//st.execute("Select * from country");
//ResultSet rs = st.getResultSet();
  
ResultSet rs = st.executeQuery("select * from country");
System.out.println("Name ----- Continents");
while (rs.next()){
    System.out.println("|"+rs.getString("Name")+" : "+ rs.getString("Continent")+"|");
}

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
