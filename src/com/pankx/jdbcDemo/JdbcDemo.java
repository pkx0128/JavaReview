package com.pankx.jdbcDemo;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args ){
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //获取数据库连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/my_db","root","Pankx0128");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM persons");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println("personID：" + resultSet.getInt("personID") + " FirstName： " +
                        resultSet.getString("FirstName") + " LastName: " + resultSet.getString("LastName")+
                         "Age:" + resultSet.getInt("Age"));
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
