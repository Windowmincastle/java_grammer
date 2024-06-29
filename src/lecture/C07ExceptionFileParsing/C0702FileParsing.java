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

public class C0702FileParsing {

    public static void main(String[] args) throws IOException {

//      콘솔에서 읽기, 버퍼 떄문에 성능이 좋다.
//        IO 패키지를 사용한다.
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String input = br1.readLine(); // 한 줄을 읽기
        System.out.println(input);

//        파일에서 읽기
//        파일에서 우클릭 -> 소스경로 복사해서 넣기
        BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFileParsing/test_file.txt"));
        System.out.println(br2.readLine());

////        종종 볼수있는 패턴,
        String line = br2.readLine();
        while ((line = br2.readLine()) != null) {
            System.out.println(line);
        }

//        NIO 패키지가 뭔데?
//        NIO 패키지를 사용한 파일처리
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_file.txt");

        try {
            //        문자열 통째로 read
            String st1 = Files.readString(filePath);
            System.out.println(st1);
            //        문자열을 각 라인을 잘라 list 형태로 read
            List<String> st2 = Files.readAllLines(filePath);
            System.out.println("st2 입력");
            for (String s2 : st2) {

                System.out.println(s2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        파일쓰기, 강의에서는 test_file 지웟지만 난 이름 바꿔서 실습 진행햇음
//        append(추가), wirte(덮어쓰기)
//        create_new(생성)

        Path filePath2 = Paths.get("src/C07ExceptionFileParsing/test_file2.txt");

        if (Files.exists(filePath2)) {
            Files.write(filePath2, "홍길동\n".getBytes(), StandardOpenOption.APPEND);
        } else {
            Files.write(filePath2, "".getBytes(), StandardOpenOption.CREATE_NEW);
        }


    }

}
