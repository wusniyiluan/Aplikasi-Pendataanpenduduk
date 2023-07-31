/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KAMIL
 */
public class Koneksi {
    private static Connection koneksi;
    public static Connection getConnection() throws SQLException {
        String db = "jdbc:mysql://localhost:3306/data-penduduk";
        String user = "root";
        String pass = "";

        if(koneksi == null) {
            koneksi = DriverManager.getConnection(db, user, pass);
        }
        return koneksi;
    }
}
