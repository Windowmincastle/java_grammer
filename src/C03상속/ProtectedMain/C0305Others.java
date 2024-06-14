package C03상속.ProtectedMain;


//추상 클래스와 인터페이스 차이?
// => 추상 클래스는 구현돼있는 메서드 + 구현돼잇지 읺은 메서드
//인터페이스 요소 : 구현돼있지 않은 메서드

public class C0305Others{

//    final을 클래스에 붙이면 상속 불가한 클래스가 되는 것 이다.

    public static void main(String[] args) {

        final int a = 10;
//        a = 20; // 안된다 상수 이기 떄문에

        AbstractDog dog = new AbstractDog();

    }
}

final class FinalParents {

}

//abstract 클래스로 객체를 만들 수 없다.
//추상 클래스와 인터페이스는 구현없이 객체 생성 불가
abstract class AbstractAnimal {
    void makeSound() {
        System.out.println("동물소리를 냅니다.");

    }

//    메서드 앞에 final이 붙으면 오버라이딩 불가
    final void makesound2() {
        System.out.println("동물소리를 냅니다 2");
    }

    //    abstract 키워드는 자식 클래스로 하여금 오버라이딩을 강제한다
//    abstract 메서드가 하나라도 있으면 반드시 크래스에도 abstract 키워드가 붙어야한다.
//    리턴타입과 매개변수만 정의
    abstract void makesound3();


}

class AbstractDog extends AbstractAnimal{

    @Override
    void makesound3() {

    }

//    final 메서드를 오버라이드 해봤는데 안되는 것을 확인할 수 있다.
//    @Override
//    void makeSound2() {
//
//    }
}
