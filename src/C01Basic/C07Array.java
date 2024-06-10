package C01Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;

public class C07Array {

    public static void main(String[] args) {
//
////       배열 표현식 1 : 리터럴 방식
//        int[] intAry = {1, 2, 3, 4, 5};
//
//
////      배열 표현식 2 배열 선언 후 할당 방식
//        int[] intAry2 = new int[5];

//        intAry2[0] = 1;
//        intAry2[1] = 2;
//        intAry2[2] = 3;
//        intAry2[3] = 4;
//
//        for (int x : intAry2) {
//            System.out.println(x);
//        }

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
//        String[] stArr = new String[5];
//        stArr[0] = "hello";
//        stArr[1] = "java";
//        NPE
//        System.out.println(stArr[2].length()); // null이 있기 때문에 NPE 발생

//        String[] stArr2 = new String[5];
        //배열에 값 한꺼번에 세팅

//        Arrays.fill(stArr2, "java"); // stArr2의 배열의 모든 값을 "java"로 채운다
//        System.out.println(stArr2[3]);

//        실습 85,65,90 int 배열을 선언하고 총합 평균을 구해보자
//        int ttl = 0;
//        int avg = 0;
//        int ary[] = new int[] {85, 65, 90};
//        for (int i = 0; i < args.length; i++) {
//            ttl += ary[i];
//        }
//        avg = ttl/ary.length;
//

//       최대값, 최소값 구하기
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        int max = arr[0];
//        int min = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (max > arr[i]) {
//                max = arr[i];
//            }
//            if ( min < arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//
////       배열의 순서 바꾸기 swap
//        int[] ary = {10, 20};
//        int temp = ary[0];
//        ary[0] = ary[1];
//        ary[1] = temp;


////
//        int[] arr2 = {10, 20, 30, 40, 50};
////        0번쨰 idx부터 마지막 idx까지 순차적으로 자리 change
////        반복문으로 i+1을 활용할때 outofindex를 조심해라.
//        for (int i = 0; i < arr2.length-1; i++) {
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));
//
//        배열 뒤집기
//        int[] ary = {1, 2, 3, 4, 5};
//
//        //새로운 배열에 위 ary의 뒤집은 값을 셋팅
//
//        int[] newAry = new int[ary.length];
//        int num = ary.length-1;
//        for (int i=0; i<ary.length; i++) {
//            newAry[num-i] = ary[i];
//        }
//        System.out.println(Arrays.toString(newAry));
//
//        int test = ary.length;
//        System.out.println(test);
//
////      숫자 뒤집기 -> reveser().toString(); 이 가장 꿀 이다.
//        int num = 1234;
////        문자열과 관련된 풀이로 풀기
//
//        String stNum = Integer.toString(num);
//        StringBuilder sb = new StringBuilder();
//
//        int cnt = stNum.length();
//        for (int i = 0; i < stNum.length(); i++) {
//            sb.append(stNum.charAt(cnt-i-1));
//        }

////    정렬 구현, 메서드도 써보고 , 직접 구현도 해보자.
////    선택정렬과 버블정렬 둘다 성능이 안 좋다.
//
//        int[] ary = {5, 1, 2, 7, 3, 1, 2};
//        Arrays.sort(ary); // 오름차순 정렬이 기본이다.
//        System.out.println(Arrays.toString(ary));
//
////      문자 정렬은 아스키 코드 기준으로 정렬이 되므로 대문자가 소문자보다 아스키코드 숫자가 낮다.
//        String[] fruits = {"banana", "apple", "cherry", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
////      문자열의 index 순서로 비교
////      대문자 > 소문자 >
//        String[] fruits2 = {"apple1", "apple11", "apple2"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));
//
////      내림차순
//        String[] stAry = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(stAry, Comparator.reverseOrder());
//      기본형 타입은 Comparator로 처리 불가하다. 숫자는 또 내림차순 정렬이 안된다. 이기 뭐고?
//      Comparator 설계 자체가 참조형 변수를 처리하도록 후기에 만들어졌기 때문에

//        int[] intAry = {5, 1, 2, 7, 3, 1, 2};
////        타입을 맞춰줘야한다면 오름차순 정렬 후 배열 뒤집기하는 경우가 많다.
//        Arrays.sort(intAry);
//
////        streamapi, lamda를 활용한 내림차순 정렬
//        int[] answer = Arrays.stream(intAry) //intAry를 대상으로 Stream 객체 생성
//                        .boxed(). // int 요소를 Integer로 형변환
//                        sorted(Comparator.reverseOrder()). // 정렬하고 리버스
//                        mapToInt(a -> a) // Integer를 int로 형변환
//                        .toArray();// 배열로 변// 환
//
//        System.out.println(Arrays.toString(intAry));

//        String은 Null, boolean은 false , int는 0 으로 자동 저장

//        선택정렬,버블정렬

        // 프로그래머스 K 번째 수 풀이. 6-10

////      선택정렬 알고리즘
////        1. min 값을 찾는다. 0번째 idx와 바꾼다. 자리픽스 , min값 검사 오른쪽으로만
////
////        int[] ary = {17, 20, 19, 25, 12,6,9,11,144,12,34,1,5,12,3,5};
//////                   5
////        for (int i = 0; i < ary.length-1; i++) {
////
////            for (int j = i + 1; j < ary.length; j++) {
////
////                int temp = ary[i];
////
////                if (ary[i] > ary[j]) {
////
////                    temp = ary[j];
////
////                    ary[j] = ary[i];
////                    ary[i] = temp;
////
////                }
////            }
////        }
////        System.out.println(Arrays.toString(ary));
//
//
//        //숫자 조합의 합
//        // 모두 각기 다른 숫자의 배열이 있을때 만들어 질 수 있는 2개의 조합의 합을 출력.
//        int[] ary2 = {10, 20, 30, 40, 50, 60};
//        int cnt = 0;
//        for (int i = 0; i < ary2.length; i++) {
//            int total;
//            for (int j = i+1; j < ary2.length; j++) {
//                total = ary2[i] + ary2[j];
//                System.out.println(ary2[i]+" + "+ary2[j]+" = "+total);
//                cnt++;
//            }
//        }
//        System.out.println("조합은 총 "+cnt+" 개 입니다.");
//

//     배열의 복사.
//        copyOf(배열,length), copyOfRange(배열,start,end);

//        int[] ary = {10, 20, 30, 40, 50, 60};
//        int[] copyAry = Arrays.copyOf(ary,10); // 만약에 endidx 자리에 복사할 배열의 길이를 넘게 입력한다면 0으로 다 채운다.
//        System.out.println(Arrays.toString(copyAry));
//        int[] copyAry2 = Arrays.copyOfRange(ary, 1, 4); // 아마 end 미만까지 복사할듯?
//        System.out.println(Arrays.toString(copyAry2));

////      배열의 중복 제거
//        int[] temp = {10, 10, 5, 7, 40, 10, 10};
////        5,7,10,10,,10,40,40
////        list,set도 쓰지말고 중복 제거 하자.
//        Arrays.sort(temp);
//        int[] newTemp = new int[temp.length];
//        for (int i = 0; i < temp.length; i++) {
//            for (int j = i + 1; j < temp.length; j++) {
//
//                if (temp[i] != temp[j]) {
//                    newTemp[i] = temp[i];
//                }
//
//            }
//            System.out.println("newTemp =>" + Arrays.toString(newTemp));
//
////        5,7,10,10,10,10,10,40
////      강사님 코드
//
//        }
//
//        int[] newTemp2 = new int[temp.length];
//        int num = 0;
//
//        for (int i = 0; i < temp.length; i++) {
//            if (i == 0 || temp[i] != temp[i - 1]) {
//                newTemp2[num] = temp[i];
//                num++;
//            }
//
//        }
//        int[] answer = Arrays.copyOfRange(newTemp2, 0, num);

//
//        //        배열의 검색
//        int[] ary3 = {5, 3, 1, 8, 7};
//
//        for (int i = 0; i < ary3.length; i++) {
//            if (ary3[i] == 8) {
//                System.out.println("8은 배열 ary3의 인덱스 " + (i) + " 에 있습니다.");
//                break;
//
//            }
//
//        }
//
////        binary search, 전제조건 : 정렬이 되어 있어야 한다.
//        int[] ary4 = {1, 3, 6, 8, 9, 11, 15};
//        System.out.println(Arrays.binarySearch(ary4, 15));
////        시간복잡도 O(logn)

//        배열 간 비교
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//        System.out.println(arr1 = arr2);
////        Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1,arr2));
//
//        // 2차원 배열 선언과 할당
//        int[][] arr = new int[2][3];
//        arr[0][0]=1;
//
//        // 리터럴 방식으로 할당.
//        int[][] ary = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//        };
//
//
////        2차원 배열의 출력에 주의
//        System.out.println(Arrays.toString(ary));  // 메모리가 나온다.
//        // 전체 배열의 메모리와 각 배열의 메모리주소가 다 존재한다.
//        System.out.println(Arrays.deepToString(ary));
//
//        //       가변 배열 리터럴 방식
//        int[][] arr3 = {{10,20},{10,20,30}};
////        2차원 가변배열 선언 후 할당
////        int[][] arr2 = new int[2][]; // 뒤에는 비워도 되나본데 ?
////
//////        [3][4] 사이즈 배열 선언한 뒤, 1~12까지 숫자값 각 배열에 할당 후 출력
//////        {1,2,3,4},{5,6,7,8},{9,10,11,12}
//
//        int arr4[][] = new int[3][4];
//        int number = 1;
//        for (int i = 0; i < arr4.length; i++) {
//            for (int j = 0; j < arr4[i].length; j++) {
//                arr4[i][j] = number;
//                number++;
//            }
//        }
//        System.out.println("for문 2차원배열 할당."+Arrays.deepToString(arr4));

////      행렬의 덧셈 프로그래머스
////
////        int[][] answer = new int[arr1.length][arr1[0].length];
////
////        for (int i = 0; i < arr1.length; i++) {
////            for (int j = 0; j < arr1[0].length; j++) {
////                answer[i][j] = arr1[i][j] + arr2[j[j];
////            }
////        }
//
//
////        가변 배열 실습 : 행의길이 (전체 배열의 길이) 5 =>
////        각 배열마다
//
//        int cnt = 10;
//        for (int i = 0; i < test.length; i++) {
//            for (int j = 0; j < test[0].length; j++) {
//                for (int k = 0; k < test[0].length; k++) {
//                    test[j][k] = cnt;
//                }
//                test[i][j] = cnt;
//                cnt += 10;
//            }
//        }
//        System.out.println("for문 2차원배열 할당."+Arrays.deepToString(test));
        int[][] test = new int[5][];

        for (int i = 0; i < test.length; i++) {
            test[i] = new int[i+1];
            for (int j = 0; j < test[i].length; j++) {
                test[i][j] = (i+1) * 10;
            }
        }

        System.out.println("for문 2차원배열 할당."+Arrays.deepToString(test));


    }
}
