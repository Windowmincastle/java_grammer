package lecture.C02ClassBasic;

public class C0203Person {

//    db의 테이블 단위와 클래스 단위가 일치하게 될 것 이다.
// 인스턴스 변수에 private 하면 다른 클래스에서 접근이 불가능하니까
//    메서드를 통해서 값을 할당해야 한다.
    String name;
    String email;
    int age;


//    객체 메서드
    public void eating() {
// 값을 할당하지 않으면 null이 밥을 먹는다 라고 출력될 것 이다. 즉 getter , setter를 통해서
//        값을 할당해야한다

//        변수의 안정성이 떨어지기 때문에 의도가 명확한
        System.out.println(this.name +"은 냠냠쩝쩝");
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
