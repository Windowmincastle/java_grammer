package lecture.C02ClassBasic;

public class C0204MethodOverloading {

    public static void main(String[] args) {

        C0204MethodOverloading sumMethod = new C0204MethodOverloading();
        System.out.println(sumMethod.sum(10,20));


    }
// 접근제어자를 안 붙이면 기본적으로 default 접근제어자 : 같은 패키지내 유효


//    메서드 오버로딩 매개변수의 타입 또는 개수가 다르면, 같은 이름의 메서드 정의 가능, 즉 ,메서드 오버로딩
//    매개변수 개수로 알아서 프로그램에서 판단해서 출력한다.
    int sum(int a, int b) {
        return a+b;
    }

    double sum(double a, double b) {
        return a + b;
    }

}
