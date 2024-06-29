package C08Thread;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

////       스레드 생성 방법 2가지 : 1. 스레드 상속 방식
//        Thread t1 = new Thread1();
//        t1.start();
////        start 메서드가 상속되어 있고, 이 메서드를 통해 run 메서드 실행
////        2. Runnable 구현 방식
//        Thread t2 = new Thread1();
//        t2.start();
//
//        //2번 구현 및 주입 방식
//        Thread t3 = new Thread(new Thread());
//        t3.start();
//
//        new Thread(new Thread2()).start(); // 이것도 가능
////        아마도 이게 가장 간결한 코드가 될것 같다.
//        new Thread(() -> System.out.println("익명Runnable 객체 주입 후 실행 Thread")).start();
////        이게 가능한 이유?? 메서드가 1개밖에 없기 떄문에
//
////       Thread 단일 쓰레드 동시성 이슈 테스트
//        for (int i = 0; i < 1000; i++) {
//            Library.borrow();
//        }

//        System.out.println("최종수량" + Library.bookCount);
//        Thread t1 = new Thread1();
//        Thread t2 = new Thread1();
//        t1.start();
//        t2.start();

//        1000개의 쓰레드를 생성
        for (int i = 0; i < 10000; i++){
            Thread t1 = new Thread(() -> Library.borrow());
            t1.start();
        }
        System.out.println("최종수량 체크"+ Library.bookCount);



    }
}
