import java.util.UUID;

public class CheckoutBook {

    String BorrowerId;
    String BorrowedBookId;
    String checkoutId;
    Boolean isReturned=true;

    public CheckoutBook(User borrower, Book borrowedBook) {
        this.BorrowerId = borrower.getUserID();
        this.BorrowedBookId = borrowedBook.getId();
        borrowedBook.setAvailable(false);
        this.isReturned = false;
        if (checkoutId==null){
            setCheckoutId();
        }
    }

    public Boolean getIsReturned() {
        return isReturned;
    }

    public void setIsReturned(Boolean returned) {
        this.isReturned = returned;
    }

    public void setCheckoutId() {
        this.checkoutId = UUID.randomUUID().toString();
    }

    public void setBorrowerId(String borrowerId) {
        BorrowerId = borrowerId;
    }

    public void setBorrowedBookId(String borrowedBookId) {
        BorrowedBookId = borrowedBookId;
    }

    public String getCheckoutId() {
        return checkoutId;
    }

    public String getBorrowerId() {
        return BorrowerId;
    }

    public String getBorrowedBookId() {
        return BorrowedBookId;
    }

    public void returnBook(Book borrowedBook){
        borrowedBook.setAvailable(true);
        this.setIsReturned(true);
    }

}
