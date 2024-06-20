package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C0703JsonParsing1 {

    public static void main(String[] args) throws IOException {

        ObjectMapper objmp = new ObjectMapper();
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data1.json");
        String jsonString = Files.readString(filePath);
        System.out.println(jsonString);

//        System.out.println("위 데이터는 읽어들인 것 뿐 이다.");
//        System.out.println("아래 map 스타일로 출력 가능");
//// 데이터타입이 JsonNode 다.
//        JsonNode data1 = objmp.readTree(jsonString);
////        readTree : 트리구조의 JsonNode로 변환
////        JsonNode Tree구조의 장점은 유연함인데. 지금은 이런 트리구조로 복잡도가 있는 자료
//        Map<String, String> studentMap = new HashMap<>();
//        studentMap.put("id", data1.get("id").asText()); // 이렇게 넣고 꺼낸다
//        studentMap.put("name", data1.get("name").asText()); // 이렇게 넣고 꺼낸다
//        studentMap.put("classNumber", data1.get("classNumber").asText()); // 이렇게 넣고 꺼낸다
//        studentMap.put("city", data1.get("city").asText()); // 이렇게 넣고 꺼낸다
//
//        System.out.println(studentMap);

//        readValue : 바로 객체로 변환
        Map<String, String> studentMap2 = objmp.readValue(jsonString, Map.class);
        System.out.println(studentMap2+" 출력라인");
        System.out.println("sutdentMap2 출력 후");

//        Student객체 생성 및 toString() 오버라이딩
        Student student3 = objmp.readValue(jsonString, Student.class);
//        setter를 만들어서 json데이터를 바로 할당할 수 있다.
        System.out.println(student3);
        System.out.println("student3 끝");




    }

}

class Student{

//    어떻게 setter도 없는데 getter만으로도 private 멤버 변수에 접근해서 readValue가 알아서
//    저장을 하나? 의문을 가져야한다.
//    메서드명을 통해서 필드값을 유추한다.

//    실제 값의 셋팅은 리플렉션이라는 기술을 통해 변수값에 할당한다.
//    리플렉션은 런타임 상황에서 동작하는 것 이며, 클래스 / 메서드 / 변수에 직접 접근


    private int id;
    private String name;
    private String classNumber;
    private String city;




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return this.name+" "+this.classNumber+" "+this.city;
    }

}

