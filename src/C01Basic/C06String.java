package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class C06String {

    public static void main(String[] args) {

        //참조 자료형 : 기본 자료형을 제외한 모든 자료형
        // WrapperClass : 기본형 타입을 Wrapping한 클래스 이다.

//        int와 Integer간의 형 변환
//
//        int a = 10;
//        Integer b = new Integer(20);
//
//        //왜냐하면 오토언박싱.
//        int c = b; //문제가 생길까 안 생길까? 문제가 안 생긴다.
//
//        Integer d = a; // 오토박싱
//
//
//        //객체 생성 방식.
//        String st1 = new String("hello"); // 기본원칙이긴하나 String은 예외적으로 편리하게 사용할 수 있다.
//
//        //리터럴 방식.
//
//        // String과 int의 형변환, 그냥 외워라 너무 많이 사용한다
//        int a1 = 10;
//        String st2 = Integer.toString(a1);
//        String st3 = String.valueOf(a1);
//
//        int b1 = Integer.parseInt(st1);
//
//        //참조 자료형에 원시 자료형을 담을때는 Wrapper클래스를 써야한다.
//        List<Integer> myList = new ArrayList<>();//우측 데이터타입 생략 가능
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.add(40);
//
//        List<Integer> list1 = new ArrayList<>();

        // String 클래스 객체 생성 vs 리터럴방식 , 리터럴방식이 더 권장하는 방식이다.
        // 왜냐하면 문자열 pool을 통해서
        // new String을 하면 무조건 메모리가 할당된다 heap 공간에.
//
//        String str = "hello";
//        String st4 = "hello";
//        String st6 = new String("hello");
//        String st5 = "hello";
//
//        System.out.println(str == st6);
//        System.out.println(st4 == st5);
//
//        System.out.println(str.equals(st4)); // 문자열은 equals 메서드로 항상 비교해라
//        // 문자열이 같은지만 판단하는것은 equals로 해라.
//        System.out.println("hello".equals("hello")); //대소문자 구분없이. 이런 형태로도 사용가능한지 몰랐다.
//        System.out.println("hello".equalsIgnoreCase("HELLO")); // true
//       // equals는 외우자. 메모리 주소 비교가 아니라 값 비교다.
//
//        //문자열 길이 : length();
//        String st1 = "hello java java";
//        System.out.println(st1.length());
//
////        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
//        int idx1 = st1.indexOf("java");
//        System.out.println(idx1);
//        System.out.println(st1.lastIndexOf("java")); // 마지막 문자열의 index 위치
//
////      contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        System.out.println(st1.contains("hello")); //true
//        System.out.println(st1.contains("world")); //false
//
////        charAt : 특정 idx의 문자 값을 리턴
//        String st = "abcdefabaadf";
//        char ch1 = st.charAt(1);
//        char ch2 = st.charAt(2);
//
//
//        //        위의 문자열에 a의 개수가 몇개인지 count
//
//        int cnt = 0;
//        for (int i = 0; i < st.length(); i++) {
//
//            // char 자료형은 " "가 아니라 ' ' 임을 유의
//            if (st.charAt(i) == 'a') {
//                cnt++;
//            }
//        }
//        System.out.println("st문자열의 a의 개수는"+cnt+"개 입니다.");
//
//        //toCharArray() : String 문자열을 char배열로 리턴해준다. 이것도 많이 쓴다.
//
//        char[] charary = st.toCharArray();
////        System.out.println(Arrays.toString(st.toCharArray()));
//
//        //toCharArray()를 활용해서 a가 몇개인지 cnt하기.
//
//        int cnt1 = 0;
////향상된 for문 사용할 때 앞에 자료형 누락에 유의해라.
//        for (char idx : charary) {
//
//            if (idx == 'a') {
//                cnt1++;
//            }
//        }
//
//        System.out.println("toCharArray()를 활용한 cnt1 개수 ->"+cnt1);

//
//
////        문자열 더하기 : +=
//        String str = "hello";
//        str += " world"; //보통 이런 형태로 많이 한다. 근데 성능이 좀 떨어진다고 알려져있다.
//        System.out.println(str);

        //char를 String에 더하면 자동형 변환이 된다.

//        //substring(a,b) : a이상 b미만의 index의 문자를 잘라서 리턴
//        String str = "hello world";
//        System.out.println(str.substring(0, 5));
//        System.out.println(str.substring(6)); // 2번쨰 인자 안 넣으면 끝 까지 가는 것 같다.
//        System.out.println(str.substring(0)); // 맞네
//
//        //가운데 글자 가져오기 , 프로그래머스 -> 혼자 못 풀엇음 다시 풀어보기
//        String s = "qwer";
//        String ans = "";
//        if (s.length() % 2 == 0) {
//            ans = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
//        } else {
//            ans = s.substring(s.length() / 2, s.length() / 2 + 1);
//        }
//
//
//
//
////        trim,strip : 문자열 양쪽 끝의 공백 제거
//        String trimSt1 = " hello world    ";
//        String trimSt2 = trimSt1.trim();
//        System.out.println(trimSt1);
//        System.out.println(trimSt2);
//
//        String stripst1 = " hello world     ";
//        String stripst2 = stripst1.strip();
//        System.out.println(stripst1 + " 짜르기전 strip ");
//        System.out.println(stripst2 + " 짜른 후 strip");
//
//        // toUppercase : 대문자 , toLowercase : 소문자
//        String s1 = "hello";
//        String s2 = s1.toUpperCase();
//        System.out.println(s2);
//
//        String s3 = "ABCEFGH";
//        String s4 = s3.toLowerCase();
//        System.out.println(s4);
//
////        char -> String으로 형 변환
//        char ch1 = 'a';
//        String st5 = Character.toString(ch1); //래퍼클래스에서 내장함.
//
//        char ch2 = st5.charAt(0);
//        System.out.println(st5);
//
////        replace(a,b) , a문자열을 b문자열로 대체
//
//        String st100 = "hello world";
//        String st99 = st100.replace("world", "바꿧지롱");
//        System.out.println(st100);
//        System.out.println(st99);
//
////        replaceAll(a,b) : replace와 동일, 정규 표현식 쓸수잇음
//        String st1 = "01abc123한글123"; // 숫자,알파벳,한글 등이 섞여 있을떄
//        String answer ="";
//        //for문을 활용해서 알파벳(소문자만 잇다고 가정하고 알파벳을 제거한 answer return )
//        // char 배열로 변환하자.
//        // 배열의 모든 원소에 접근해서 알파벳인지 확인하자 모든 알파벳인지 어떻게? 확인?
//        // 알파벳이 아니면 새로운 String에 담아서 반환하자
//
//        char[] ary = st1.toCharArray();
//        for (int i = 0; i < st1.length(); i++) {
//            if (ary[i] == 'a' || ary[i] == 'b' || ary[i] == 'c' ||
//                    ary[i] == 'd' || ary[i] == 'e' || ary[i] == 'f' || ary[i] == 'g' ||
//                    ary[i] == 'h' ) {
//                continue;
//            } else {
//                answer += ary[i];
//            }
//
//        }
//        System.out.println(answer);

        // replaceAll과 정규표현식 활용
//        String st1 = "01abc123한글123"; // 숫자,알파벳,한글 등이 섞여 있을떄
//        [a-z]+ : 1개 이상의 소문자 알파벳 표현하는 정규 표현식.
//          [A-Za-z]+ : 대 소문자 포함
//        [가-힣]+ : 한글
//        [0-9]+ : 숫자
//        gpt가 매우 잘 뽑아낸다. 약속된 패턴이기 때문에 일정의 표 이다. 그래서 구글링하면 되니까 외우지 마라
////        그러나 실무에서 많이 쓴다 정규표현식
//        //간단하게 다 없앨 수 있다.
//        String answer = st1.replaceAll("[A-Za-z]","");
//        System.out.println(answer);
//
////        String의 matches와 Pattern.matches(); 둘다 사용해도 상관이없다.
//        String test = "helloA";
//
//        System.out.println(test.matches("[A-Za-z]+")); //이 문자열 전체가 대소문자를 포함하는지 T,F로 찍어볼 수 있다.
//
//        boolean b1 = Pattern.matches("[0-9]+", "12345hello");
//        boolean b2 = Pattern.matches("[0-9]+", "12345");
//        System.out.println(b1);
//        System.out.println(b2);
//
////        ^:정규표현식의 시작, $:정규표현식끝, *:빈값포함
//        boolean b3 = Pattern.matches("^[A-Za-z]*$","HelloWorld");
//
////      전화번호 패턴 검증, 실무적으로 많이 사용한다.
//        Scanner sc = new Scanner(System.in);
//        String number = sc.nextLine();
//        boolean check = false;
//        if (Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number)) { // 정규표현식이랑 number가 일치하느냐?
//            System.out.println("올바른 입력");
//        } else {
//            System.out.println("틀린 형식의 전화번호 입니다");
//        }

//       split : 특정 문자를 기준으로 문자열을 자르는 것. 문자열 배열을 return
//
//        String a = "a:b:c:d";
//        String[] a_arr = a.split(":");
//        System.out.println(Arrays.toString(a_arr));

//        //이런 더러운 문제가 있다.
//        String b = "a b c  d";
//        String[] b_arr = b.split("\\s+"); //공백이 하나든 두개든 이상이면 다 짜르겟다.
//        System.out.println(Arrays.toString(b_arr)); // 정규표현식으로 공백 짜른거

////        isEmpty와 null (자료타입)
//        String st1 = null;
//        String st2 = "";
//
////        equal 관계 아님
//        System.out.println(st1 == st2);
////        문제발생 x
//        System.out.println(st2.isEmpty());
////        문제 발생
//        System.out.println(st1.split(""));
////       NullPointer Exception 예외 발생
//        System.out.println(st1.isEmpty());
//
//
////        null은 기본적으로 ==로 비교한다.
//
//        if (st1 == null) {
//
//            System.out.println(st1.isEmpty());

//        }
//
//
////        join : String[]을 하나의 String으로 만드는 메서드
//
//
//
//        String[] arr = {"java", "python", "c++"};
//        String st = String.join(" ", arr);
//        System.out.println(st);
//
//
//        //      String += < StringBuffer < StringBuilder
////      StringBuilder는 스레드 safe x
//
//        // StringBuffer
//        StringBuffer sb1 = new StringBuffer("hello");
//        sb1.append(" java");
//        sb1.append(" world");
//        System.out.println(sb1);
//
//        String ans = sb1.toString();
//
////        중간에 끼워넣기
//        sb1.insert(6,"python ");
//        System.out.println(sb1);
//
////        삭제하기
//        sb1.delete(17,sb1.length());
//        System.out.println("삭제 후 -> "+sb1);
//
////        StringBuilder
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("Hello");
//        sb2.append("\n"); //줄바꿈
//        sb2.append("world");

//       StringBuilder를 사용해서 각 문자마다 n번 만큼 반복해서 hhheeellllllooo

        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder answer = new StringBuilder();

        int n = 3;
        System.out.println("반복문 시작");
        for (int i = 0; i < sb3.length(); i++) {

            char x = sb3.charAt(i);

            for (int j = 0; j < n; j++) {
                answer.append(x);
            }
        }
        System.out.println(answer);

//        문자열 밀기


    }

}


