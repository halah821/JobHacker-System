//User class which represents a library user and contains the following attributes:
//user name, user ID, and a list of borrowed books.

import java.util.ArrayList;
import java.util.Random;

public class User {
    private String userName;
    private String  userID;
    private ArrayList<CheckoutBook> checkouts;

    public User(String userName) {
        this.userName = userName;

        Random randomNumber = new Random();
        Integer random =randomNumber.nextInt(1000);
        this.userID = random.toString();

        checkouts = new ArrayList<CheckoutBook>();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserID() {
        return userID;
    }

    public void checkoutBook(Book book){
        CheckoutBook checkoutBook = new CheckoutBook(this, book);
        checkouts.add(checkoutBook);
    }
    public void returnBook(Book book){
        for (CheckoutBook checkoutBook:checkouts){
            if(checkoutBook.BorrowedBookId.equals(book.getId())){
                checkoutBook.returnBook(book);
            }

        }


    }

    public ArrayList<CheckoutBook> getCheckouts(){
        return this.checkouts;
    }
}
