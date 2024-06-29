package lecture.C02ClassBasic;

public class C206RecursiveBasic {

    public static void main(String[] args) {
//
//        int total = 0;
//        //for문으로 1-10까지 누적합계
//        for (int i = 0; i <= 10; i++) {
//            total += i;
//        }
//
////        피보나치 수열 구현, 100번째 피보나치 수열을 구하라
//
//        int first = 1;
//        int second = 2;
//
//        for (int i = 2; i < 3; i++) {
//            int temp = first;
//            first = second;
//            second = temp + first;
//
//        }
//        System.out.println(second);

        System.out.println(fibo(5));
    }

    static int fibo(int a) {

        if (a <= 2) {
            return 1;
        }

        return fibo(a-1) + fibo (a-2);
    }

    static int func(int num) {
        //재귀 함수는 종료조건을 반드시 넣어줘야 한다.
        if ( num == 1 ) {
            return 1;
        }

        return num + func(num-1);
    }

    static int function(int target) {

        if (target == 100) {
            return 1;
        }

        return 0;
    }

}
