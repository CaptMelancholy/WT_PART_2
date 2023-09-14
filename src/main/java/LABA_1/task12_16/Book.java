package LABA_1.task12_16;

public class Book implements Cloneable, Comparable{
    private String title;
    private String author;
    private int price;
    private static int edition;

    private String isbn;

    public Book(String title, String author, int price, int edition, String isbn) {
        this.setAuthor(author);
        this.setPrice(price);
        this.setTitle(title);
        setEdition(edition);
        setIsbn(isbn);
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass())
        {
            return false;
        }

        Book book = (Book) o;

        if(!getAuthor().equals(book.getAuthor()))
        {
            return false;
        }
        if(!getTitle().equals(book.getTitle()))
        {
            return false;
        }
        if(book.getEdition() != getEdition()) {
            return false;
        }
        if(book.getPrice() != getPrice())
        {
            return false;
        }
        return getIsbn().equals(book.getIsbn());
    }

    public int hashCode() {
        int result = getTitle() == null ? 0 : getTitle().hashCode();
        result += getAuthor() == null ? 0 : getAuthor().hashCode();
        result += getEdition();
        result += getPrice();
        result += getIsbn() == null ? 0 : getIsbn().hashCode();
        return result;
    }

    public String toString() {
        return "Book {" + "title=" + title + ", author=" + author + ", price=" + price + ", edition=" + edition + ", isbn=" + isbn + " }";
    }

    @Override
    public Book clone() {
        return new Book(this.getTitle(), this.getAuthor(), this.getPrice(), this.getEdition(), this.getIsbn());
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        return getIsbn().compareTo(book.getIsbn());
    }
}
