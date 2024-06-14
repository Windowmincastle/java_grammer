package C05AnonymousLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C0503ComparableComparator {

//    자바에서는 비교를 위한 인터페이스 2개를 제공한다.
//    Comparable , Comparator
//    COmparable 인터페이스에는 CompareTo메서드 선언
//    Comparator 인터페이스에는 compare메서드 선언
//    두 문자열의 각 자리를 순차적으로 비교한다.
//    문자열의 비교는 유니코드 값의 차이를 반환한다.
    public static void main(String[] args) {
    //    String 클래스에 compareTo 내장 (Comparable을 구현)
//        String a = "hello";
//        String b = "horld";
//        System.out.println(a.compareTo(b));
//
//        Integer a1 = 10;
//        Integer a2 = 10; // 래퍼클래스에서만 가능한가?
//        System.out.println(a1.compareTo(a2));

        List<String> lst = new ArrayList<>();
        lst.add("java");
        lst.add("python");
        lst.add("javascript");

//        정렬 1
        Collections.sort(lst);//내부적으로 Comparabble의 compareTo 메서드를 구현하여 정렬
        System.out.println(lst);
//        정렬 2
        Collections.sort(lst, Comparator.reverseOrder());
        System.out.println(lst);

        lst.sort(Comparator.naturalOrder());
        lst.sort(Comparator.reverseOrder());




    }

}

class Student {

    String name;
    int age;

    Student() {

    }

    Student(String inputName, int inputAge) {
        this.name = inputName;
        this.age  = inputAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
