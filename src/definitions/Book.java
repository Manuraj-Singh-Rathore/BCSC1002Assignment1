/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String thirteenDigitISBNNumber;


    public Book(String bookName, String authorName, String thirteenDigitISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.thirteenDigitISBNNumber = thirteenDigitISBNNumber;
    }
    public Book() {

    }

    public Book(String bookName) {
        this.bookName = "One Indian Girl";
        this.authorName = " Chetan Bhagat .";
        this.thirteenDigitISBNNumber = "1548965239575";
    }
    public String getBookName() {

        return bookName;
    }

    public void setBookName(String bookName) {

        this.bookName = bookName;
    }
    public String getAuthorName() {

        return authorName;
    }

    public void setAuthorName(String authorName) {

        this.authorName = authorName;
    }
    public String getThirteenDigitISBNNumber() {

        return thirteenDigitISBNNumber;
    }

    public void setThirteenDigitISBNNumber(String thirteenDigitISBNNumber) {

        this.thirteenDigitISBNNumber = thirteenDigitISBNNumber;
    }
    @Override
    public String toString() {
        return String.format("bookName :%s , AuthorName: %s , bookISBNNumber : %s ", getBookName(), getAuthorName(), getThirteenDigitISBNNumber()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getThirteenDigitISBNNumber(), book.getThirteenDigitISBNNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getThirteenDigitISBNNumber());
    }
}