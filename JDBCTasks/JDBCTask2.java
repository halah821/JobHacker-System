package JDBCTasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCTask2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password ="";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement st = connection.createStatement();

            String createTable = "CREATE TABLE `company_db`.`Employee` (" +
                    "  `Id` INT NOT NULL," +
                    "  `F_Name` VARCHAR(45) NULL," +
                    "  `L_Name` VARCHAR(45) NULL," +
                    "  `Sex` TINYINT NULL," +
                    "  `Age` TINYINT NULL," +
                    "  `Address` VARCHAR(150) NULL," +
                    "  `Phone_Number` VARCHAR(45) NULL," +
                    "  `Vacation_Balance` TINYINT NULL DEFAULT 30," +
                    "  PRIMARY KEY (`Id`))";

            st.executeUpdate(createTable);


            String insertRecords="INSERT INTO Employee (Id,F_Name,L_Name,Sex,Age,Address,Phone_Number) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertRecords);

            insertRecord(preparedStatement,1,"Hala","Farag",1,34,"Beni-suef-Egypt","123-456789") ;
            insertRecord(preparedStatement,2,"Tamim","Mohammed",0,48,"Beni-suef-Egypt","123-456789") ;
            insertRecord(preparedStatement,3,"Cyrine","Mohammed",1,5,"Beni-suef-Egypt","123-456789") ;
            insertRecord(preparedStatement,4,"Hussein","Farag",0,75,"Beni-suef-Egypt","123-456789") ;
            insertRecord(preparedStatement,5,"Mohammed","Roshdy",0,38,"Beni-suef-Egypt","123-456789") ;



            String updateEmployeeVacationBalance="UPDATE Employee" +
                    "                    SET Vacation_Balance = 45" +
                    "                    WHERE Age >=45";
            String updateEmployeeF_NameForFemales="UPDATE Employee" +
                    "                    SET F_Name = CONCAT('Mrs.',F_Name)" +
                    "                    WHERE Age >=45 AND Sex=1";
            String updateEmployeeF_NameForMales="UPDATE Employee" +
                    "                    SET F_Name = CONCAT('Mr.',F_Name)" +
                    "                    WHERE Age >=45 AND Sex=0";
            st.addBatch(updateEmployeeVacationBalance);
            st.addBatch(updateEmployeeF_NameForFemales);
            st.addBatch(updateEmployeeF_NameForMales);
            st.executeBatch();

            connection.close();
        }
        catch (Exception ee){
            System.out.println(ee);
        }
    }
    public static void insertRecord(PreparedStatement preparedStatement,int id,String firstName,String lastName,int gender,int age,String address,String phoneNo){
        try {
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,firstName);
            preparedStatement.setString(3,lastName);
            preparedStatement.setInt(4,gender);
            preparedStatement.setInt(5,age);
            preparedStatement.setString(6,address);
            preparedStatement.setString(7,phoneNo);
            preparedStatement.executeUpdate();
        }
        catch (Exception ee){
            System.out.println(ee);
        }
    }
}
