package C05AnonymousLambda;

import java.lang.reflect.Array;
import java.util.*;
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

//        위는 스트림의 중개 연산이며 지금부턴 스트림의 소모
//    스트림의 sum: 합계, reduce: 누적연산 , foreach(출력 용도로 많이 사용한다)
        int[] intAry2 = {10, 20, 30, 40};
        Arrays.stream(intAry2).forEach(System.out::println); // a는 생략 가능하다 왜? 어차피 a가 출력될거니깐.

        int intArySum = Arrays.stream(intAry2).sum();
//        값이 있을수도 있고 없을수도 있음을 명시한 객체 optional 객체
        int intAryMax = Arrays.stream(intAry2).max().getAsInt(); // getAsInt()나 orelse등 뭐 많은데 값이 잇다고 가정하고 꺼내겟다.
        int intAryMin = Arrays.stream(intAry2).min().getAsInt();
        int intAryCnt = (int)Arrays.stream(intAry2).count();
//        reduce(초기값, 연산식); 매개변수가 2개가 들어온다는게 기본적으로 깔려있다. 표현식 자체가 2개다
        int allMultiply = Arrays.stream(intAry2).reduce(1,(a,b)->a*b); //1은 초기값을 의미
        int allAdd = Arrays.stream(intAry2).reduce(0,(a,b)->a+b); //0은 초기값을 의미
        System.out.println(allMultiply+" allmultiply");
        System.out.println(allAdd+" allAdd");

        String[] stArr = {"hello", "java", "world"};
        String stAllAdd = Arrays.stream(stArr).reduce(" ",(a,b)->a+b); // 실무에서 reduce 정말 많이 쓰이는 함수임은 맞다.
        System.out.println(stAllAdd+" stAllAdd");


//      findFirst
        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 20));
        students.add(new Student("choi", 32));
        students.add(new Student("lee", 35));
        students.add(new Student("park", 22));

//        나이가 30이 넘는 학생중에 첫 번쨰 index값을 가지는 학생 객체 생성, getAge() 메서드를 통해서 나이로 비교해야한다.
        Student s1 = students.stream().filter(a -> a.getAge() >= 30).findFirst().get();

//        Student 객체 실습
//        1)  모든 객체의 평균 나이.
        int age = (int)students.stream().mapToInt(a -> a.getAge()).average().getAsDouble();
        System.out.println(age);
//        2) 가장 나이 어린 사람 찾기.
//       모든??이 맞는지 모르겟지만 앵간한 sorted는 comparator로 정렬할 수 있다.
        Student s2 = students.stream().sorted((a,b)->a.getAge()-b.getAge()).findFirst().get();
        System.out.println(s2.getName());
//        3) 30대의 이름을 String 배열에 담기
        String[] nameArr = students.stream().filter(a->a.getAge()>=30).map(a -> a.getName()).toArray(String[]::new);
        System.out.println(Arrays.toString(nameArr)+" 30대의 이름");


//        Optional 객체 : 특정 객체에 값이 없을지도 모른다는것을 명시적으로 표현.
//        ofNullable : null이 있을수도 있는 경우에 Optional 객체를 생성하는 메서드

        Optional<String> opt1 = Optional.ofNullable(null);
        String st1 = null;

        if (opt1.isPresent()) {
            System.out.println(opt1.get().compareTo("hello"));
        } else {
            System.out.println("값이 없습니다.");
        }

//        옵셔널 객체 생성 3가지 방법
        Optional<String> opt2 = Optional.empty();
        Optional<String> opt3 = Optional.of(null); //null이 못 들어감 널이 들어가면 에러가 남.
        Optional<String> opt4 = Optional.ofNullable(null); // null 허용
//       이걸 왜 배우냐?
//        내가 직접 옵셔널을 만들 일은 거의 없다.
//        return이 Optional 객체인 메서드를 사용했을 떄 어떻게 할 것인가?

//            Optional 객체 처리 방법
//        방법1. isPresent()로 확인 후 get();
        if (opt3.isPresent()) System.out.println(opt3.get().length());
//        방법2. orElse() 메서드를 사용 : 값이 있으면 있는 값 return , 없으면 지정값 return
        System.out.println(opt3.get().length());
//        방법3. orElseGet() : 값이 있으면 있는 값 return, 없으면 람다함수 실행
        System.out.println(opt3.orElseGet(()->new String("")).length());
//        방법4. orElseThrow() : 가!장!중!요!, 값이 있으면 있는 값 return, 없으면 지정된 예외 강제 발생
//        개발에서 예외를 사용자에게 적절한 메시지를 전달 목적으로 강제 발생시키는 경우도 존재한다.
//        4번 정도만 기억해도 문제가 없을 것 같다.
        System.out.println(opt3.orElseThrow(()->new NoSuchElementException("값이 없다")).length());

//

//        방법2

        double answer2 = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다."));

        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("kim", 20));
        students1.add(new Student("kim1", 21));
        students1.add(new Student("kim2", 23));
        students1.add(new Student("kim3", 25));
//        방법1
        OptionalDouble answer = students1.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average();
        if(answer.isPresent()){
            System.out.println(answer.getAsDouble());
        }else {
            System.out.println("값이 없습니다.");
        }
        System.out.println(answer);
//        방법2
        double answer1 = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다."));
    }
}
