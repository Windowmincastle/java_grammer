//package C02ClassBasic;
//
//public class C0201Method {
//
//    public static void main(String[] args) {
//
//        System.out.println(sumAcc(100, 200));
//
////        클래스명.메서드 : 이 호출 방식이 기본방식이다. 그러나
////        같은 클래스 내에서의 클래스 메서드 호출은 클래스명이 생략이 가능하다.
//
//        if (isPrime(10)) {
//            System.out.println("소수입니다");
//        } else {
//            System.out.println("소수가 아닙니다.");
//        }
//
//    }
//
//    //    클래스 안에 메서드를 만들어주는 것.
//
//    // 구성요소 : 매개변수,리턴타입,접근제어자,클래스메서드여부(static)
//    public static int sumAcc(int start, int end) {
//
//        int total = 0;
//        for (int i = start; i < end; i++) {
//            total += i;
//        }
//
//        return total;
//    }
//
//    public static boolean isPrime(int num) {
//
//        boolean answer = true;
////소수면 true , 소수가 아니면 false
//        for (int i = 2; i * i <= num; i++) {
//            if (num % i == 0) {
////                answer = false;
////                break;
//                return false; // 메서드는 return을 만나면 바로 메서드를 종료한다. void 리턴타입에서도 메서즈 강제 종료를 위해 return 사용
//            }
//        }
//        return answer; // return 타입을 잘 맞춰줘야한다.
//    }
//
//    static void
//
//    void isPrime2(int num) {
//
//
//    }
//}
//
