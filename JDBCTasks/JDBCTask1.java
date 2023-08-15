package JDBCTasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTask1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/restaurant_db";
        String user = "root";
        String password ="";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_category");
            while(rs.next()){
                System.out.println(rs.getInt(1));
            }
            connection.close();
        }

        catch (Exception ee){
            System.out.println(ee);
        }


    }
}
