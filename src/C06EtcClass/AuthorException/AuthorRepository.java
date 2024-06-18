package C06EtcClass.AuthorException;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {

    List<Author> authors;

    public void add(Author author) {

        authors = new ArrayList<>();
        authors.add(author);

    }

}
