package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectfx {
    public static void main(String[] args) throws Exception {
        System.out.println(1);
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println(2);
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/person1","root","root");
        System.out.println(3);
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from person1");
       // ResultSet resultSet1=statement.executeQuery("insert into person1 values 2,"kumar","Gopalganj");
        System.out.println(4);
        while (resultSet.next())
        {
            String id=resultSet.getString(1);
            String name=resultSet.getString(2);
            String address=resultSet.getString(3);
            System.out.println(5);
            System.out.println("id >>"+id);
            System.out.println("name >>"+name);
            System.out.println("Address  >>"+address);
        }
    }
}
