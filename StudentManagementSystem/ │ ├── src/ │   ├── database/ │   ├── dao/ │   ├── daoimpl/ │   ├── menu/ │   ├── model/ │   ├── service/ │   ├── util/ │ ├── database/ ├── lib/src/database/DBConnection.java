package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Database URL
    private static final String URL =
            "jdbc:mysql://localhost:3306/student_management";

    // XAMPP default username
    private static final String USERNAME = "root";

    // XAMPP default password
    private static final String PASSWORD = "";

    private DBConnection() {
    }

    public static Connection getConnection() {

        Connection connection = null;

        try {

            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    URL,
                    USERNAME,
                    PASSWORD
            );

        } catch (ClassNotFoundException e) {

            System.out.println("MySQL Driver Not Found.");

        } catch (SQLException e) {

            System.out.println("Database Connection Failed.");

            e.printStackTrace();
        }

        return connection;
    }
}
