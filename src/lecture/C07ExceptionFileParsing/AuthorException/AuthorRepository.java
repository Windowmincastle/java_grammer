package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {

    List<Author> authors;

    public void add(Author author) {
        authors = new ArrayList<>();
        authors.add(author);
    }

//    Repository에서 private으로 했다면 여기서 이메일 비밀번호를 검증해서 가져다 줘야한다.



}
