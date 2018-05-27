package com.multithread.code.chapter6.singleton10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Description: 使用枚举类创建单例对象
 * @Author: leiyulin
 * @date: 2018/5/27
 */
public class Singleton10Object {
    public enum EnumSingleton {
        connectionFactory;
        private Connection connection;

        private EnumSingleton() {
            try {
                System.out.println("创建Object对象");
                String url = "jdbc:mysql://localhost:3306/multithread";
                String username = "root";
                String password = "root";
                String driverName = "com.mysql.jdbc.Driver";
                Class.forName(driverName);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection(){
            return connection;
        }
    }

    public static Connection getConnection(){
        return EnumSingleton.connectionFactory.getConnection();
    }
}
