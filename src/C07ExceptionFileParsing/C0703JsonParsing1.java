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

        System.out.println("위 데이터는 읽어들인 것 뿐 이다.");
        System.out.println("아래 map 스타일로 출력 가능");
// 데이터타입이 JsonNode 다.
        JsonNode data1 = objmp.readTree(jsonString);
//        readTree : 트리구조의 JsonNode로 변환
//        JsonNode Tree구조의 장점은 유연함인데. 지금은 이런 트리구조로 복잡도가 있는 자료
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("id", data1.get("id").asText()); // 이렇게 넣고 꺼낸다
        studentMap.put("name", data1.get("name").asText()); // 이렇게 넣고 꺼낸다
        studentMap.put("classNumber", data1.get("classNumber").asText()); // 이렇게 넣고 꺼낸다
        studentMap.put("city", data1.get("city").asText()); // 이렇게 넣고 꺼낸다

        System.out.println(studentMap);

//        readValue : 바로 객체로 변환
        Map<String, String> studentMap2 = objmp.readValue(jsonString, Map.class);
    }

}

