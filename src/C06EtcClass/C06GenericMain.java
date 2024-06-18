package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06GenericMain {

    public static void main(String[] args) {
// 제네릭 생성방식 2개
//        메서드: <T> 반환타입 왼쪽
//        클래스 : 클래스명 오른쪽 <T>
//        실질적으로 설계할 일은 적겟지만 이해를 해야한다.
//        제네릭 타입 소거 이슈는 객체에만 생기는 것 이다.
        String[] stArr = {"java", "python", "c"};

        stChange(stArr,0,1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {10, 20, 30};
        intChange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));

        genericChange(stArr,1,2);

        Person p1 = new Person();
        p1.setValue("김민성");

        GenericPerson<Integer> g1 = new GenericPerson<>();
        g1.setValue(10);
        System.out.println(g1.getValue()+" 제네릭 클래스 호출 ");
        
        GenericPerson<String> g2 = new GenericPerson<>();
        g2.setValue("김민성");
        System.out.println(g2.getValue()+" 제네랙 String 타입 호출");

//        제네릭 소거
        List<String> myList = new ArrayList<>();
        myList.add("1");
        myList.add("@2");
        myList.add("33");

////        컴파일 후 제네릭 소거가 되면 아래와 같이 된다.
//        List myList = new ArrayList();
//        myList.add("hello");
//        myList.add("hello");

    }
// 제네릭메서드 생성 : 반환타입 왼쪽에 <T> 선언
//    유의점 : 제네릭은 객체 타입이 들어와야함
//    기본형은 들어갈 수 없다.
//    실용적인 목적은 효용이 떨어지지만 자바 개념을 이해하기 위해 필요하다
    static <T> void genericChange(T[] inputString, int input1, int inpu2) {

        T temp = inputString[input1];
        inputString[input1] = inputString[inpu2];
        inputString[inpu2] = temp;
//        힙 메모리 메서드이기 떄문에 return 할 필요 없다
    }

    static void stChange(String[] inputString, int input1, int inpu2) {

        String temp = inputString[input1];
        inputString[input1] = inputString[inpu2];
        inputString[inpu2] = temp;
//        힙 메모리 메서드이기 떄문에 return 할 필요 없다
    }

    static void intChange(Integer[] intArr, int a, int b) {
        Integer temp = intArr[a];
        intArr[a] = intArr[b];
        intArr[b] = temp;
    }

}
// 제네릭클래스는 클래스명 옆에 <T> 선언
class GenericPerson<T> {

    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Person{
    String value;
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}