import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) {

       /*
       host: 54.92.194.106
       port: 1521
       SID: XE
       user: hr
       password: hr
        */

        String url = "jdbc:oracle:thin:@54.92.194.106:1521:XE";

        try {
            Connection connection = DriverManager.getConnection(url, "hr", "hr");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
