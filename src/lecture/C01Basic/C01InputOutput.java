package lecture.C01Basic;

import java.util.Scanner;

public class C01InputOutput {

    public static void main(String[] args) {

//        // 출력 : System.out
//        // println 출력 후 줄 바꿈
//        // print : 출력후 줄바꿈 없이.
//        int a = 20;
//        System.out.print(a);
//        String b = "hello world";
//
//        //문자열과 숫자를 합하면 문자가 된다.
//        System.out.println(a+b);
//        // 숫자 + 숫자
//        System.out.println(20+10);

        // 입력 : System.in(키보드 입력)
        Scanner scan = new Scanner(System.in);
//        System.out.println("아무 문자열을 입력해주세요");
//        String inputs = scan.nextLine(); // String 데이터 타입으로 return
//        System.out.println(inputs);
//
//        System.out.println("더하기할 두 숫자를 입력해주세요");
//
//        int a1 = scan.nextInt();
//        int a2 = scan.nextInt();
//
//        System.out.println("두 수를 더한 값은" + (a1 + a2) + "입니다");

        System.out.println("실수를 입력해주세요");
        double input_double = scan.nextDouble();
        System.out.println(input_double);

        System.out.println("T/F를 입력해주세요");
        boolean input_boolean = scan.nextBoolean();

        // java 밖의 시스템 잉므로 입출력 시스템 메모리 해제 해주는 것이 좋다.
        scan.close();




    }

}
