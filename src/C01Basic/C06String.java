package C01Basic;

import java.util.ArrayList;
import java.util.List;

public class C06String {

    public static void main(String[] args) {

        //참조 자료형 : 기본 자료형을 제외한 모든 자료형
        // WrapperClass : 기본형 타입을 Wrapping한 클래스 이다.

//        int와 Integer간의 형 변환

        int a = 10;
        Integer b = new Integer(20);

        //왜냐하면 오토언박싱.
        int c = b; //문제가 생길까 안 생길까? 문제가 안 생긴다.

        Integer d = a; // 오토박싱


        //객체 생성 방식.
        String st1 = new String("hello"); // 기본원칙이긴하나 String은 예외적으로 편리하게 사용할 수 있다.

        //리터럴 방식.

        // String과 int의 형변환, 그냥 외워라 너무 많이 사용한다
        int a1 = 10;
        String st2 = Integer.toString(a1);
        String st3 = String.valueOf(a1);

        int b1 = Integer.parseInt(st1);

        //참조 자료형에 원시 자료형을 담을때는 Wrapper클래스를 써야한다.
        List<Integer> myList = new ArrayList<>();//우측 데이터타입 생략 가능
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

    }
}
