package C07ExceptionFileParsing.AuthorException;

// 서비스는 여기서 이루어진다.

import java.util.List;
import java.util.Scanner;

// AuthorRepository 생성
// service에서 Author 객체 생성하여 -> repository 호출하여 register 완료 (list에 담기)
// service 에서 throw new로 에러를 발생시키고 컨트롤러에서 try-catch 하는걸로
// (동일한 id,email 잇는경우,비밀번호가 5자리 이하인 경우 -> 서비스에서 예외 발생시키고 컨트롤러에서 try-catch
// 로그인 : email, password 입력받아 service의 login 메서드 호출 -> service에서 해당 email u
public class AuthorService {

    AuthorRepository authorRepository;

    AuthorService() {
        authorRepository = new AuthorRepository();
    }

//    public void check(String email, String password) {
//
//        for (int i = 0; i < authorRepository.authors.size(); i++) {
//
//            if ( email.equals(authorRepository.authors.get(i).getId())) {
//                System.out.println("비밀번호를 입력하세요");
//            } else{
//                System.out.println("아이디가 틀립니다.");
//            }
//
//            if ( password.equals(authorRepository.authors.get(i).getPassword())) {
//
//            }
//
//        }
//
//    }

    public void regsiter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입 입니다. 절차에 따르세요");
        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("이메일을 입력하세요");
        String email = sc.nextLine();
        System.out.println("password를 입력하세요");
        String password = sc.nextLine();

//        for (int i = 0; i < authorRepository.authors.size(); i++) {
//
//            if (email.equals(authorRepository.authors.get(i).getEmail())) {
//                System.out.println("이미 존재하는 이메일 입니다");
//            }
//        }

        Author author = new Author(name, email, password);
        authorRepository.add(author);

        System.out.println("회원 가입 완료");
    }

    public void login() {
//      해당하는 email이 있는지
//      그 e
        System.out.println("로그인 입니다. 절차에 따르세요");
        System.out.println("이메일 입력");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        System.out.println("비밀번호 입력");
        String password = sc.nextLine();

        for (int i = 0; i < authorRepository.authors.size(); i++) {
            if (email.equals(authorRepository.authors.get(i).getEmail()) && password.equals(authorRepository.authors.get(i).getPassword())) {
                System.out.println("로그인 성공");
                break;
            } else {
                System.out.println("아이디 혹은 비밀번호가 틀립니다. 다시 시도해주세요");
            }
        }
    }

//    public void login2(String email, String password) {
//
//        List<Author> = authorRepository.getAuthorList();
//
//        for (Author a : authorList) {
//            if (a.getEmail().equals(email) && a)
//        }
//    }

}
