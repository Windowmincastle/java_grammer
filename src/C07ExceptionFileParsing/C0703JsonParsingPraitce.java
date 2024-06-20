package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C0703JsonParsingPraitce {

    public static void main(String[] args) throws IOException {

        ObjectMapper obj = new ObjectMapper(); //객체 만들고
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data1.json");
//        13라인 제이슨 경로 넣어주고

        String jsonStr = Files.readString(filePath); // 이렇게하면 알아서 그 경로에 가서 읽어와서 저장한다.
        System.out.println(jsonStr);
//        그런데 위 데이터는 읽어들인 것 뿐 이다.
//        아래 map 스타일로 출력이 가능하다
//        데이터타입이 JsonNode

        System.out.println(" map 형태 출력 시작");
        JsonNode data = obj.readTree(jsonStr);
        Map<String, String> testMap = new HashMap<>();
        testMap.put("id", data.get("id").asText());
        testMap.put("name", data.get("name").asText());
        testMap.put("classNumber", data.get("classNumber").asText());
        testMap.put("city", data.get("city").asText());

        System.out.println(testMap);
    }
}
