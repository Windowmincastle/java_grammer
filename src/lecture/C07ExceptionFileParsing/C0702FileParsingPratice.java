package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C0702FileParsingPratice {

    public static void main(String[] args) throws IOException {

//         콘솔에서 읽기, 버퍼 때문에 성능이 좋다.
//        IO 패키지를 사용한다.
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        int intInput = Integer.parseInt(br.readLine()); // 버퍼리더로 파싱하고 형 변환
//
//        System.out.println(input);
//        System.out.println(intInput);

//        파일에서 읽어오기
//        System.in이 아니라 new FileReader로 읽어야 한다.
//        절대 경로 넣던지 루트경로로 넣던지 잘 되는 것을 확인할 수 있다. 위에 줄 주석 처리 해야함
//        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Playdata\\Desktop\\study\\java study\\java_grammer\\src\\C07ExceptionFileParsing\\test1.txt"));
//        String test;
//        while ((test = br2.readLine()) != null) {
//            System.out.println(test);
//        }


//        System.out.println("br3 테스트");
//
//        BufferedReader br3 = new BufferedReader(new FileReader("C:\\Users\\Playdata\\Desktop\\study\\java study\\java_grammer\\src\\C07ExceptionFileParsing\\test1.txt"));
//        String test1;
//        while ((test1 = br3.readLine()) != null) {
//            System.out.println(test1);
//        }

////      NIO 패키지
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/praticefile.txt");
//
//        String str = Files.readString(filePath); // 이렇게 파일 경로를 저장해서 매개변수로 넘겨줄 수 있다.
//        System.out.println(str); // 매개변수에 파일 경로를 저장해서 paths.get으로 불러서 path 변수에 저장한후 읽어올 수 있다.
//
//
//        try {
//
////        문자열의 각 라인을 잘라 list 형태로 read
//            System.out.println("list 형태로 read");
//            List<String> lst = Files.readAllLines(filePath); // Files.readAllLines(매개변수)를 통해서 좌측에 넣는다.
//            for (String s : lst) {
//                System.out.println(s);
//            }
//        } catch (IOException e) {
//            e.printStackTrace(); // 이정도로 충분.
//        }

//        파일쓰기
////        append 추가, wirte 덮어쓰기 , create_new 생성
//        Path fileWriteTest = Paths.get("src/C07ExceptionFileParsing/writeTest!.txt");
//
//        if (Files.exists(fileWriteTest)) {
//            Files.write(fileWriteTest, "김민성 테스트\n".getBytes(), StandardOpenOption.APPEND);
//        } else {
//            Files.write(fileWriteTest, "".getBytes(), StandardOpenOption.CREATE_NEW);
//        }

//        파일쓰기 2번째

        Path write2 = Paths.get("src/C07ExceptionFileParsing/write2.txt");

        if (Files.exists(write2)) {

            Files.write(write2, "테스트 1\n".getBytes(), StandardOpenOption.APPEND);

        } else {
            Files.write(write2, "create하고 계속 쓰기\n".getBytes(), StandardOpenOption.CREATE_NEW);
        }


        Path w3 = Paths.get("src/C07ExceptionFileParsing/write3.txt");

        if (Files.exists(w3)) {
            Files.write(w3, "asdfasdf".getBytes(), StandardOpenOption.APPEND);
        } else {
            Files.write(w3, "".getBytes(), StandardOpenOption.CREATE_NEW); //존재하지 않는다면 내용이 없는 파일을 만드는 것.

        }

    }

}