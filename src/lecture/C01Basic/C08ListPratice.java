package lecture.C01Basic;

import java.util.*;
import java.util.stream.Collectors;

public class C08ListPratice {

    public static void main(String[] args) {

        // List 선언 방법
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
        // 가장 일반적인 List 선언 방법
        // 왼쪽은 인터페이스, 오른쪽은 구현체
        List<String> list3 = new ArrayList<>();
        // 초기값 생성 방법 1. 하나씩 add 하는 방법
        list3.add("java");
        list3.add("python");
        list3.add("c++");

        // 초기값 생성 방법 2. 리스트를 주입
        String[] array1 = {"java", "test", "test1"};
        int[] array2 = {1, 2, 3, 4, 5};
        List<String> list4 = new ArrayList<>(Arrays.asList(array1));

        // int 배열은 참조자료형이기 때문에 넣을 수 있다. (30라인 참고)
        List<Integer> list5 = new ArrayList<>();
        for (int i : array2) {
            list5.add(i);
        }

        // List.of 도 있다. 기억하자.
        ArrayList<String> list6 = new ArrayList<>(List.of(array1));

        List<Integer> list12 = new ArrayList<>();
        list12.add(10);
        list12.add(120);
        System.out.println(list12); // toString이 내장 되어있기 때문에 그냥 출력이 된다.

        // add(index,값) : 중간에 값 삽입 -> 이건 성능이 굉장히 떨어지기 때문에 좋지 않다.
        list12.add(1, 999);
        System.out.println(list12); // toString이 내장 되어있기 때문에 그냥 출력이 된다.

        List<Integer> list7 = new ArrayList<>();
        list7.add(1);
        list7.add(2);

        // 특정 리스트의 요소를 모두 add
        list12.addAll(list7);
        System.out.println(list12);

        // get : 특정 위치의 요소를 반환
        System.out.println(list12.get(0));

        // for문을 돌려 전체 list 출력
        // size() : 리스트의 길이(개수) 반환하는 메서드 배열의 length 개념
        for (int i = 0; i < list12.size(); i++) {
            System.out.println(list12.get(i));
        }

        // remove  : 요소 삭제
        // 1) index 로 삭제 , 2) value를 통한 삭제
        System.out.println(list12 + "   삭제전");
        list12.remove(0);
        System.out.println(list12+" 삭제 후 ");

        // value로 삭제
        System.out.println(list12 + " 인덱스로 삭제 전");
        list12.remove(Integer.valueOf(999));
        System.out.println(list12+" 인덱스로 삭제 후");

        // 이러한 메서드들은 시간 초과를 유발하기 때문에 고난이도 코테 문제를 풀때는 사용하기 어렵다
        // 그러나 맨 뒤에 add를 하는 것은 괜찮다고 한다.

        // set(index,value) : 인덱스 위치의 자리에 value 값 setting (변경) 한다.
        // 인덱스를 찾아가서 값을 변경하는 것은 성능의 이슈가 크게 발생하지 않을 것 같다.
        List<Integer> list8 = new ArrayList<>();
        list8.add(10);
        list8.add(20);
        list8.add(30);
        System.out.println("set 변경 전 데이터 -->" + list8);
        list8.set(list8.size()-1, 999);
        System.out.println("set 변경 후 데이터 -->" + list8);

        // indexOf 메서드 : 특정값이 몇 번째 index에 위치하는지 return 하는지.
        // 일반적으로 가장 먼저 나오는 특정값의 index를 return 한다.
        System.out.println(list8.indexOf(999));

        // 전체 삭제 : clear()
        // isEmpty : 값이 비었는지, 안 비었는지
        List<Integer> list9 = new ArrayList<>(); // null이 아니다.
        list9.add(10);
        // contains 메서드 특정값이 있는지 없는지 확인 -> 있으면 true 없으면 false
        System.out.println(list9.contains(10));

        // 이중 리스트 (리스트 안에 리스트가 들어가는 것)
        List<List<Integer>> nestedList = new ArrayList<>();
        nestedList.add(new ArrayList<>());
        nestedList.add(new ArrayList<>());
        nestedList.get(0).add(10); // get으로 0번 리스트를 가져오고 거기에 데이터를 add 하는 것이다.
        nestedList.get(0).add(20);
        nestedList.get(1).add(1);
        nestedList.get(1).add(2);
        System.out.println(nestedList);

        // 리스트안에 배열 (리스트 안에 배열이 들어가는 것)
        List<int[]> arrayInList = new ArrayList<>();
        arrayInList.add(new int[]{1,2});
        arrayInList.add(new int[]{10,20,30});
        arrayInList.add(new int[]{100,200,300,400});

        // 리스트 정렬: Collections.sort(), 리스트객체.sort9)
        List<Integer> sortList = new ArrayList<>();
        sortList.add(5);
        sortList.add(3);
        sortList.add(2);
        sortList.add(1);
        sortList.add(4);

        // 정렬 1. collections.sort();
        Collections.sort(sortList); // 기본이 오름차순 정렬 s 잘 붙여라
        Collections.sort(sortList,Comparator.reverseOrder()); // 내림차순
        // 정렬 2. 리스트객체.sort();
        sortList.sort(Comparator.naturalOrder());
        sortList.sort(Comparator.naturalOrder());

        // 리스트 -> 배열 변환은 for문으로 하는게 가장 정확하다.

        // 변환
        // 배열과 List간의 변환
        // 1. String 배열을 List<String>으로 변환하는 작업
        String[] strArr = {"java", "python", "c++"};
        // 1.1 Arrays.asList로 바로 넣어버리기.
        List<String> strList = new ArrayList<>(Arrays.asList(strArr));
        // 1.2 for문을 통해 담기.
        // 1.3 streamApi (참고만)
        List<String> strList2 = Arrays.stream(strArr).collect(Collectors.toList());

        // 2. List<String>을 String 배열로 변환
        // 2-1. for문을 통해 담기.
        // 2-2. toArray
        String[] strArr3 = strList2.toArray(new String[strList2.size()]);

        // 3. int 배열을 List<Integer>로 변환
        // 3-1 for문으로 담기.
        // 3-2 streamApi 사용 (참고만)
        int[] intArr2 = {10, 20, 30, 40, 50};
        List<Integer> intList = Arrays.stream(intArr2).boxed().collect(Collectors.toList());

    }
}
