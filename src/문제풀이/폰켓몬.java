package 문제풀이;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {

    public static int solution(int[] nums ){

        int answer = 0;

        Set<Integer> mySet = new HashSet<>();

        for (int n : nums) {
            mySet.add(n);
        }

        System.out.println(mySet);

        if (mySet.size() > nums.length / 2) {
            answer = nums.length/2;
        } else {
            answer = mySet.size();
        }

        return answer;
    }

    public static void main(String[] args) {
//      종류 : set을 활용해서 몇 가지 종류가 있는지
//      종류의 개수 n/2 ??
//
//
//
//

        int[] nums =  {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        solution(nums);
        solution(nums2);
        solution(nums3);
    }
}
