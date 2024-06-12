package C02ClassBasic;

public class ClassMain {

    public static void main(String[] args) {
        C0203Person per1 = new C0203Person();

//        변수값에 직접 접근하여 값을 할당하는 방식
        per1.name = "김민성";
        per1.age = 31;
        per1.email = "kcm1042@naver.com";
        per1.eating();

        System.out.println("이름 : " + per1.name);

        per1.setName("홍길동");
        System.out.println(per1.getName());
        per1.eating();
//        일반적인 패턴은 변수값에 직접 접근하지 않는다.
//        의도를 명확히 한 메서드를 통해 변수값을 할당하고 가져온다. -> 이게 무슨 의미인데? setter , getter 이야기 하는듯???
    }
}
