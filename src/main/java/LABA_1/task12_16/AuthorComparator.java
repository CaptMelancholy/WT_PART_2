package LABA_1.task12_16;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getAuthor().compareTo(o2.getAuthor());
        return result;
    }
}
