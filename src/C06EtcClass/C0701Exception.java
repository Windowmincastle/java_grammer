package C06EtcClass;

import java.sql.SQLException;
import java.util.Scanner;

public class C0701Exception {
//    unchecked 예외 발생시 스프링에서 트랜잭션 롤백이 발생한다
//    unchecked exception : 프로그램 이슈, 로직 이슈 롤백을 강제하고 잇지는 않다?
//    try-catch


//    예외처리는 꼭 아셔야 한다.
    public static void main(String[] args) {
//          사용자에게 적절한
//        System.out.println("나눈 결과값은 ->" + (head/tail));
//        에러와 예외 구분
//        예외가 발생할 것으로 예상되는 코드에 try로 감싸고
//        예외가 발생했을 때 대응하는 코드를 catch에 작성한다.
//        try-catch 구문을 사용한다.

//        java 프로그램 -> DB update,insert 일련의 작업 -> 예외발생시 -> 롤백
//        어떤 상황 발생시 throw new -> 롤백
//        강제로 예외를 발생시켜서 사용자에게 적절한 문구를 던져주는 것 이 중요하다.

//        checked exception : 예외처리 강제 -> 예시)외부시스템 통신 -> 예외처리 강제 -> 예외처리를 하든 -> throws를 하든
//        unchecked exception : 예외처리 선택 -> 그외 -> 예외처리 선택 -> thorws 선택

        try {
            System.out.println("나눗셈 프로그램 입니다");
            Scanner sc = new Scanner(System.in);
            System.out.println("분자를 입력해주세요");
            int head = Integer.parseInt(sc.nextLine());
            System.out.println("분자를 입력해주세요");
            int tail = Integer.parseInt(sc.nextLine());
            int result = head / tail; //이 라인에서 프로그램이 강제 종료가 된다.
            System.out.println("나눈 결과값은" + result); // 이 라인은 실행이 되지 않는다.
//        예외는 catch 구문으로 순차적 검사. Exception에 모든 구문을 검사해버리기 때문에
//        catch문 상단에 Exception을 넣는 것은 맞지 않다.
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누시면 안됩니다.");
            e.printStackTrace(); // 시스템 차원에서 예외가 발생된 내역을 로그를 남기기 위해서
            System.out.println(e.getMessage()); //
        } catch (NumberFormatException e) {
            System.out.println("숫자에 맞는 값을 입력해주세요");
            e.printStackTrace(); // 시스템 차원에서 예외가 발생된 내역을 로그를 남기기 위해서

        } catch (Exception e) { //모든 예외의 조상 클래스 Exception e
            System.out.println("예외가 발생했습니다.");
            e.printStackTrace(); // 시스템 차원에서 예외가 발생된 내역을 로그를 남기기 위해서
        } finally {
            System.out.println("무조건 실행되는 구문 입니다.");
        }
        System.out.println("감사합니다.");

//        throws : 예외처리 위임을 명시한다.

        login("1234");
        login2("1234");

        try {
            login3("1234");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
// unchecked (예외처리선택) , checked (예외처리 필수)
// 필수인 경우는 당연히 try,catch
//    필수가 아닌 경우에는 try,catch 옵션
//    위임한다->그럼에도 불구하고 붙인다.
//    unchecked 예외에서는 throws 키워드가 예외사항을 명시하는 용도로만 사용된다.

//    여러 개의 예외가 있으면 throws를 적고 콤마 찍고 나열해라
    static void login(String password) throws IllegalArgumentException , RuntimeException{

        if (password.length() < 10) {
//            예외를 강제로 발생시킨다. throw new 중요하다
//            예외는 기본적으로 메서드를 호출한쪽에 전파
//            unchecked 예외는 예외처리가 강제되지 않음
//
            throw new IllegalArgumentException("비밀번호가 너무 짧아");

        }

        if (password.contains("*")) {
            throw new RuntimeException("예외 발생");
        }
    }

    static void login2(String password) throws IllegalArgumentException {
//  방법1 try-catch로 직접 예외를 처리한다
//        checked : 다른 시스템과의 네트워크 - 대표적으로 DB 조회
//        unchecked : 프로그램 자체의 이슈
        try {
            if (password.length() < 10) {
                throw new SQLException("DB 조회 상황에서 예외가 생김");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void login3(String password) throws SQLException {
// 방법2 메서드를 호출한쪽에 위임 : throws
            if (password.length() < 10) {
                throw new SQLException("DB 조회 상황에서 예외가 생김");
            }
    }
}
