package LABA_1.task12_16;

public class ProgrammerBook extends Book{

    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition, String isbn, String language, int level) {
        super(title, author, price, edition, isbn);
        this.setLanguage(language);
        this.setLevel(level);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        ProgrammerBook programmerBook = (ProgrammerBook) o;
        return super.equals(o) && programmerBook.getLanguage().equals(getLanguage()) && (programmerBook.getLevel() == getLevel());
    }

    @Override
    public int hashCode() {
        int result = 0;
        result += super.hashCode();
        result += getLevel();
        result += getLanguage() == null ? 0 : getLanguage().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProgrammer Book {" + "Language=" + language + " , level=" + level + "}";
    }
}
