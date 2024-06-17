package 문제풀이;

import java.util.ArrayList;
import java.util.List;

public class 가장큰수 {

    static List<String> getP(int[] numbers) {
        List<String> result = new ArrayList<>();
        permute(numbers, 0, result);
        return result;
    }

    static void permute(int[] numbers, int start, List<String> result) {

        if (start == numbers.length - 1) {

            StringBuilder sbb = new StringBuilder();

            for (int num : numbers) {
                sbb.append(num);
            }

            result.add(sbb.toString());
            return;
        }

        for (int i = start; i < numbers.length; i++) {
            swap(numbers, start, i);
            permute(numbers, start + 1, result);
            swap(numbers, start, i);
        }

    }

    static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }


    public static void main(String[] args) {

        int[] numbers = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};

        List<String> lst = getP(numbers);
        List<String> lst2 = getP(numbers2);

    }


}




