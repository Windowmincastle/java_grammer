package lecture.C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class C06String2Pratice {

    /*
형 변환 toString, valueOf
비교 equals , equalsIgnoreCase : 대소문자 모두 비교
길이 반환 length()
문자열 포함 여부 체크 contains -> boolean 타입반환
indexOf , lastIndexOf indexOf는 특정 문자나 문자열이 처음으로 나타나는 위치 반환 lastIndexOf -> 특정 문자,문자열이 마지막으로 나타나는 시작 위치를 반환한다
toCharArry() 문자열을 char형 문자 배열로 변환. 문자열을 개별 문자 단위로 처리할 때 유용하다
substring(); -> (n,m); m-1까지 반환, (n) n부터 끝까지, (0) 끝까지 다 반환 string 반환
trim은 양쪽 공백을 제거하는듯? 중간에 있는 공백은 제거되지 않는다.

join 메서드 String.join(구분자,String배열);

StringBuffer의 데이터를 String 타입으로 toString
String ansStr = sb1.toString();

StringBuffer insert 메서드 idx 6에 python 삽입?
sb1.insert(6, "python ");

StringBuilder 이렇게 이어붙여서 활용할 수 있다.
sb2.append("이렇게 가능").append("\n");

isEmpty() 메서드
split()메서드

split 메서드 활용 예시, String[] 배열 타입으로 반환함에 유의. 특정 구분자를 기준으로 짜른다.
String splitTest = "김민성,황요한,황정하,홍예지,김수연,최아영";
        String[] friends = splitTest.split(",");
        for (String f : friends) {
            System.out.println(f);
        }

replace() 변환 특정 문자열을 지정 문자열로 변경한다.
Character.toString(char데이터타입) 형 변환
toLowerCase() 소문자 만들기
toUpperCase() 대문자 만들기.
trim이랑 strip랑 차이가 있다. trim은 유니코드 공백 문자를 제거하지 못 한다.
trim은 양쪽 공백을 제거하는듯? 중간에 있는 공백은 제거되지 않는다.

substring 반환타입 -> String, 0,5하면 0~4까지만 반환
System.out.println(str11.substring(0, 5));
6번부터 끝까지
System.out.println(str11.substring(6));
0 넣으면 끝까지 다 출력
System.out.println(str11.substring(0));
 */

    public static void main(String[] args) {

        int num1 = 10;
//        생성자 초기화도 가능
        Integer num2 = new Integer(20);

//      primitive랑 rapper 타입 둘다 선언 가능. 오토박싱 언오토박싱 자동으로
        int num3 = num2;
//        아래처럼 바로 선언도 가능
        Integer num4 = num1;
//      생성자로 바로 초기화 가능.
        String str1 = new String("hello");
//        int형 데이터 toString , valueOf 둘다 num5 값 뽑아와서 String 데이터 타입 변수에 저장함
        int num5 = 10;
        String str2 = Integer.toString(num5);
        String str3 = String.valueOf(num5);

//        String 데이터 타입에서 int형 데이터타입으로 변환 Integer.parseInt(String);
        int num6 = Integer.parseInt(str1);

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        List<Integer> list1 = new ArrayList<>();

        String str4 = "hello";
        String str5 = "hello";
        String str6 = new String("hello");
        String str7 = "hello";

        System.out.println(str4 == str6);
        System.out.println(str5 == str7);

        System.out.println(str4.equals(str5));
        System.out.println("hello".equals("hello"));
//        equalsIgnoreCase는 대소문자를 구문하지않고 구분한다.
        System.out.println("hello".equalsIgnoreCase("HELLO"));

        String str8 = "hello java java";
//        length() 배열 길이 반환
        System.out.println(str8.length());
//        indexOf는 특정 문자열을 찾는데 시작 인덱스를 반환한다.
//        시작 index를 int idx에 저장해서 활용하면 좋을듯
        int idx1 = str8.indexOf("java");
        System.out.println(idx1);
        System.out.println(str8.lastIndexOf("java"));

//        contains-> "hello"라는 문자열을 포함하고잇나? boolean 타입 반환
        System.out.println(str8.contains("hello"));
        System.out.println(str8.contains("world"));

//        charAt 메서드 int로 반환하는데 아스키 코드 반환함.
        String str9 = "abcdefabaadf";
        char ch1 = str9.charAt(1);
        char ch2 = str9.charAt(2);


        int cnt1 = 0;
        for (int i = 0; i < str9.length(); i++) {
            if (str9.charAt(i) == 'a') {
                cnt1++;
            }
        }
        System.out.println("str9 문자열의 a의 개수는 " + cnt1 + "개 입니다.");

        char[] charArray = str9.toCharArray();

        int cnt2 = 0;
        for (char idx : charArray) {
            if (idx == 'a') {
                cnt2++;
            }
        }

        System.out.println("toCharArray()를 활용한 cnt2 개수 ->" + cnt2);

        String str10 = "hello";
        str10 += " world";
        System.out.println(str10);

        String str11 = "hello world";
//        substring 반환타입 -> String, 0,5하면 0~4까지만 반환
        System.out.println(str11.substring(0, 5));
//        6번부터 끝까지
        System.out.println(str11.substring(6));
//        0 넣으면 끝까지 다 출력
        System.out.println(str11.substring(0));

        String s = "qwer";
        String ans = "";
        if (s.length() % 2 == 0) {
            ans = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            ans = s.substring(s.length() / 2, s.length() / 2 + 1);
        }


        String trimStr1 = " hello world    ";
//        양쪽 공백을 짜르는가본데?
//        trim은 양쪽 공백을 제거하는듯? 중간에 있는 공백은 제거되지 않는다.
        String trimStr2 = trimStr1.trim();
        System.out.println(trimStr1);
        System.out.println(trimStr2);
//      trim이랑 strip랑 차이가 있다. trim은 유니코드 공백 문자를 제거하지 못 한다.
        String stripStr1 = " hello world     ";
        String stripStr2 = stripStr1.strip();
        System.out.println(stripStr1 + " 짜르기전 strip ");
        System.out.println(stripStr2 + " 짜른 후 strip");

        String str12 = "hello";
//        toUpperCase() 대문자 만들기.
        String str13 = str12.toUpperCase();
        System.out.println(str13);
//        toLowerCase() 소문자 만들기
        String str14 = "ABCEFGH";
        String str15 = str14.toLowerCase();
        System.out.println(str15);

        char ch3 = 'a';
//        Character.toString(char데이터타입) 형 변환
        String str16 = Character.toString(ch3);

        char ch4 = str16.charAt(0);
        System.out.println(str16);

//      replace() 변환 특정 문자열을 지정 문자열로 변경한다.
        String str17 = "hello world";
        String str18 = str17.replace("world", "바꿧지롱");
        System.out.println(str17);
        System.out.println(str18);

        String str19 = "01abc123한글123";
        String result = "";
        char[] ary = str19.toCharArray();
        for (int i = 0; i < str19.length(); i++) {
            if (ary[i] == 'a' || ary[i] == 'b' || ary[i] == 'c' ||
                    ary[i] == 'd' || ary[i] == 'e' || ary[i] == 'f' || ary[i] == 'g' ||
                    ary[i] == 'h') {
                continue;
            } else {
                result += ary[i];
            }
        }
        System.out.println(result);

//        정규표현식 저장해놓고 참고만해서 활용하면 된다.
        String answer = str19.replaceAll("[A-Za-z]", "");
        System.out.println(answer);

        String test = "helloA";
        System.out.println(test.matches("[A-Za-z]+"));

        boolean bool1 = Pattern.matches("[0-9]+", "12345hello");
        boolean bool2 = Pattern.matches("[0-9]+", "12345");
        System.out.println(bool1);
        System.out.println(bool2);

        boolean bool3 = Pattern.matches("^[A-Za-z]*$", "HelloWorld");

        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        boolean check = false;
        if (Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number)) {
            System.out.println("올바른 입력");
        } else {
            System.out.println("틀린 형식의 전화번호 입니다");
        }

        String str20 = "a:b:c:d";
        String[] str20Arr = str20.split(":");
        System.out.println(Arrays.toString(str20Arr));

        String str21 = "a b c  d";
        String[] str21Arr = str21.split("\\s+");
        System.out.println(Arrays.toString(str21Arr));

        String nullStr1 = null;
        String emptyStr = "";

// null != "" 다르다.
// ""일때 isEmpty()하면 true
//
        System.out.println(nullStr1 == emptyStr);
        System.out.println(emptyStr.isEmpty());
        System.out.println(nullStr1.split(""));
        System.out.println(nullStr1.isEmpty());

//      split 메서드 활용 예시, String[] 배열 타입으로 반환함에 유의. 특정 구분자를 기준으로 짜른다.
        String splitTest = "김민성,황요한,황정하,홍예지,김수연,최아영";
        String[] friends = splitTest.split(",");
        for (String f : friends) {
            System.out.println(f);
        }

        if (nullStr1 == null) {
            System.out.println(nullStr1.isEmpty());
        }

//      join 메서드 String.join(구분자,String배열);
//      String[] 배열을 String 문자열로 구분자 넣어서 붙인다. "" 넣으면 그냥 쭉 이어붙임.
        String[] arr = {"java", "python", "c++"};
        String joinedStr = String.join(" ", arr);
        System.out.println(joinedStr);


        StringBuffer sb1 = new StringBuffer("hello");
        sb1.append(" java");
        sb1.append(" world");
        System.out.println(sb1);

//      StringBuffer의 데이터를 String 타입으로 toString
        String ansStr = sb1.toString();

//      StringBuffer insert 메서드 idx 6에 python 삽입?
        sb1.insert(6, "python ");
        System.out.println(sb1);
//      delete 가능
        sb1.delete(17, sb1.length());
        System.out.println("삭제 후 -> " + sb1);

//      StringBuilder가 StringBuffer보다 성능 좋다고 한다.
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello");
        sb2.append("\n");
        sb2.append("world");
//      StringBuilder 이렇게 이어붙여서 활용할 수 있다.
        sb2.append("이렇게 가능").append("\n");

        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder repeatAns = new StringBuilder();

        int n = 3;
        System.out.println("반복문 시작");
        for (int i = 0; i < sb3.length(); i++) {
            char x = sb3.charAt(i);
            for (int j = 0; j < n; j++) {
                repeatAns.append(x);
            }
        }
        System.out.println(repeatAns);
    }
}
