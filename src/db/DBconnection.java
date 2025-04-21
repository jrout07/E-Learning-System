package db;
import java.sql.*;

public class DBconnection {
    private static final String URL ="jdbc:mysql://localhost:3306/e_learning";
    private static final String USER ="root";
    private static final String PASSWORD ="2004";

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
