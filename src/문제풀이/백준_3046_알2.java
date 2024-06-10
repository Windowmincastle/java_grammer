package 문제풀이;

import java.io.IOException;
import java.util.Scanner;

public class 백준_3046_알2 {

    public static void main(String[] args) throws IOException {
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r1 = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());*/

        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(2 * s - r1);

    }

}
