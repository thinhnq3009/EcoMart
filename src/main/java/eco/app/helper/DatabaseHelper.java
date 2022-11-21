/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eco.app.helper;

import eco.app.entity.Entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class DatabaseHelper {
   
    public static Connection openConnect() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectUrl = "jdbc:sqlserver://localhost;database=EcoMart;";
        String userDB = "sa";
        String passworDB = "songlong";
        Connection conn = DriverManager.getConnection(connectUrl, userDB, passworDB);
        return conn;
    }

    private static PreparedStatement prepareStatement(String sql, Object[] args) throws Exception {
        Connection conn = openConnect();
        PreparedStatement pstmt = conn.prepareCall(sql);
        for (int i = 0; i < args.length; i++) {
            pstmt.setObject(i + 1, args[i]);
        }
        return pstmt;
    }

    public static boolean excuteUpdate(String sql, Object... args) throws Exception {
        PreparedStatement pstm = prepareStatement(sql, args);
        boolean result = pstm.executeUpdate() > 0;
        pstm.getConnection().close();
        return result;
    }

    public static ResultSet excuteQuery(String sql, Object... arsg) throws Exception {

        PreparedStatement pstmt = prepareStatement(sql, arsg);

        return pstmt.executeQuery();

    }
        

}
