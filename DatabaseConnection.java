import java.sql.Connection;
import java.sql.DriverManager;

class DatabaseConnection{
    private static String url = "jdbc:mysql://localhost:3306/table_name";
    private static String name = "your_database_name";
    private static String password = "your_mySql_password";

    public static Connection getConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url,name,password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
