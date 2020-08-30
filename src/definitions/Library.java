/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] allBooksCurrentlyAvailable;
    public Library() {
        this.allBooksCurrentlyAvailable = new Book[10];
        for (int index = 0; index < allBooksCurrentlyAvailable.length; index++) {
            allBooksCurrentlyAvailable[index] = new Book("Books" + (index + 1));
        }
    }

    public Library(Book[] allBooksCurrentlyAvailable) {
        this.allBooksCurrentlyAvailable = allBooksCurrentlyAvailable;
    }
    public Book[] getAllBooksCurrentlyAvailable() {
        return allBooksCurrentlyAvailable.clone();
    }

    public void setAllBooksCurrentlyAvailable(Book[] allBooksCurrentlyAvailable) {
        this.allBooksCurrentlyAvailable = allBooksCurrentlyAvailable;
    }
}
