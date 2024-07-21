package com.db.example.dao;

import com.db.examples.vo.EmployeeVo;

import java.sql.*;
import java.util.Scanner;

public class EmployeeDao {

     public  void insert(){
         EmployeeVo er = new EmployeeVo();
            try{
                Scanner sc = new Scanner(System.in);
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employer",
                        "root",
                        "Sql@123");

//           Statement statement = connection.createStatement();
                String sql = "INSERT INTO EMPLOYEE(ID,NAME,JOBROLE,SALARY,WRKEXP) VALUES(?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1,er.getEmployeeId());
                statement.setString(2, er.getEmployeeName());
                statement.setString(3, er.getJobRole());
                statement.setInt(4,er.getSalary());
                statement.setInt(5,er.getWrk_exp());
                int rowsInserted = statement.executeUpdate();
            }  catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    public  void delete()
    {
        EmployeeVo er = new EmployeeVo();
        try{
            Scanner sc = new Scanner(System.in);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employer",
                    "root",
                    "Sql@123");
            System.out.println("Enter the ID for Delete");
            String sql = "DELETE FROM EMPLOYEE WHERE ID =?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,er.getEmployeeId());
            int number_affected = statement.executeUpdate();
            System.out.println(number_affected);
            System.out.println("DELETE COMPLETED");


        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public  void select()
    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employer",
                    "root",
                    "Sql@123");
            Statement stat = connection.createStatement();
            ResultSet resultSet= stat.executeQuery("SELECT * FROM EMPLOYEE");
            int cnt = 0;
            System.out.println("S.NO "+"ID "+"Name "+"JobRole "+"Salary "+"WorkExperience ");
            while (resultSet.next())
            {
                int ID = resultSet.getInt(1);
                String Name = resultSet.getString("NAME");
                String JobROle = resultSet.getString("JOBROLE");
                int salary = resultSet.getInt(4);
                int we = resultSet.getInt(5);

                System.out.println(++cnt+" "+ID+" "+Name+" "+ JobROle+" "+salary+" "+we);

            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
    }

