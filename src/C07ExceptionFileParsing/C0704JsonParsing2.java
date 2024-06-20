package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C0704JsonParsing2 {

    public static void main(String[] args) throws IOException {

//        test_data2의 데이터를 student 형태로 출력
//        ObjectMapper obj = new ObjectMapper(); //json파싱 객체를 생성하고
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data2.json"); //파일 경로를 변수에 담아서
//        String jsonString = Files.readString(filePath); //파일 데이터를 readString으로 읽어와서
//        JsonNode data2 = obj.readTree(jsonString); // readtree로 JsonNode데이터 타입 변수에 담는다
////        Map<String, String> studentMap = obj.readValue(jsonString, Student.class);
//        List<Student> student5 = new ArrayList<>();
////      Student 데이터 타입을 List 형태로 담아서 아래 반복문으로 readValue로 담을 수 있다
//        for (JsonNode j : data2) {
//            Student temp = obj.readValue(j.toPrettyString(), Student.class);
//            student5.add(temp);
//        }
//
//        System.out.println(student5);

//        아래의 경우는 통신이 안되기 때문에 로컬에서 사용하는 방법같다.
        ObjectMapper obj1 = new ObjectMapper();
        Path fp = Paths.get("src/C07ExceptionFileParsing/test_data2.json");
        String jsn = Files.readString(fp);
        JsonNode data = obj1.readTree(jsn);
        List<Student> studentlst = new ArrayList<>();

//        JsonNode 데이터 타입을 Student.class로 변환해서 Student타입의 List에 담아서 다 더해주고
        for (JsonNode j : data) {
//            readValue를 통해서 맵핑된 데이터를 직렬화 하는듯????
            Student temp = obj1.readValue(j.toPrettyString(), Student.class);
            studentlst.add(temp);
        }
// 그럼 해당 데이터가 studentlst에 다 담겨있을테니 하나씩 꺼낼 수 있다
        for (Student s : studentlst) {
            System.out.println(s);
        }
    }

}
