import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    //?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC


    static String userName="root";
    static String password="q123";
    static String dbUrl ="jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static void main(String[] args) throws SQLException{

        Connection connection=null;
            try{
                connection= DriverManager.getConnection(dbUrl,userName,password);
                System.out.println("bağlantı oluştu");

            }catch (SQLException exception){
                System.out.println(exception.getMessage());

            }finally {
                connection.close();

            }

    }
}
