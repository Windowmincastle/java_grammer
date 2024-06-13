package C01Basic;

public class C1101StackFunction2 {

//    stack을 활용한 재귀호출 원리
    public static void main(String[] args) {

        System.out.println("start");
        function1(1);
        System.out.println("end");
    }

    static int function1(int a) {
        System.out.println("함수1 시작" + a);
        System.out.println("함수2 끝");
        return function1(a+1);
    }
//    얼마나 반복되면 스택오버플로우가 나오겟나
//      실무에서 재귀함수 잘 안 쓴다. 정말 꼭 필요한 것이 아니라면


}
