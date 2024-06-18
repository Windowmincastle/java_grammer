package C06EtcClass;

import java.util.Arrays;

public class C06GenericMain {

    public static void main(String[] args) {


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
    }
// 제네릭메서드 생성 : 반환타입 왼쪽에 <T> 선언
//    유의점 : 제네릭은 객체 타입이 들어와야함
//    기본형은 들어갈 수 없다.
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