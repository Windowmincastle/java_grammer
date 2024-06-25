package C01Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
정적 배열의 길이는 사전에 지정이 되어 있어야 한다.
Arrays.fill(strArray2, "java"); // strArray2의 배열의 모든 값을 "java"로 채운다

// 배열의 복사
int[] originalArray = {10, 20, 30, 40, 50, 60};
int[] copiedArray = Arrays.copyOf(originalArray, 10); // 만약에 endIdx 자리에 복사할 배열의 길이를 넘게 입력한다면 0으로 다 채운다.
System.out.println(Arrays.toString(copiedArray));
int[] copiedArray2 = Arrays.copyOfRange(originalArray, 1, 4); // end 미만까지 복사
System.out.println(Arrays.toString(copiedArray2));

Comparator.reverseOrder는 Integer 데이터 타입만 가능하다.

// 배열의 중복 제거
int[] arrayWithDuplicates = {10, 10, 5, 7, 40, 10, 10};
Arrays.sort(arrayWithDuplicates);

// 배열 간 비교
int[] compareArray1 = {10, 20, 30};
int[] compareArray2 = {10, 20, 30};
System.out.println(Arrays.equals(compareArray1, compareArray2)); // Arrays.equals : 값과 순서까지 동일해야 true

int[] sortedArray = {1, 3, 6, 8, 9, 11, 15};
System.out.println(Arrays.binarySearch(sortedArray, 15)); // 시간복잡도 O(logn) 15는 찾고자 하는 값

Arrays.deepToString(이차원배열)
이차원 배열 출력
 */

public class C07ArrayPratice {

    public static void main(String[] args) {
        // 배열 표현식 1 : 리터럴 방식
        int[] intArray1 = {1, 2, 3, 4, 5};

        // 배열 표현식 2 배열 선언 후 할당 방식
        int[] intArray2 = new int[5];

        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;
        intArray2[3] = 4;

        for (int x : intArray2) {
            System.out.println(x);
        }

        System.out.println(intArray2[4]); // 0으로 초기화가 되어있다.
        // char도 초기값이 할당이 되어있다. 근데 char는 잘 안 쓴다. 그래서 그렇게 중요하지 않다.
        String[] charArray = new String[10];
        System.out.println(charArray[0]);

        // 표현식3
        int[] intArray3 = new int[]{1, 2, 3, 4};

        // 표현식 4 : 불가능 하다. -> 배열의 길이는 사전에 지정이 되어 있어야한다.
        // int[] intArray4 = new int[];

        String[] strArray = new String[5];
        strArray[0] = "hello";
        strArray[1] = "java";
        // System.out.println(strArray[2].length()); // null이 있기 때문에 NPE 발생

        String[] strArray2 = new String[5];
        // 배열에 값 한꺼번에 세팅
        Arrays.fill(strArray2, "java"); // strArray2의 배열의 모든 값을 "java"로 채운다
        System.out.println(strArray2[3]);

        // 실습 85,65,90 int 배열을 선언하고 총합 평균을 구해보자
        int total = 0;
        int average = 0;
        int[] scores = new int[] {85, 65, 90};
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        average = total / scores.length;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        // 최대값, 최소값 구하기
        int[] arr = {10, 20, 30, 12, 8, 17};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // 배열의 순서 바꾸기 swap
        int[] swapArray = {10, 20};
        int temp = swapArray[0];
        swapArray[0] = swapArray[1];
        swapArray[1] = temp;

        int[] arr2 = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr2.length-1; i++) {
            temp = arr2[i];
            arr2[i] = arr2[i+1];
            arr2[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr2));

        // 배열 뒤집기
        int[] arrayToReverse = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[arrayToReverse.length];
        int num = arrayToReverse.length - 1;
        for (int i = 0; i < arrayToReverse.length; i++) {
            reversedArray[num - i] = arrayToReverse[i];
        }
        System.out.println(Arrays.toString(reversedArray));

        // 숫자 뒤집기
        int number = 1234;
        String strNumber = Integer.toString(number);
        StringBuilder sb = new StringBuilder();

        int count = strNumber.length();
        for (int i = 0; i < strNumber.length(); i++) {
            sb.append(strNumber.charAt(count - i - 1));
        }
        System.out.println("Reversed Number: " + sb);

        // 정렬 구현
        int[] arrayToSort = {5, 1, 2, 7, 3, 1, 2};
        Arrays.sort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));

        // 문자 정렬
        String[] fruits = {"banana", "apple", "cherry", "Apple"};
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        // 문자열의 index 순서로 비교
        String[] fruits2 = {"apple1", "apple11", "apple2"};
        Arrays.sort(fruits2);
        System.out.println(Arrays.toString(fruits2));

        // 내림차순
        String[] strArray3 = {"hello", "hi", "bye", "goodmorning"};
        Arrays.sort(strArray3, Comparator.reverseOrder()); //int형은 안돼? 응 안돼

        System.out.println(Arrays.toString(strArray3));

        int[] intArray4 = {5, 1, 2, 7, 3, 1, 2};
        Arrays.sort(intArray4);
        int[] descendingArray = Arrays.stream(intArray4) // intArray4를 대상으로 Stream 객체 생성
                .boxed() // int 요소를 Integer로 형변환
                .sorted(Comparator.reverseOrder()) // 정렬하고 리버스
                .mapToInt(Integer::intValue) // Integer를 int로 형변환
                .toArray(); // 배열로 변환

        System.out.println(Arrays.toString(descendingArray));

        // 선택정렬 알고리즘
        int[] selectionSortArray = {17, 20, 19, 25, 12, 6, 9, 11, 144, 12, 34, 1, 5, 12, 3, 5};
        for (int i = 0; i < selectionSortArray.length - 1; i++) {
            for (int j = i + 1; j < selectionSortArray.length; j++) {
                if (selectionSortArray[i] > selectionSortArray[j]) {
                    temp = selectionSortArray[j];
                    selectionSortArray[j] = selectionSortArray[i];
                    selectionSortArray[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(selectionSortArray));

        // 숫자 조합의 합
        int[] combinationsArray = {10, 20, 30, 40, 50, 60};
        int combinationCount = 0;
        for (int i = 0; i < combinationsArray.length; i++) {
            int totalSum;
            for (int j = i + 1; j < combinationsArray.length; j++) {
                totalSum = combinationsArray[i] + combinationsArray[j];
                System.out.println(combinationsArray[i] + " + " + combinationsArray[j] + " = " + totalSum);
                combinationCount++;
            }
        }
        System.out.println("조합은 총 " + combinationCount + " 개 입니다.");

        // 배열의 복사
        int[] originalArray = {10, 20, 30, 40, 50, 60};
        int[] copiedArray = Arrays.copyOf(originalArray, 10); // 만약에 endIdx 자리에 복사할 배열의 길이를 넘게 입력한다면 0으로 다 채운다.
        System.out.println(Arrays.toString(copiedArray));
        int[] copiedArray2 = Arrays.copyOfRange(originalArray, 1, 4); // end 미만까지 복사
        System.out.println(Arrays.toString(copiedArray2));

        // 배열의 중복 제거
        int[] arrayWithDuplicates = {10, 10, 5, 7, 40, 10, 10};
        Arrays.sort(arrayWithDuplicates);
        int[] uniqueArray = new int[arrayWithDuplicates.length];
        int index = 0;

        for (int i = 0; i < arrayWithDuplicates.length; i++) {
            if (i == 0 || arrayWithDuplicates[i] != arrayWithDuplicates[i - 1]) {
                uniqueArray[index] = arrayWithDuplicates[i];
                index++;
            }
        }
        int[] finalUniqueArray = Arrays.copyOfRange(uniqueArray, 0, index);
        System.out.println("Unique Array: " + Arrays.toString(finalUniqueArray));

        // 배열의 검색
        int[] searchArray = {5, 3, 1, 8, 7};

        for (int i = 0; i < searchArray.length; i++) {
            if (searchArray[i] == 8) {
                System.out.println("8은 배열 searchArray의 인덱스 " + i + " 에 있습니다.");
                break;
            }
        }

        // binary search, 전제조건 : 정렬이 되어 있어야 한다.
        int[] sortedArray = {1, 3, 6, 8, 9, 11, 15};
        System.out.println(Arrays.binarySearch(sortedArray, 15)); // 시간복잡도 O(logn)

        // 배열 간 비교
        int[] compareArray1 = {10, 20, 30};
        int[] compareArray2 = {10, 20, 30};
        System.out.println(Arrays.equals(compareArray1, compareArray2)); // Arrays.equals : 값과 순서까지 동일해야 true

        // 2차원 배열 선언과 할당
        int[][] twoDimArray = new int[2][3];
        twoDimArray[0][0] = 1;

        // 리터럴 방식으로 할당
        int[][] literalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 2차원 배열의 출력에 주의
        System.out.println(Arrays.toString(literalArray));  // 메모리가 나온다.
        // 전체 배열의 메모리와 각 배열의 메모리주소가 다 존재한다.
        System.out.println(Arrays.deepToString(literalArray));

        // 가변 배열 리터럴 방식
        int[][] variableArray1 = {{10, 20}, {10, 20, 30}};
        // 2차원 가변배열 선언 후 할당
        // int[][] variableArray2 = new int[2][]; // 뒤에는 비워도 되나본데 ?

        // [3][4] 사이즈 배열 선언한 뒤, 1~12까지 숫자값 각 배열에 할당 후 출력
        int[][] arrayWithValues = new int[3][4];
        int numberValue = 1;
        for (int i = 0; i < arrayWithValues.length; i++) {
            for (int j = 0; j < arrayWithValues[i].length; j++) {
                arrayWithValues[i][j] = numberValue;
                numberValue++;
            }
        }
        System.out.println("for문 2차원배열 할당." + Arrays.deepToString(arrayWithValues));

        // 가변 배열 실습
        int[][] jaggedArray = new int[5][];

        for (int i = 0; i < jaggedArray.length; i++) {
            jaggedArray[i] = new int[i + 1];
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (i + 1) * 10;
            }
        }
        System.out.println("for문 2차원배열 할당." + Arrays.deepToString(jaggedArray));
    }
}
