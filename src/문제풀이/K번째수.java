package 문제풀이;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class K번째수 {

    public static void main(String[] args) {

        //배열 짤라서
        int[] ary = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3,},{4,4,1},{1,7,3}};
        int[] answer = new int[commands.length];

        for (int x = 0; x <= commands.length; x++) {
                int start = commands[x][0]-1;
                int end = commands[x][1];
                int value = commands[x][2]-1;

                int[] temp = new int[end-start+1];
                int cnt = 0;
            for (int y = start; y < end; y++) {
                temp[cnt] = ary[y];
                cnt++;
            }
            Arrays.sort(temp);
            answer[x] = temp[value];
        }

        System.out.println(Arrays.toString(answer));
    }
}
