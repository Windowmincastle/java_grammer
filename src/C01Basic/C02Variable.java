package C01Basic;

import java.math.BigDecimal;

public class C02Variable {

    public static void main(String[] args) {

        //정수 : byte (1바이트) , int (4바이트) , long (8바이트)
//
//        byte a = 127;
//        byte b = -128;
//
//        System.out.println(a);
//        System.out.println(b);
//
//        // 오버플로우 또는 언더플로우 발생
//        a++;
//        b--;
//
//        System.out.println(a);
//        System.out.println(b);
//
//        int int_a = 10;
//        long long_a =20L;

        //long 타입의 경우 명시적으로 long 타입임을 L 로 명시하고는 한다.

//        실수 : float , double(기본)

//        float f1= 1.123f; // float는 f 안 붙이면 컴파일 에러 난다.
//        double d1 = 1.123; //결론은 double 쓰면 된다.
//
//        // 부동소수점 오차 테스트
//        double d2 = 0.1;
//        System.out.println(d2);
//
//        // 부동소수점 방식 테스트
//        double total = 0;
//        for (int i = 0; i < 1000; i++) {
//            total += 0.1*10;
//        }
//        System.out.println(total/10);
//        // 부동소수점 오차를 해결하기 위해 이렇게 했지만 너무 불편하다.
//
//        //소수점 오차의 대안으로 Bigdecimal 클래스 사용
//        double dd1 = 1.03;
//        double dd2 = 0.42;
//        System.out.println(d1-d2);

        // Bigdecimal의 원리 : 저장할 때 문자열로 저장해서, 연산할 때 정수로 변환, 최종결과는 실수로 반환
        BigDecimal b1 = new BigDecimal("1.03");
        BigDecimal b2 = new BigDecimal("0.42");

        double result = b1.subtract(b2).doubleValue();
        System.out.println(result);

        // 문자형 : char

        char m1 = '가';
        System.out.println(m1);
        char m2 = '나';
        System.out.println(m2);

        // booelan : true or false
        boolean bool1 = true;
        boolean bool2 = false;

        if (bool1) {
            System.out.println("조건식이 참 입니다.");

        }


    }
}
