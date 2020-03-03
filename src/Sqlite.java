import java.sql.*;
public class Sqlite {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\towfi\\Downloads\\Compressed\\Java\\Java1\\JavaApplication12\\StudentDatabase.sqlite");
            System.out.println("Connected");
            return conn;
        }
        
        catch(Exception e){
        System.out.println("Not connected");
        }
        return null;
    }
}