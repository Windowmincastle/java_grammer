package 알고리즘;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_10039_평균점수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 0;
        int total = 0;
        int stuCnt = 5;
        int standard = 40;

        for (int i = 1; i <= stuCnt; i++) {

            int score = Integer.parseInt(br.readLine());

            if (score < standard) {
                total += standard;
            } else {
                total += score;
            }

        }

        ans = total / stuCnt;
        System.out.println(ans);
    }
}
