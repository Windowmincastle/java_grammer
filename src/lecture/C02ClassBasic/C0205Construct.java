package lecture.C02ClassBasic;

public class C0205Construct {

    public static void main(String[] args) {

        Calendar cal = new Calendar("2024", "06", "12");

//        cal.setYear("2024");
//        cal.setMonth("06");
//        cal.setDay("12");

        System.out.println(cal.getYear() + cal.getMonth() + cal.getDay());
//      생성자이야기 할듯?


    }

}

class Calendar {

    String year;
    String month;
    String day;

//    별도의 생성자를 만들경우, 초기 생성자를 따로 선언이 필요


    //    내가 커스텀한 생성자를 사용하고 싶다면 깡통 생성자를 별도로 만들어야 한다.
    Calendar() {
    }

    Calendar(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    같은 클래스 내의 다른 생성자 호출 시 this() 사용
//    보통 생성자 많이 안 만든다, 원하는 생성자 하나, 깡통 1개 정도 만든다.

//    실무에서는 getter는 거의 다 존재하지만 setter는 생성자로 대체할 수 도 있고 좀 애매하다
//    차라리 의도가 명확한 메서드를 통해서 데이터를 처리하는게 좀 더 실무스럽다??

    Calendar(String year, String month) {
        this(year, month, null);
    }

    public String getYear() {
        return year;
    }

//    public void setYear(String year) {
//        this.year = year;
//    }

    public String getMonth() {
        return month;
    }

    //
//    public void setMonth(String month) {
//        this.month = month;
//    }
//
    public String getDay() {
        return day;
    }
//
//    public void setDay(String day) {
//        this.day = day;
//    }
}
