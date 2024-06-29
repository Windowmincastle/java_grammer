package C09ServerSocket;
import java.sql.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class C0901Webserver3 {
    public static void main(String[] args) throws IOException, SQLException {

//        소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개념
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081 서비스 시작");

//        http 프로토콜 약속 -> 불편함을 느껴야한다.
//        규격,직접코딩 -> 스프링에가면 알아서 규격을 맞춰준다.
        while (true) {
//            accept(): 클라이언트의 연결 요청을 수락하는 것 .
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();

            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {

                sb.append(line+"\n");

            }

            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String id = "";
            String name = "";
            String email = "";


            if (infos.contains("?")) {
                String st1 = infos.split("\\?")[1];
                String[] stArr = st1.split("&");
                for (String s : stArr) {
                    String[] keyValue = s.split("=");
                    if (keyValue[0].equals("id")) {
                        id = keyValue[1];
                    }
                }
            }


            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n"+"Hello world";
//           UTF-8 문자열을 return
            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush(); // 플러시란 일반적으로 변경사항을 확정(반영)하는 것을 의미한다.
            socket.close();

            //      db 로컬 ip:localhost port:3306

//        mysql 자리에 mariadb로 바꾸고 드라이버를 하나 받으면 된다
//        지금은 mysql을 사용하기 때문에 mysql 드라이버가 필요하다
            String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
            String userName = "root";
            String password = "1234";

//      프린트기 사면 드라이버 깔아야하듯이 깔아야함.
            Connection con = DriverManager.getConnection(url, userName, password);
            System.out.println("DB 연결 성공");
//          이거 직접할줄 알아야 한다.
//        statement : 쿼리를 담아 db로 쿼리 전달하는 객체
            Statement st = con.createStatement();
            String myQuery = "SELECT * FROM Author where"; // Author로 변경
            ResultSet rs = st.executeQuery(myQuery);

            int userId = 0;
            String dbName = "";
            String dbEmail = "";
            String userPassword = "";

            while (rs.next()) {
                userId = rs.getInt("id");
                dbName = rs.getString("name");
                dbEmail = rs.getString("email");
                userPassword = rs.getString("password");
                System.out.println(userId+" "+ dbName+" "+dbEmail+" "+ userPassword); // 전체 조회할 수 있따.
            }
        }
    }
}
