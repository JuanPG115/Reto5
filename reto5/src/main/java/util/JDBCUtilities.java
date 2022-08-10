package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtilities {

    private static final String url = "jdbc:sqlite:C:\\Users\\jupgo\\Documents\\NetBeansProjects\\reto5\\src\\main\\java\\util\\ProyectosConstruccion.db";
    private Connection conn = null;

    public JDBCUtilities() {
    }

    public Connection getConnection() {
        try {
            setConn(DriverManager.getConnection(url));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return getConn();
    }

    public void closeConnection() {
        try {
            if (getConn() != null) {
                getConn().close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
