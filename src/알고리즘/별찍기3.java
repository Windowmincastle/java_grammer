package 알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //repeat 메서드를 사용한 방법
        System.out.println("repeat 메서드를 사용한 방법");
        for (int i = n; i > 0; i--) {
            System.out.println("*".repeat(i));
        }
        // 오토박싱,언박싱 , 일반적인 방법

        System.out.println("---------정석적인 방법---------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
