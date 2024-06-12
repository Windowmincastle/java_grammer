package C02ClassBasic;

public class C0205Construct {

    public static void main(String[] args) {

        Calendar cal = new Calendar();

        cal.setYear("2024");
        cal.setMonth("06");
        cal.setDay("12");

        System.out.println(cal.getYear()+cal.getMonth()+cal.getDay());

    }

}

class Calendar{

    String year;
    String month;
    String day;


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
