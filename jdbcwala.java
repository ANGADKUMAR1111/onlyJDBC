/* public class margeTable {
    
} */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbcwala {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/somthing";
        String user = "root";
        String password = "Angad@19027k";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM employees JOIN employee2 ON employees.employee_id = employee2.employee_id";

            
         statement.executeQuery(sqlQuery);
            statement.close();
            connection.close();
            System.out.println("created");
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
