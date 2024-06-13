package C01Basic;

public class C1101StackFunction1 {

    public static void main(String[] args) {

        System.out.println("start");

        System.out.println("end");
    }

    static void func1() {
        System.out.println("fnc1 시작");
        func2();
        System.out.println("fnc1 끝");
    }

    static void func2() {

        System.out.println("fnc2 시작");
        func1();
        System.out.println("fnc2 끝");

    }
}
