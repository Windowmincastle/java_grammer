//package C02ClassBasic.게시판서비스실습강사님코드;
//
//import C02ClassBasic.게시판서비스실습패키지.Board;
//import C02ClassBasic.게시판서비스실습패키지.Member;
//
//import static C02ClassBasic.게시판서비스실습패키지.Member.members;
//
//public class PostService {
//
//    public static void main(String[] args) {
//
//        while (true) {
//
//            System.out.println("서비스 번호를 입력하세요");
//            System.out.println("[1] 회원가입 ,[2] 회원 전체 목록조회 ,[3] 회원 상세 조회");
//            System.out.println("[4] 게시글작성 , [5] 게시글 상세 조회  ,[6] 게시글 목록 조회");
//            System.out.println("[7] 서비스 중단");
//
//            int choice = sc.nextInt();
//            sc.nextLine();
//
//            if (choice == 1) {
//
//                System.out.println("회원 가입 서비스 입니다.");
//                System.out.println("이름을 입력해주세요");
//                String name = sc.nextLine();
//                System.out.println("이메일을 입력해주세요");
//                String email = sc.nextLine();
//
//                Member member = new Member(name, email);
//                members.add(member);
//
//            } else if (choice == 2) {
//// 회원 전체 조회
//                System.out.println("회원 전체 조회 시작");
//                Member member = new Member();
//                member.MemberTotalInquiry();
//
//            } else if (choice == 3) {
//                System.out.println("회원 정보 상세 조회를 선택했습니다. email을 입력하세요");
//                String email = sc.nextLine();
//                Member member = new Member();
//                member.SingleInquiry(email);
//            } else if (choice == 4) {
//                System.out.println("게시글 작성을 시작합니다.");
//                Board board = new Board();
//                board.postWrite();
//            } else if (choice == 5) {
//                System.out.println("게시글 상세 조회를 시작합니다");
//                System.out.println("제목을 입력하세요");
//
//                String inputTitle = sc.nextLine();
//                Board board = new Board();
//                board.postDeepSearch(inputTitle);
//
//            } else if (choice == 6) {
//                System.out.println("게시글 목록 조회를 시작합니다");
//                Board board = new Board();
//                board.postSearch();
//            } else if (choice == 7) {
//                System.out.println("서비스를 중단합니다. 감사합니다");
//                break;
//            }
//        }
//
//    }
//
//}
//
//class Author {
//
//}
//
//class Post{
//
//}