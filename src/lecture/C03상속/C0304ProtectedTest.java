package C03상속;

public class C0304ProtectedTest {

    public static void main(String[] args) {
        C0304ProtectedClass pc = new C0304ProtectedClass();
//        public
        System.out.println(pc.st4); // public 접근 가능
//        System.out.println(pc.st1); // private은 당연히 접근 불가능, 같은 클래스 내에서만 접근 가능하겟지요

//        default변수 접근 가능
        System.out.println(pc.st3);
//        protected변수 접근 가능
        System.out.println(pc.st2);



    }
}
