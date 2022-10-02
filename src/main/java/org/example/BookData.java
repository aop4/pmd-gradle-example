package org.example;

/**
 * A basic model representing a book.
 */
public class BookData {
    /**
     * The book's title.
     */
    private final String title;
    /**
     * The book's author.
     */
    private final String author;

    /**
     * Constructor.
     */
    public BookData(final String title, final String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * @return a String representation of this book.
     */
    @Override
    public String toString() {
        return String.format("\"%s\" by %s", this.title, this.author);
    }
}