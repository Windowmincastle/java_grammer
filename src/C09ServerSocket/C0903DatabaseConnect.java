package C09ServerSocket;

import java.sql.*;

public class C0903DatabaseConnect {

    public static void main(String[] args) throws SQLException {

//      로컬 ip:localhost port:3306

//        mysql 자리에 mariadb로 바꾸고 드라이버를 하나 받으면 된다
//        지금은 mysql을 사용하기 때문에 mysql 드라이버가 필요하다
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String password = "1234";

//      프린트기 사면 드라이버 깔아야하듯이 깔아야함.
        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println("DB 연결 성공");

//        statement : 쿼리를 담아 db로 쿼리 전달하는 객체
        Statement st = con.createStatement();
        String myQuery = "SELECT * FROM post";
        ResultSet rs = st.executeQuery(myQuery);

        int id = 0;
        String name = "";
        String email = "";
        String userPassword = "";

        while (rs.next()) {
            id = rs.getInt("id");
            name = rs.getString("name");
            name = rs.getString("email");
            userPassword = rs.getString("password");
            System.out.println(id+" "+ name+" "+email+" "+ userPassword); // 전체 조회할 수 있따.
        }

    }

}
