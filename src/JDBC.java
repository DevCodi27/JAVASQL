import java.sql.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;



public class JDBC {

    public static void main(String[] args)
    {
        try{
            Scanner sc = new Scanner(System.in);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employer",
                    "root",
                    "Sql@123");
            if(connection != null)
            {
                System.out.println("Connected");
            }
//            insert();
//            select();
//            delete();

        }catch (SQLException e)
        {
            e.printStackTrace();
        }


    }






}
