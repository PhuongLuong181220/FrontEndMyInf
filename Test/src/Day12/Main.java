package Day12;

import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    static String DB_IFNO= "jdbc:mysql://localhost:3306/lab01";
    static String USER_NAME = "root";
    static String PASS = "181220";

    public static void main(String[] args) throws SQLException {
        insert("C06","IT",2022);
    }
    static void insert(String ClassID, String ClassName, int Year) throws SQLException {
        // B1: tao ket noi den csdl
        Connection conn = DriverManager.getConnection(DB_IFNO,USER_NAME,PASS);
        conn.setAutoCommit(false);
        // b2: tao statement tu doi tuomg connection de viet cau lenh truy van
        //cau lenh tuong tac voi csdl
        /* câu lệnh PreparedStatement*/
        String insertSql = "INSERT INTO class (ClassID, ClassName, Year) VALUES (?,?,? )";
        PreparedStatement preparedStatement = conn.prepareStatement(insertSql);
        preparedStatement.setString(1,ClassID);
        preparedStatement.setString(2,ClassName);
        preparedStatement.setInt(3,Year);

        PreparedStatement preparedStatement_2 = conn.prepareStatement(insertSql);
        preparedStatement_2.setString(1,ClassID +"_1");
        preparedStatement_2.setString(2,ClassName+"_1");
        //preparedStatement_2.setInt(3,Year+1);


        preparedStatement.execute();
        /*câu lệnh statement
        Statement sqlStatement = conn.createStatement();
        String insertSql = "INSERT INTO class (ClassID, ClassName, Year) VALUES ('" + ClassID + "','" + ClassName + "','" + Year + "')";*/
        //b3
        //sqlStatement.execute(insertSql);
        //sqlStatement.close();
        conn.commit();
        conn.close();

    }
    static void getall() throws SQLException {
        // B1: tao ket noi den csdl
        Connection conn = DriverManager.getConnection(DB_IFNO,USER_NAME,PASS);
        // b2: tao statement tu doi tuomg connection de viet cau lenh truy van
        //cau lenh tuong tac voi csdl
        Statement sqlStatement = conn.createStatement();
        String selectSql = "SELECT * FROM khachhang";
        //b3
        ResultSet ketQua = sqlStatement.executeQuery(selectSql);
        while (ketQua.next()){
            System.out.println(ketQua.getString(1) +" "+ ketQua.getString(2)+" "+ ketQua.getString(3)
                    +" " +ketQua.getString(4) +" "+ ketQua.getDate(5)+" "+ ketQua.getDate(6)+" "+ketQua.getInt(7));

        }
        sqlStatement.close();
        conn.close();
    }
}
