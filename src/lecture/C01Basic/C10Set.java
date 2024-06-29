package lecture.C01Basic;

import java.util.*;

public class C10Set {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        mySet.add("h");
        mySet.add("e");
        mySet.add("l");
        mySet.add("l");
        mySet.add("o");
        mySet.add("h"); // 중복
        System.out.println(mySet);
//      순서가 없고 중복이 제거 되어있다. Set의 특징이다.

//
        List<String> myList = new ArrayList<>();
        myList.add("테니스");
        myList.add("테니스");
        myList.add("야구");
        myList.add("야구");
        myList.add("축구");
        myList.add("농구");

//        이런 형태로 바로 집어넣을 수 있다.
        Set<String> set = new HashSet<>(myList);
        System.out.println(set);

        String[] ary = {"야구", "야구", "농구", "축구", "축구", "미식축구"};
        Set<String> set2 = new HashSet<>(Arrays.asList(ary));
//        위 처럼 할 수 있다 그치만 뭐든간에 for문으로 담으면 된다잉.
        set2.remove("야구");
        set2.remove("미식축구");
        System.out.println(set2);

//        집합 관련 함수 : 교집합 retainAll, 합집합 addAll , 차집합 removeAll
        Set<String> set3 = new HashSet<>(Arrays.asList("java","python","javascript"));
        Set<String> set4 = new HashSet<>(Arrays.asList("java","html","css"));


//        관련 문제 : 뉴스 클러스터링

//        set3.retainAll(set4); // 교집합
//        set3.addAll(set4);    // 합집합
//        set3.removeAll(set4); // 차집합

        System.out.println(set3);

//        LinkedHashSet, TreeSet
        Set<String> myset1 = new TreeSet<>();
        myset1.add("hello5");
        myset1.add("hello5");
        myset1.add("hello3");
        myset1.add("hello2");
        myset1.add("hello1");
        System.out.println(myset1);;

//        두개 뽑아서 더하기 : 베열 , 리스트 , 트리셋으로

    }
}
