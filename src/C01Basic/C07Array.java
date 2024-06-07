package C01Basic;

import java.util.Arrays;

public class C07Array {

    public static void main(String[] args) {
//
////       배열 표현식 1 : 리터럴 방식
//        int[] intAry = {1, 2, 3, 4, 5};
//
//
////      배열 표현식 2 배열 선언 후 할당 방식
        int[] intAry2 = new int[5];

        intAry2[0] = 1;
        intAry2[1] = 2;
        intAry2[2] = 3;
        intAry2[3] = 4;

        for (int x : intAry2) {
            System.out.println(x);
        }

//
//        System.out.println(intAry2[4]); // 0으로 초기화가 되어있다.
//
////       char도 초기값이 할당이 되어있다. 근데 char는 잘 안 쓴다. 그래서 그렇게 중요하지 않다.
//        String[] charArr = new String[10];
//        System.out.println(charArr[0]);
//
////        표현식3
//        int[] intAry3 = new int[]{1, 2, 3, 4};
////       메서드 호출할때 메서드(new int[]{1,2,3,4,}); 이렇게 넘길수 있다.
//
////        표현식 4 : 불가능 하다. -> 배열의 길이는 사전에 지정이 되어 있어야한다.
//        int[] intAry4 = new int[];
//
        String[] stArr = new String[5];
        stArr[0] = "hello";
        stArr[1] = "java";
//        NPE
//        System.out.println(stArr[2].length()); // null이 있기 때문에 NPE 발생

        String[] stArr2 = new String[5];
        //배열에 값 한꺼번에 세팅
        Arrays.fill(stArr2, "java"); // stArr2의 배열의 모든 값을 "java"로 채운다
        System.out.println(stArr2[3]);



    }
}
