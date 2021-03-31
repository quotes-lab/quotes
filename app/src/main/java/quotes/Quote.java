package quotes;

import java.util.ArrayList;
import java.util.List;

public class Quote {
      List<String> tags;
      String author;
      String likes;
      String text;

    public Quote(List<String> tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "tags=" + tags +
                ", author='" + author + '\'' +
                ", likes=" + likes +
                ", text='" + text + '\'' +
                '}';
    }
}
