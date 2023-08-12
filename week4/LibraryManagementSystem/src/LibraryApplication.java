import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

//It should create a library object, add books to the library,
//remove books to the library,
// check out books, return books,
// and display book details,
// display the list of available books,
// display the list of borrowed books.

public class LibraryApplication {
    //assume that I have only one Library through the whole App...
    static Library library = new Library("JobHacker-System-Library",2321);

    public static void main(String[] args) {
        startApp();
    }

    private static void startApp() {
        Random randomNumber = new Random();
        System.out.println("__________________________________________________________________________");
        System.out.println("Please Choose an Action:");
        System.out.println("- to exit App Type 0");
        System.out.println("-to Add User Type 1");
        System.out.println("-to Remove User Type 2");
        System.out.println("-to Add Book Type 3");
        System.out.println("-to Remove Book Type 4");
        System.out.println("-to Checkout a book Type 5");
        System.out.println("-to Return  a book Type 6");
        System.out.println("-to display the List of available books Type 7");
        System.out.println("-to Display the list of borrowed books Type 8");
        System.out.println("-to Display details of a specific book Type 9");

        Scanner sc =new Scanner(System.in);
        int action = sc.nextInt();
        sc.nextLine();

        switch (action) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Please enter username:");
                String userName = sc.nextLine();
                while(userName.equals("")){
                    System.out.println("Invalid username: please enter username:");
                    userName = sc.nextLine();
                }
                User newUser = new User(userName) ;
                library.addNewUser(newUser);
                System.out.println("your User Account Created with this id:"+newUser.getUserID());
                startApp();
                break;
            case 2:
                System.out.println("Please enter id:");
                String removedUserId = sc.nextLine();
                library.removeUser(removedUserId);
                System.out.println("User Removed Successfully");
                startApp();
                break;
            case 3:
                System.out.println("Please enter book Title");
                String title = sc.nextLine();
                System.out.println("Please enter book Author Name:");
                String authorName = sc.nextLine();
                System.out.println("Please enter book Version:");
                Double version = sc.nextDouble();
                while (version<0){
                    System.out.println("Invalid version, Please enter valid book version: ");
                    version = sc.nextDouble();
                }
                Book newBook = new Book(title , authorName,version) ;
                library.addBook(newBook);
                System.out.println("your Book Added with this id:"+newBook.getId());
                startApp();
                break;
            case 4:
                System.out.println("Please enter Book Id");
                String removedBookId = sc.nextLine();
                library.deleteBook(removedBookId);
                System.out.println("Book Removed Successfully");
                startApp();
                break;
            case 5:
                System.out.println("Please enter borrower ID");
                String borrowerId = sc.nextLine();
                User borrower = library.getUserById(borrowerId);
                System.out.println("Please enter Book ID");
                String borrowedBookId = sc.nextLine();
                Book borrowedBook = library.getBookById(borrowedBookId);
                library.checkoutBook(borrower,borrowedBook);
                System.out.println("User: "+borrower.getUserName()+" checkout this Book: "+borrowedBook.getTitle());
                startApp();
                break;
            case 6:
                System.out.println("Please enter borrower ID");
                String return_user_Id = sc.nextLine();
                User return_user = library.getUserById(return_user_Id);
                System.out.println("Please enter Book ID");
                String returned_book_id = sc.nextLine();
                Book returned_book = library.getBookById(returned_book_id);
                library.returnBook(return_user,returned_book);
                System.out.println("User: "+return_user.getUserName()+" Returned this Book: "+returned_book.getTitle());
                startApp();
                break;
            case 7:
                ArrayList<Book> availableBooks = library.displayAvailableBooks();
                if(availableBooks.isEmpty()){
                    System.out.println("No Books available,Please Add/Return some books");
                }else {
                    System.out.println("List of Available Books:");
                    for (Book book : availableBooks) {
                        System.out.println(book.getDetails());
                    }
                }
                startApp();
                break;
            case 8:
                System.out.println("List of Borrowed Books:");
                ArrayList<Book> borrowedBooks = library.displayBorrowedBooks();

                startApp();
                break;
            case 9:
                System.out.println("Please enter Book Id");
                String DetailedBookId = sc.nextLine();
                String details = library.getBookDetails(DetailedBookId);
                System.out.println("Book Details : "+details);
                startApp();
                break;

        }
    }
}
