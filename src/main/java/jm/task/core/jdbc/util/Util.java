package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection connection;
    static final String hostName = "localhost";
    static final String dbName = "dbusers";
    static final String userName = "root1";
    static final String password = "root1";
    static final String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(connectionURL, userName, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (
                    SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
