import java.sql.Connection;
import java.sql.DriverManager;

class DatabaseConnection{
    private static String url = "jdbc:mysql://localhost:3306/forjdbc";
    private static String name = "root";
    private static String password = "rajni";

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