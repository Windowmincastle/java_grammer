package C01Basic;
import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {

    public static void main(String[] args) {
//
////        int a = 2;
////
////        while (a < 11 ) {
////            System.out.println(a);
////            a++;
////        }
////
////        //입력한 숫자의 구구단 단수 출력
////        Scanner sc = new Scanner(System.in);
////
////        int input = sc.nextInt();
////
////        for (int i = 0; i < 10; i++) {
////
////            System.out.println(input * i);
////
////        }
////
////
////        //1. 반복되는 도어락키 예제
////        //2. int를 String으로 변경
////        //3. 비밀번호를 맞추면 종료 break;
////        //4. 도어락키 if문
////        //5. 비밀번호가 5회 이상 틀리면 종료
////
////        int password = 1234;
////        int cnt = 0;
////        while (true) {
////
////            String answer = "1234";
////            Scanner scanner = new Scanner(System.in);
////            String input2 = scanner.nextLine();
////            if (answer.equals(input2)) {
////                System.out.println("문이 열립니다.");
////                break;
////            } else {
////                System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요");
////                cnt++;
////                if (cnt > 5) {
////                    System.out.println("입력 횟수를 초과했습니다.");
////                }
////            }
////
////        }
////
////        //result에 숫자 num을 반대로 뒤집은 숫자값을 넣어라.
////        int num = 1234;
////        int result = 0;
////        System.out.println(result);
////
////        while (true) {
////
////            int temp = num % 10;
////            result = result * 10 + temp;
////            num = num/10;
////
////            if (num == 0) {
////                break;
////            }
////
////        }
////        System.out.println(result);
////
////        // do - while
////        int a1 = 0;
////
////        do {
////            a1++;
////            System.out.println(a1);
////        } while (a < 10);
////
////        // for문
////
////        // 2~10까지 출력을 for문을 활용하여 출력
////
////        for (int i = 2; i <= 10; i++) {
////            System.out.println(i);
////        }
////
//////        1 3 5 7 9 11 13 15
////        // 두 수의 최대 공약수 구하기 -->
////        // 소수 구하기 : 1과 자기 자신을 제외한 숫자로 나누어지지 않는 수
//////        1~24까지 수 중에 소수를 출력
////
////        //사용자가 입력한 특정값이 소수인지 아닌지 -->
////        Scanner prime = new Scanner(System.in);
////
////        int input_1 = sc.nextInt(); //2
////        boolean trueOrNot = false;
////        for (int i = 2; i < input_1; i++) {
////
////            if (input_1 % i == 0) {
////                trueOrNot =true; //나눠지면 소수가 아니잖아~
////                break;
////            }
////        }
////
////        if (trueOrNot == false) {
////            System.out.println("소수 입니다.");
////        }
////
//////------------------------------------
////        //홀수만 출력하기를 변형한 continue
////
////        for (int i = 0; i <= 10; i++) {
////            if (i % 2 == 0) {
////                continue;
////            }
////            System.out.println(i);
////
////        }
//
//        // 배열과 향상된 for 문
//        int[] arr = {1, 3, 5, 7, 9};
//        // 일반 for 문
//        for (int i = 0; i < 5; i++) {
//            arr[i] += 10;
//        }
//
//        System.out.println(Arrays.toString(arr)); // Arrays.toString(배열)로 전체를 찍어볼 수 있다.
//        //향상된 for문, 반복 횟수는 arr에 들어가있는 데이터 개수 만큼 반복.
//        //향상된 for문으로는 실제 arr값의 변경은 불가능하다.
//        for (int i : arr) {
//            i += 10;
//        }
//
//        System.out.println(Arrays.toString(arr)); // 내용 출력, 이렇게 하지 않으면 메모리 주소가 출력이 된다.
//
//        //자바 변수의 유효 범위 : {}
//        int num = 10;
//
//        if (num > 1) {
//            int abc = 20;
//            num = 20;
//        }
////        if문 중괄호 밖에서는 abc 변수의 존재를 모른다.
////        System.out.println(num);
////        System.out.println(abc); 불가능하다.
//
////        다중반복문
//
//        for (int i = 2; i < 10; i++) {
//            System.out.println(i + "단 입니다.");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " X " + j + " = " + i * j);
//            }
//        }

        //라벨문
//
//        loop1:
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println("hello world");
//
//                if (j == 2) {
//                    break loop1;
//                }
//
//            }
//        }

        int[][] arr = {{1,2,3,},{4,5,6},{7,8,9},{10,11,13}}; // 이차원 배열
//
//        // 라벨문 활용
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
//
//        System.out.println(arr[2][0]);

//         11을 찾으면 3,1에 11이 있습니다.
        int target = 11;
        loop2:
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == target) {
                    System.out.println("현재 위치는 "+i+" , "+j+" 입니다");
                    break loop2;
                }
            }
        }

    }
}
