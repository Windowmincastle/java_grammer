package C05AnonymousLambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class C0504StreamApi {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 5, 1, 2, 3, 5};

//        전통적인 방식의 데이터 접근 방식
        for (int a : arr) {
            System.out.println(a);
        }

//        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌 입력에 따른 출력만 존재?
//        JAVA에서 함수형프로그래밍을 지원하기 위한 라이브러리가 streamAPI
//        foreach : 스트림의 각 요소를 소모하면서 동작을 수행
        Arrays.stream(arr).forEach(a -> System.out.println(a));

//        스트림의 생성
        String[] strArr = {"HTML", "CSS", "JAVA", "PYTHON"}; // String 배열이 있을때
//      stream<클래스명> : 제네릭 타입으로 stream 객체가 생성된다.
        Stream<String> stream1 = Arrays.stream(strArr);

        List<String> stList = new ArrayList<>(Arrays.asList(strArr));

        int[] intArr = {1, 2, 3, 4, 5, 123, 12, 3, 4, 5, 12,};
        IntStream stream3 = Arrays.stream(intArr);

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        Stream<Integer> stream4 = myList.stream();
//        int가 아니라 Integer이기 때문에 Intstream은 사용불가
//        IntStream stream5 = myList.stream();


//        stream 변환(중개연산) : filter, map, sorted, distinct, limit
        String[] strArr2 = {"HTML", "CSS", "JAVA", "PYTHON"}; // String 배열이 있을때
//        filter : 특정 기준으로 대상을 필터링 하는 것. Stream<String>을 반환한다. 왜 String인지 모르나?
//        제네릭의 타입 소거 문제가 발생 한다.
//        제네릭의 타입소거란 제네릭 타입을 런타임시점에는 제거하는 것을 의미한다.
//        그래서 타입이 소거된 Stream 객체에서 배열로 변환하려면 타입이 뭔지를 명시해줘야함(타입캐스팅) , a 변수에는 stream 요소의 개수
        String[] newStArr = Arrays.stream(strArr).filter(a -> a.length() <= 4).toArray(a->new String[a]);
        //이 표현을 더 많이 쓰는 것 같다, 메소드 참조 방식(매개변수가 추론가능할 때 생략하는 형식) : 클래스::메서드 -> 일반적인 방식.
        String[] newStArr2 = Arrays.stream(strArr).filter(a -> a.length() <= 4).toArray(String[]::new);

        int[] intAry = {10, 10, 30, 40, 50,50,30};
//        여기는 자체가 IntStream이기 때문에 바로 toArray가 가능하다.
        int[] newIntAry =  Arrays.stream(intArr).filter(a-> a<=30).toArray();

//        distinct는 중복 제거
        int[] newIntAry2 =  Arrays.stream(intArr).distinct().toArray();

        System.out.println(Arrays.toString(newIntAry));
        System.out.println(Arrays.toString(newIntAry2));

        //IntStream에서는 다양한 합계,통계값들을 구하는 메서드를 제공한다.
        int total = Arrays.stream(intAry).sum();


//        map : 기존의 스트림을 조작하여 새로운 스트림 반환
        int[] newMapArr = Arrays.stream(intArr).map(a -> a * 10).toArray();
        System.out.println("여기요 "+Arrays.toString(newMapArr));

//        간단한 실습

//        홀수 찾기
        int[] arr1 = {1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int[] praticeFilter = Arrays.stream(arr1).filter(a-> a%2!=0).toArray();
        System.out.println(Arrays.toString(praticeFilter)+"홀수 배열 생성");
//        홀수만 담은 배열의 값을 제곱한 새로운 배열 생성 : fiter, map
        int[] praitceMap = Arrays.stream(praticeFilter).map(a->a*a).toArray();
        System.out.println(Arrays.toString(praitceMap)+" 홀수만 담은 배열 제곱 배열 생성");

//        홀수만 담은 배열의 값을 제곱한 새로운 배열 오름차순 정렬 생성 : filter , map,sorted
        int[] praitceFilterMap = Arrays.stream(arr1).filter(a -> a % 2 != 0).map(a -> a * a).sorted().toArray();


//        mapToInt : intStream 변환해주는 map
        String[] stArr4 = {"HTML", "CSS", "JAVASCRIPT", "JAVA"};
//        각 문자열의 길이를 담은 새로운 int배열 생성
//        1. map으로 돌리고 stream
//      mapToInt 예시
        int[] stArrToInt = Arrays.stream(stArr4).mapToInt(a->a.length()).toArray();
        System.out.println(Arrays.toString(stArrToInt)+" stArrToInt 배열");

//      95라인 limit 추가
        int[] stArrToInt2stArrToInt2 = Arrays.stream(stArr4).mapToInt(a->a.length()).limit(3).toArray();
        System.out.println(Arrays.toString(stArrToInt2stArrToInt2)+" limit 추가");
    }

}
