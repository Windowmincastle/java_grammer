package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("문서1");
        queue.add("문서2");
        queue.add("문서3");

//        아래 형태로 엄청 많이 쓴다. 외워버려라
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

//        System.out.println(queue.peek());
//        System.out.println(queue); // peek과 poll의 차이
//        System.out.println(queue.poll());
//        System.out.println(queue);

        //왜 큐를 구현하는데 링크드리스트를 써야하나 ?

//      LinkedList와 ArrayList 비교 코드 discord 채팅방에 있음.
//
//        ArrayBlockingQueue : 길이제한큐 수용량을 제한할 수 있다.

        Queue<String> restrictQueue = new ArrayBlockingQueue<>(3);

//        우선순위큐 : 데이터를 꺼낼 때 정렬된 데이터 pop


        //stack
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);

//        pop은 스택에서 요소를 제거하고 요소를 반환한다.
        System.out.println(st1.pop());
        System.out.println(st1.peek());
        System.out.println(st1.size());
        System.out.println(st1.isEmpty()); //비엇는지 안 비엇는지

//        String 객체 5개 정도 Stack에 추가하고 while문을 통해 출력
        Stack<String> st2 = new Stack<>();
        st2.push("a1");
        st2.push("a2");
        st2.push("a3");
        st2.push("a4");
        st2.push("a5");

        while (!st2.isEmpty()) {
            System.out.println(st2.pop());
        }

//        문제 풀이 : 프로그래머스 같은 숫자는 싫어
//        문제 풀이 : 올바른 괄호

//        덱 수업
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addLast(10);
        deque.addLast(20);
        System.out.println(deque);
        deque.addFirst(30);
        System.out.println("Deque 출력 ->"+deque);
        System.out.println("deque 출력 ->" + deque.peekLast()); // poll
        System.out.println("deque.pollFirst ->" + deque.pollLast()); //pop

//      관련 문제 : 다리를 지나는 트럭, deque는 알아야한다 정리를 하자


    }
}
