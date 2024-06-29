//package C07ExceptionFileParsing;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class C0705JsonPArsing3 {
//
//    public static void main(String[] args) throws IOException, InterruptedException {
////      Spring에서는 RestTemplate을 통해 Http 요청하고
////        여기서는 java에 내장된 http클라이언트 사용.
////        http 클라이언트가 java에 내장되어 있다
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
//                .GET()
//                .build();
//
//
//        HttpResponse<String> response =
//                client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        String posts = response.body();
////        System.out.println(posts);
//        ObjectMapper obj = new ObjectMapper();
//        JsonNode jsonNode = obj.readTree(posts);
//        List<Post> lst = new ArrayList<>();
//        for (JsonNode j : jsonNode) {
//            lst.add(obj.readValue(j.toString(), Post.class));
//        }
//        System.out.println(lst);
//
////        List<Post> 객체를 json으로 직렬화
//        String postJson = obj.writeValueAsString(lst);
////
////        System.out.println(lst);
//        for (Post p : lst) {
//            System.out.println(p);
//        }
//
//    }
//
//}
//
//class Post {
////자동으로 객체를 만들어줄 때  특히 JPA? getter , setter
//    private int userId;
//    private int id;
//    private String title;
//    private String body;
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getBody() {
//        return body;
//    }
//
//    @Override
//    public String toString() {
//        return "id:"+this.id+" title:"+this.title;
//    }
//}