package 스터디패키지.백준.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10828_스택 {

    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] order = br.readLine().split(" ");

            if (order[0].equals("push")) {
                stack.push(Integer.parseInt(order[1]));
            } else if (order[0].equals("pop")) {

                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if (order[0].equals("size")) {
                System.out.println(stack.size());
            } else if (order[0].equals("empty")) {
                if (stack.empty() == false) {
                    System.out.println(0); //데이터가 있다.
                } else {
                    System.out.println(1);
                }
            } else if (order[0].equals("top")) {

                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
