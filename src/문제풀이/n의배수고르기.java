package 문제풀이;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n의배수고르기 {

    public static void main(String[] args) {

        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {

            if (numlist[i]%3 == 0){
                list.add(numlist[i]);
            }
        }

        

    }
}
