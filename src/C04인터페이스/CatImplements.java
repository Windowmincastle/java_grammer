package C04인터페이스;

public class CatImplements {

    void makeSound() {
        System.out.println("야옹");
    }

}

class CatMultiImplments implements AnimalInterface1,AnimalInterface2{

    @Override
    public String play(String a, String b) {
        return "뛰어 놉니다";
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}