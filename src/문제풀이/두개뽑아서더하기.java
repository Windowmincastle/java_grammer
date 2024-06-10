package 문제풀이;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 두개뽑아서더하기 {

    public static void main(String[] args) {

//        int[] numbers = {2, 1, 3, 4, 1};
//        int[] result = new int[numbers.length * 2];
//        int[] temp = new int[numbers.length * 2];
//
//        int num = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (i == 0 || temp[i] != temp[i - 1]) {
//                temp[num] = numbers[i];
//                num++;
//            }
//        }
//        System.out.println(Arrays.toString(temp));
//
//        result = Arrays.copyOfRange(temp, 0, num);
//        Arrays.sort(result);
//
//        int[] answer = new int[result.length * result.length - 1];
//
//        for (int i = 0; i < numbers.length; i++) {
//            int total = 0;
//            for (int j = i + 1; j < numbers.length; j++) {
//                total = result[i] + result[j];
//            }
//            answer[i] = total;
//        }
//
//        System.out.println(Arrays.toString(answer));
//
//    }

        int[] numbers = {2, 1, 3, 4, 1};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }



    }

}
