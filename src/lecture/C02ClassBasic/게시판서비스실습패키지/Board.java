package lecture.C02ClassBasic.게시판서비스실습패키지;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {

    private Long static_id = 0L;
    private Long postId = 0L;
    static List<Board> boards = new ArrayList<>();
    String title;
    String contents;

    Board() {

    }

    Board(String inputTitle,String inputContent) {

        this.title = inputTitle;
        this.contents = inputContent;

    }

    public void postWrite() {
        static_id += 1;
        postId = static_id;

        System.out.println("제목을 입력하세요");
        Scanner sc = new Scanner(System.in);
        this.title = sc.nextLine();
        System.out.println("내용을 입력하세요");
        this.contents = sc.nextLine();
        System.out.println("작성 완료");
    }

    public void postSearch() {

        for (int i = 0; i < boards.size(); ) {
            System.out.println("제목:"+boards.get(i).getTitle()+"/ 내용:"+boards.get(i).getContents());
        }
    }

    public void postDeepSearch(String inputtitle) {
// 게시글 상세 조회
        for (int i = 0; i < boards.size(); i++) {

            if (boards.get(i).getTitle().equals(inputtitle)) {

                System.out.println("작성자:"+boards.get(i).getId());
                System.out.println("제목 :"+boards.get(i).getTitle());
                System.out.println("내용 :"+boards.get(i).getContents());
                break;
            }

        }

    }

    public Long getId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

}
