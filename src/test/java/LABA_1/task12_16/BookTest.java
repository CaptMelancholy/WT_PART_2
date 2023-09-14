package LABA_1.task12_16;

import LABA_1.task12_16.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testClone() {
        Book book = new Book("Hi", "John", 123, 1, "123");
        Book book1 = book.clone();
        assertTrue(book.equals(book1));
    }

    @Test
    void testSort() {
        Book book = new Book("Hi", "John", 123, 1, "900-123");
        Book book2 = new Book("Hello", "Jake", 213, 1, "901-123");
        Book book3 = new Book("What", "Brand", 321, 1, "800-123");
        Book book4 = new Book("Why", "Mike", 312, 1, "312-123");
        ArrayList<Book> arrayList = new ArrayList<>();
        arrayList.add(book);
        arrayList.add(book2);
        arrayList.add(book3);
        arrayList.add(book4);
        Collections.sort(arrayList);
        ArrayList<Book> arrayListSorted = new ArrayList<>();
        arrayListSorted.add(book4);
        arrayListSorted.add(book3);
        arrayListSorted.add(book);
        arrayListSorted.add(book2);
        assertEquals(arrayList, arrayListSorted);
    }

    @Test
    void testComparators() {
        Book book = new Book("Q", "W", 123, 1, "900-123");
        Book book2 = new Book("O", "W", 213, 1, "901-123");
        Book book3 = new Book("M", "Z", 321, 1, "800-123");
        Book book4 = new Book("P", "Y", 312, 1, "312-123");
        ArrayList<Book> testBooks1 = new ArrayList<>();
        testBooks1.add(book);
        testBooks1.add(book2);
        testBooks1.add(book3);
        testBooks1.add(book4);
        ArrayList<Book> testBooks2 = (ArrayList<Book>) testBooks1.clone();
        ArrayList<Book> testBooks3 = (ArrayList<Book>) testBooks1.clone();
        ArrayList<Book> testBooksAuthor = new ArrayList<>();
        testBooksAuthor.add(book);
        testBooksAuthor.add(book2);
        testBooksAuthor.add(book4);
        testBooksAuthor.add(book3);
        ArrayList<Book> testBooksTitleAuthor = new ArrayList<>();
        testBooksTitleAuthor.add(book3);
        testBooksTitleAuthor.add(book2);
        testBooksTitleAuthor.add(book4);
        testBooksTitleAuthor.add(book);
        ArrayList<Book> testBooksAuthorTitlePrice = new ArrayList<>();
        testBooksAuthorTitlePrice.add(book2);
        testBooksAuthorTitlePrice.add(book);
        testBooksAuthorTitlePrice.add(book4);
        testBooksAuthorTitlePrice.add(book3);
        Collections.sort(testBooks1, new AuthorComparator());
        Collections.sort(testBooks2, new TitleAuthorComparator());
        Collections.sort(testBooks3, new AuthorTitlePriceComparator());
        assertEquals(testBooks1, testBooksAuthor);
        assertEquals(testBooks2, testBooksTitleAuthor);
        assertEquals(testBooks3, testBooksAuthorTitlePrice);
    }
}