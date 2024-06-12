package 문제풀이;

import java.util.*;

public class 같은숫자는싫어 {

    public static int[] solution(int []arr) {

//        set 자료형 -> st
        int[] answer = {};
        int[] temp = new int[arr.length+1];

        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < temp.length-1; i++) {

            if (temp[i] == temp[i + 1]) {
                continue;
            } else{
                stack.push(temp[i]);
            }
        }

        System.out.println(stack);

        return answer;
    }

    public static int[] 강사님솔루션(int[] arr) {

        int[] ans = {};
        Stack<Integer> stack = new Stack<>();

        for (int a : arr) {

            if (stack.isEmpty()) {
                stack.push(a);
            } else {
                if (stack.peek() != a) {
                    stack.push(a);
                }
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = answer.length-1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return ans;
    }

    static int[] 강사님솔루션2(int[] arr) {


        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (i == 0 || arr[i - 1] != arr[i]) {
                list.add(arr[i]);
            }
        }

        int[] ans = new int[list.size()];

        for (int i : list) {
            ans[i] = i;
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {

        int[] testcase1 = {1, 1, 3, 3, 0, 1, 1};
        int[] testcase2 = {4, 4, 4, 3, 3};

//        solution(testcase1);
        강사님솔루션2(testcase1);
        강사님솔루션2(testcase2);
    }
}
