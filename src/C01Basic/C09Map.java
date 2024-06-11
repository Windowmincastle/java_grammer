package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();

        myMap.put("basketball", "농구");
        myMap.put("soccer", "축구");
        myMap.put("baseball", "야구");
        System.out.println(myMap);

        System.out.println(myMap.get("soccer"));

        myMap.put("baseball", "크리켓");
        System.out.println(myMap.get("baseball"));

        myMap.remove("baseball");
//        remove로 value 삭제는 안되나 ?

        System.out.println(myMap);

//      key를 통해서 검색할 때 빠른 것 이다. 왜냐하면 key가 해시함수를 통해서 idx화 되어 있기 때문에

//        비어있으면 put 하겠다.
        myMap.putIfAbsent("basektball", "배구");
        System.out.println(myMap);
//        getOrDefault : key가 없으면 default값 retrun
        System.out.println(myMap.getOrDefault("baseball","비어잇음"));

        String[] arr = {"농구", "농구", "배구", "야구", "배구"};

        System.out.println("myMap2 시작");
        Map<String, Integer> myMap2 = new HashMap<>();

        for (String a : arr) {

//            if (myMap2.containsKey(a)) {
//                myMap2.put(a,myMap2.get(a)+1);
//            } else {
//                myMap2.put(a, 1);
//            }

//            위 코드를 간결하게 한줄로 할수있다.
            myMap2.put(a,myMap2.getOrDefault(a,0)+1); // 꼭 알아두자 활용도가 높기 때문에

        }


        System.out.println(myMap2);

//        ketSet() : 키 목록을 반환
//        values() : value 목록을 set 형태로 반환

//        map은 강화된 for문을 통해서 key값 하나 씩 출력할 수 있다. 컬렉션데이터자료구조면 다 가능하다고한다.
        for (String x : myMap2.keySet()) {
            System.out.println(x);
            System.out.println(myMap2.get(x));

        }

        for (int value : myMap2.values()) {
            System.out.println(value);
        }

        System.out.println();

        System.out.println("myIter 시작");

//        iterator를 통해 key값 하나 씩 출력
        Iterator<String> myIter = myMap2.keySet().iterator();
//        next()메서드는 데이터를 하나씩 소모시키면서 return 한다
        System.out.println(myIter.next());
        System.out.println(myIter);

//        hasNext() : iterator 안에 값이 있는지 없는지 boolean 값 return

        while (myIter.hasNext()) {
            System.out.println(myIter.next());
        }

//        의상 문제

//       LinkedHashMap : 데이터 삽입 순서가 유지된다. 이런 자료구조가 있다는 것을 기억해야한다.
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("hello5",1);
        linkedMap.put("hello4",1);
        linkedMap.put("hello3",1);
        linkedMap.put("hello2",1);
        linkedMap.put("hello1",1);
        System.out.println(linkedMap);


//      TreeMap : key를 통해 데이터를 정렬. -> 이것은 많이 사용되는 개념이다. (내부적으로 최적화된 정렬일 것 이다.)
        Map<String, Integer> treemap = new TreeMap<>();
        linkedMap.put("hello5",1);
        linkedMap.put("hello4",1);
        linkedMap.put("hello3",1);
        linkedMap.put("hello2",1);
        linkedMap.put("hello1",1);
        System.out.println(treemap);


    }
}
