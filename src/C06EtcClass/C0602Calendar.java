package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C0602Calendar {

    public static void main(String[] args) {

//      "2024 06 18"
//       1달 더하고 싶은데,

        /*
java.util.* : Calander 클래스
java.time.* : LocalDateTime클랫 => 거의 표준이다. 싱크가 맞다 => db의 datetime이랑

KST 한국 시각
UTC 세계 표준 시간 -> 전산 시스템은 UTC를 기준으로 설계가 되어있다. 그래서 우리가
어쩔때는 KST로 알아서 변환해주고
         */
        Calendar cal = Calendar.getInstance(); // 캘린더 클래스 생성.
        System.out.println(cal.getTime() + " 캘린더갯타임");

        System.out.println(cal.get(cal.YEAR));
        System.out.println(cal.get(cal.MONTH)+1); // 문제가 있다 0부터 시작하는 것 같다.
        System.out.println(cal.get(cal.DAY_OF_MONTH));
        System.out.println(cal.get(cal.DAY_OF_WEEK));
        System.out.println(cal.get(cal.HOUR_OF_DAY));
        System.out.println(cal.get(cal.MINUTE));
        System.out.println(cal.get(cal.SECOND));
//        전반적으로 잘 쓰지 않는다.

//        java.time패키지 : Local~ 클래스가 있다.
//        날짜(LocalDate)-date타입,시간(LocalTime),날짜와 시간(LocalDateTime)-datetime타입

        LocalDate presentDate = LocalDate.now();
        System.out.println(presentDate);
        System.out.println(presentDate.getYear());
        System.out.println(presentDate.getMonth());
        System.out.println(presentDate.getDayOfMonth());
        System.out.println(presentDate.getDayOfWeek());

        LocalTime presentTime = LocalTime.now();
        System.out.println(presentTime);
        System.out.println(presentTime.getHour());
        System.out.println(presentTime.getMinute());
        System.out.println(presentTime.getSecond());

//        시간 자동 세팅을 프로그램에서 하는 것을 추천한다. Spring과 JPA의 사상이다.
//        db컨트롤을 프로그램이 하겠다. 이게 큰 축의 사상이다.
//        정답은 LocalDateTime이다.
        LocalDateTime presentDateTime = LocalDateTime.now();
        System.out.println(presentDateTime);
        System.out.println(presentDateTime.getYear());
        System.out.println(presentDateTime.getHour());

//        임의로 특정 시간을 만들어 내고 싶을 떄 : 출생시각, 생일 시각 등등
//        of메서드를 사용한다.

        LocalDate birthDay = LocalDate.of(2000, 11, 20);
        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getMonth());
        System.out.println(birthDay.getDayOfMonth());

        LocalTime birthTime = LocalTime.of(20, 20, 20);

        LocalDateTime birthDayTime = LocalDateTime.of(2000,11,20,20,20);
//        크로노필드 enum 타입을 사용하여 프로그램의 유연성을 향상 시킬 수 있다.
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(birthDayTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println(birthDayTime.get(ChronoField.HOUR_OF_DAY));
//        0: 오전 1: 오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));
        myWatch(LocalDateTime.now(),ChronoField.YEAR);
        myWatch(LocalDateTime.now(),ChronoField.AMPM_OF_DAY);
        myWatch(LocalDateTime.now(),ChronoField.MONTH_OF_YEAR);

    }

    static void myWatch(LocalDateTime localDateTime, ChronoField c) {

        if ( c == ChronoField.YEAR) {
            System.out.println("연도는"+ localDateTime.get(c) + " 입니다 ");
        } else if ( c == ChronoField.MONTH_OF_YEAR) {
            System.out.println("월은"+ localDateTime.get(c)+" 입니다");
        } else if (c == ChronoField.AMPM_OF_DAY) {
            if (localDateTime.get(c) == 0) {
                System.out.println("오전 입니다.");
            } else {
                System.out.println("오후 입니다.");
            }
        }

    }
}
