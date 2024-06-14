package C05AnonymousLambda;

public class C0501InnerClass {

    public static void main(String[] args) {

//        AbstractAnimal이 상속한 클래스가 별도로 존재하지 않고,
//        익명의 클래스가 만들어짐과 동시에 익명 객체 생성

//        익명객체에 구현 메서드가 1개밖에 없을때에 람다 표현식으로 표현 가능
//        () 부분에 매개변수를 지정하여 구현체에서 활용.
//        변수의 개수와 순서를 맞춰서 지정
        Animal2 -> makeSound() return
    }
}

interface  Aniaml{

    void makeSound(int ip1, String ip2);

}

interface Animal2 {

    String makeSound(String a, String b, int c);
}

abstract class AbstractAnimal {

    void makeSound(){
    }


    void makeSound2(){

    }

}


