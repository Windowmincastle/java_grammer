package C03상속;

public class C0304ProtectedClass {

    private String str = "hello java1";

    String st2 = "hello java2";

    protected String st3 = "hello java3";
    public String st4 = "hello java4";

    //클래스에는 public과 default밖에 없다
    //변수 , 메서드에는 4가지 접근제어자가 존재한다

    // pbulci : 프로젝트 전체에서 접근 가능
    // protected : 패키지를 벗어나더라도 상속 곤계인 경우에는 접근 가능
    // default : 패키지내에서만 접근 가능
    // private : 클래스내에서만 접근 가능


}
