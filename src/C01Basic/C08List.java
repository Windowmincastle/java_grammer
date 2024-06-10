package C01Basic;

import java.util.*;
import java.util.stream.Collectors;

public class C08List {

    public static void main(String[] args) {

////        List 선언 방법
//        ArrayList<String> myList = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
////        가장 일반적인 List 선언 방법
////        왼쪼겐 인터페이스 , 오른쪽엔 구현체
////        왼족에 인터페이스를 써주고 오른쪽엔 구현체를 써주는 것이 일반적인 선언 방식이다.
//        List<String> myList3 = new ArrayList<>();
//
//
////      초기값 생성 방법 1. 하나씩 add 하는 방법
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("c++");
////       초기값 생성 방법 2. 리스트를 주입
//        String[] myArr = {"java", "test", "test1"};
//        int[] myArr2 = {1, 2, 3, 4, 5};
////        배열은 형이 맞지 않기 때문에 형 변환을 통해서 넣어줘야한다.
////        Arrays.asList는 배열을 리스트로 변환하는 메서드
//        List<String> myList4 = new ArrayList<>(Arrays.asList(myArr));
////        int 배열은 참조자료형이기 때문에 넣을 수 있다. 30라인 참고
////        List<int[]> myList5
//        List<Integer> myList5 = new ArrayList<>();
//
//        for (int i : myArr2) {
//            myList5.add(i);
//        }
//
////        List.of 도 있다. 기억하자.
//        ArrayList<String> myList6 = new ArrayList<>(List.of(myArr));
////
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(120);
//        System.out.println(myList); // toString이 내장 되어있기 때문에 그냥 출력이 된다.
////        add(index,값) : 중간에 값 삽입 -> 그런데 이건 성능이 굉장히 떨어지기 때문에 좋지 않다.
//        myList.add(1, 999);
//        System.out.println(myList); // toString이 내장 되어있기 때문에 그냥 출력이 된다.
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(1);
//        myList2.add(2);
//
////        특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//        System.out.println(myList);
////        get : 특정 위치의 요소를 반환
//
//        System.out.println(myList.get(0));
//
////        for문을 돌려 전체 list 출력
////        size() : 리스트의 길이(개수) 반환하는 메서드 배열의 length 개념
//
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//
////        remove  : 요소 삭제
////        1) index 로 삭제 , 2) value를 통한 삭제
//        System.out.println(myList + "   삭제전");
//        myList.remove(0);
//        System.out.println(myList+" 삭제 후 ");
//
////        value로 삭제
//        System.out.println(myList + " 인덱스로 삭제 전");
//        myList.remove(Integer.valueOf(999));
//        System.out.println(myList+" 인덱스로 삭제 후");

//       이러한 메서드들은 시간 초과를 유발하기 때문에 고난이도 코테 문제를 풀때는 사용하기 어렵다
//        그러나 맨 뒤에 add를 하는 것은 괜찮다고 한다.

//        set(index,value) : 인덱스 위치의 자리에 value 값 잘에 setting (변경) 한다.
//        인덱스를 찾아가서 값을 변경하는 것은 성능의 이슈가 크게 발생하지 않을 것 같다.

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        System.out.println("set 변경 전 데이터 -->" + myList);
//        myList.set(myList.size()-1, 999);
//        System.out.println("set 변경 후 데이터 -->" + myList);
//
////      indexOf 메서드 : 특정값이 몇 번째 index에 위치하는지 return 하는지.
////      일반적으로 가장 먼저 나오는 특정값의 index를 return 한다.
//        System.out.println(myList.indexOf(999));
//
////        전체 삭제 : clear()
////        isEmpty : 값이 비었는지, 안 비었는지
//        List<Integer> list = new ArrayList<>(); // null이 아니다.
//        list.add(10);
////       contains 메서드 특정값이 있는지 없는지 확인 -> 잇으면 true 없으면 false
//        System.out.println(list.contains(10));

//        이중 리스트 (리스트 안에 리스트가 들어가는 것)
        List<List<Integer>> myList = new ArrayList<>();
        myList.add(new ArrayList<>());
        myList.add(new ArrayList<>());
//        [[],[]]
        myList.get(0).add(10); // get으로 0번 리스트를 가져오고 거기에 데이터를 add 하는것이다.
        myList.get(0).add(20);
        myList.get(1).add(1);
        myList.get(1).add(2);
        System.out.println(myList);

//        리스트안에 배열 (리스트 안에 배열이 들어가는 것)

        List<int[]> myList2 = new ArrayList<>();
        myList2.add(new int[]{1,2});
        myList2.add(new int[]{10,20,30});
        myList2.add(new int[]{100,200,300,400});

//        리스트 정렬: Collections.sort(), 리스트객체.sort9)
        List<Integer> myList3 = new ArrayList<>();
        myList3.add(5);
        myList3.add(3);
        myList3.add(2);
        myList3.add(1);
        myList3.add(4);


//        정렬 1. collections.sort();
        Collections.sort(myList3); // 기본이 오름차순 정렬 s 잘 붙여라
        Collections.sort(myList3,Comparator.reverseOrder()); // 내림차순
//        정렬 2. 리스트객체.sort();
        myList3.sort(Comparator.naturalOrder());
        myList3.sort(Comparator.naturalOrder());

//      리스트 -> 배열 변환은 for문으로 하는게 가장 정확하다.

//        변환
//        배열과 List간의 변환
//        1. String 배열을 List<String>으로 변환하는 작업
        String[] stArr1 = {"java", "python", "c++"};
//        1.1 Arrays.asList로 바로 넣어버리기.
        List<String> stList = new ArrayList<>(Arrays.asList(stArr1));
//        1.2 for문을 통해 담기.
//        1.3 streamApi (참고만)
        List<String> stList2 = Arrays.stream(stArr1).collect(Collectors.toList());

//        2. List<String>을 String 배열로 변환
//        2-1. for문을 통해 담기.
//        2-2. toArray
        String[] stArr3 = stList2.toArray(new String[stList2.size()]);


//        3. int 배열을 List<Integer>로 변환
//        3-1 for문으로 담기.
//        3-2 streamApi 사용 (침고만)
        int[] intArr5 = {10, 20, 30, 40, 50};
        List<Integer> intList = Arrays.stream(intArr5).boxed().collect(Collectors.toList());


    }
}
