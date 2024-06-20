package C08Thread;

public class Thread1 extends Thread{
//    Thread클래스에는 run 메서드가 있는데, 빈 메서드 이다.
//    그래서, 실행 시 작업하고자 하는 내용을 run() 메서드를 overriding을 통해 구현해야한다.
//    상속 관계이다 보니, 다중 상속 불가 : Runnable과의 차이
    @Override
    public void run() {
        Library.borrow();
    }


}
