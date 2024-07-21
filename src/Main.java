import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
//            Scanner sc = new Scanner(System.in);
//            String employe_name = sc.next();
//            String employe_id = sc.next();
//            String Job_role = sc.next();
//            int Montly_salary = sc.nextInt();
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employer",
                    "root",
                    "Sql@123"
            );
            Statement statement = connection.createStatement();
//            String sql = "INSERT INTO EMPLOYEE"+"(ID,NAME,JOBROLE,SALARY,WRKEXP)"+"VALUES(0003,'JEYASEELAN','PHARMACIST',85000,14)";
//           statement.execute(sql);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");


            while (resultSet.next())
            {
                System.out.println(resultSet.getString("NAME"));
                System.out.println(resultSet.getString("JOBROLE"));
            }


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }


    }


}