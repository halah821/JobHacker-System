//Library class which represents a library and contains the following attributes:
// library name, library code, and a list of books.

import java.util.ArrayList;

public class Library {
    private String library_name;
    private Integer library_code;
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library(String library_name, Integer library_code) {
        this.library_name = library_name;
        this.library_code = library_code;
        books = new ArrayList<Book>();
        users = new ArrayList<User>();
    }

    //Adds a new User to the Library list of Users
    public void addNewUser(User user){
        users.add(user);
    }

    //remove user using his Id
    public void removeUser(String id) {
        User user = getUserById(id);
        if(user!=null){
            users.remove(user);
        }else {
            System.out.println("Error:Invalid User Id");
            System.exit(0);
        }
    }

    //get specific user using his id
    public User getUserById(String userId){
        for (User user:users){
            if (user.getUserID().equals(userId))
                return user;
        }
        return null;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public  void deleteBook(String bookId){
        Book book = getBookById(bookId);
        if (book!=null){
        books.remove(book);
        }else {
            System.out.println("Error: Invalid Book Id");
            System.exit(0);
        }
    }

    //user borrow A book
    public void checkoutBook(User user, Book book){
        if(book !=null && book.getAvailable() && user!=null) {
            user.checkoutBook(book);
        }
        else{
            System.out.println("Error: Book Not Available OR Invalid Book Id OR Invalid User Id");
           System.exit(0);
        }
    }

    //user return borrowed book
    public void returnBook(User user, Book book ){
        if(book !=null && !book.getAvailable() && user!=null) {
            user.returnBook(book);
        }
        else {
            System.out.println("Error: Book Already Available OR Invalid Book Id OR Invalid User Id");
            System.exit(0);
        }
    }

    //display all details of specific book by Id
    public String getBookDetails(String bookId) {
        Book book = getBookById(bookId);
        if(book ==null){
            System.out.println("Error: invalid Book Id");
            System.exit(0);
        }
        return book.getDetails();
    }

    //return specific book based on its Id.
    public Book getBookById(String id){
        for (Book book: books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    //return a list of All the avaliable books in the library
    public ArrayList<Book> displayAvailableBooks(){
        ArrayList<Book> availableBooks = new ArrayList<Book>();
        for (Book book:books){
            if (book.getAvailable() == true)
                availableBooks.add(book);
        }
        return availableBooks;
    }

    //return a list of All the borrowed books in the library
    public  ArrayList<Book> displayBorrowedBooks(){
        ArrayList<Book> borrowedBooks = new ArrayList<Book>();
        for (Book book:books){
            if (book.getAvailable() != true)
                borrowedBooks.add(book);
        }
        return borrowedBooks;
    }

    //to get a list of borrowed books by specific user using his Id
   /* public ArrayList<Book> getBorrowedBooksByUser(String userId){
        ArrayList<Book> borrowedBooksByUser = new ArrayList<Book>();
        ArrayList<CheckoutBook> checkouts = new ArrayList<CheckoutBook>();
        User user = getUserById(userId);
        if ( user !=null){
            checkouts = user.getCheckouts();
            for (CheckoutBook checkout : checkouts){
                for (Book book : books){
                    if (book.getId().equals(checkout.BorrowedBookId)){
                        borrowedBooksByUser.add(book);
                    }
                }
            }
        }
        return borrowedBooksByUser;
    }*/
}
