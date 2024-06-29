package 스터디패키지.백준.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_덱 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String[] com = br.readLine().split(" ");
            if (com[0].equals("push_front")) {
                deque.addFirst(com[1]);
            } else if (com[0].equals("push_back")) {
                deque.addLast(com[1]);
            } else if (com[0].equals("pop_front")) {
                System.out.println(deque.pollFirst());
            } else if (com[0].equals("pop_back")) {
                System.out.println(deque.pollLast());
            } else if (com[0].equals("size")) {
                System.out.println(deque.size());
            } else if (com[0].equals("empty")) {

                boolean temp = deque.isEmpty();
                if (temp == true) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }

            } else if (com[0].equals("front")){
                String temp = deque.peekFirst();
                if (temp == null) {
                    System.out.println("-1");
                } else {
                    System.out.println(temp);
                }

            } else if (com[0].equals("back")) {
                String temp = deque.peekLast();
                if (temp == null) {
                    System.out.println("-1");
                } else {
                    System.out.println(temp);
                }
            }

        }
    }
}
