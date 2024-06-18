package C06EtcClass;

public class C0605EnumMAin {

    public static void main(String[] args) {

        EnumStudent s1 = new EnumStudent();
        s1.setName("hong");
        s1.setClassGrade(ClassGrade.c1);

//
        EnumStudent s2 = new EnumStudent();
        s2.setName("kim");

        s2.setClassGrade(ClassGrade.c2);
//      개발자가 실수로 타입이 String 타입이므로 아래와 같이 임의로 데이터를 넣을수도 있다.
        s2.setClassGrade("secondgrade");
//      role의 경우 Enum설정시 위와 같은 실수를 방지할 수 있음.
//      s2.setRole("GENERAL_USER") ; 타입 불일치
        s2.setRole(Role.GENERAL_USER);
//      Role 같은 경우에는 값의 정합성을 유지하기 때문에 DB랑 싱크가 잘 맞으니까 꼭 기억을 잘 해줘야 한다.
        System.out.println(s2.getRole());
        System.out.println(s2.getRole().getClass());
//      ordinal이란? enum값 내부에는 저장된 순서대로 0부터 index값이 내부적으로 할당된다.
//
        System.out.println(s2.getRole().ordinal());
    }
}
//클래스와 동등한 레벨이다.
//구현의 의도가 enum임을 구현의 의도를 명확히 하고있다.
enum Role {
//    각 열거형 상수는 콤마로 구분하고, 상수 목록 끝에 세미콜론으로 마무리 짓는다.
//    final static이 생략이 되어있는 형식이다.
    GENERAL_USER, ADMIN_USER
}

class EnumStudent {

    private String name;
    private String classGrade;
    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

class ClassGrade {
//    문자열 상수 선언을 통해서는 정합성을 완벽하게 보장할 수 없다.
    static final String c1 = "first_grade";
    static final String c2 = "2_grade";
    static final String c3 = "3_grade";
}