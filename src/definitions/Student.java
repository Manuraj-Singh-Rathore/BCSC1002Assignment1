/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String[] nameOfStudentFormatFirstMiddleLast;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] nameOfBooksIssued;

    public Student(String nameOfTheStudent, long universityRollNumber, int numberOfBooksIssued) {
        this.nameOfStudentFormatFirstMiddleLast = nameOfTheStudent.split(" ");
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.nameOfBooksIssued = new Book[numberOfBooksIssued];
    }

    public String[] getNameOfStudentFormatFirstMiddleLast() {
        return nameOfStudentFormatFirstMiddleLast;
    }

    public void setNameOfStudentFormatFirstMiddleLast(String[] nameOfStudentFormatFirstMiddleLast) {
        this.nameOfStudentFormatFirstMiddleLast = nameOfStudentFormatFirstMiddleLast;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }
    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getNameOfBooksIssued() {
        return nameOfBooksIssued;
    }

    public void setNameOfBooksIssued(Book[] nameOfBooksIssued) {
        this.nameOfBooksIssued = nameOfBooksIssued;
    }

}
