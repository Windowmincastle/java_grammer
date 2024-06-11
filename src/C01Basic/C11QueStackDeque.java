package C01Basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) _{

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


    }
}
