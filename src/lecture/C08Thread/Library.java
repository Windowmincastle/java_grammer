package C08Thread;

public class Library {

    static int bookCount = 100;

//    싱크로나이즈드 키워드를 통해서 해당 메서드에 한해서 lock을 걸도록 설정
//    보통 메서드에 건다, 클래스 차원에서도 걸수있다.
    public synchronized static void borrow() {

//        동시성 이슈가 생긴 것 이다.
        if (bookCount > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bookCount--;
            System.out.println("대출 완료");
            System.out.println("남은 책 수->"+bookCount);
        } else {
            System.out.println("안돼 안 바꿔줘 돌아가!");
        }

    }
}
