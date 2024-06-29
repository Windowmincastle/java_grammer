package C04인터페이스;

public class DogImplements {

    void makeSound() {
        System.out.println("멍멍");
    }

    public void play(String 진돗개, String 시바견) {
    }
}

//내부 클래스 테스트
class DogMultiImplments implements AnimalInterface1,AnimalInterface2{

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public String play(String a, String b) {
        return "멍멍이가 뛰어놉니다";
    }
}