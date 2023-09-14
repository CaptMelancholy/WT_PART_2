package LABA_1.task12_16;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
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
        for(Book bookSort : arrayList)
        {
            System.out.println(bookSort.toString());
        }

    }
}
