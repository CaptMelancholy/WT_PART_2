package LABA_1.task12_16;

import LABA_1.task12_16.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testClone() {
        Book book = new Book("Hi", "John", 123, 1, "123");
        Book book1 = book.clone();
        assertTrue(book.equals(book1));
    }
}