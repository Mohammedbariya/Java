import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class library{
    ArrayList<String>  books = new ArrayList<String>();
    ArrayList<String>issued_book = new ArrayList<String>();

    public library(){
        books.add("None");
    }
    public boolean find_books(String bookname) {
        boolean bookfind = false;
        for (String book : books) {
            if (Objects.equals(book, bookname)) {
                bookfind = true;
                break;
            }
        }
        return bookfind;
    }

    public boolean find_issued_book(String bookname){
            boolean issuebook = false;
            for (String book: issued_book){
                if(Objects.equals(book, bookname)){
                    issuebook = true;
                    break;
                }
            }
            return issuebook;
    }

    public void add_book(){
        Scanner b = new Scanner(System.in);
        System.out.println("Enter the book name you want to add: ");
        String book_name = b.nextLine();
        books.add(book_name);
        System.out.println("Book added");
        books.remove("None");

    }

    public void issue_book(){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter book name you want to issue:");
        String book_issue = c.next();
        boolean tr = find_books(book_issue);
        if(tr){
            System.out.println("Book issued");
            books.remove(book_issue);
            issued_book.add(book_issue);
        }
        else{
            System.out.println("Book is not available");
        }
    }




    public void return_book(){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter return book name:");
        String book_return = r.nextLine();
        boolean rt = find_issued_book(book_return);
        if(rt){
            System.out.println("Book returned");
            books.add(book_return);
            issued_book.remove(book_return);
        }
        else{
            System.out.println("This book is not in the list of issued books");
        }
    }
    public void available_books(){
        if(books.get(0)=="None"){
            System.out.println("No books are available");
        }
        else{
            for(String book:books){
                System.out.print(book);
                System.out.print(",");
            }
        }

    }

    public void given_books(){
        for(String book : issued_book){
            System.out.print(book);
            System.out.print(",");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("########### WELCOME TO THE CENTRAL LIBRARY MANAGEMENT SYSTEM ###############");

        library central = new library();
        Boolean on = true;
        while(on) {
            System.out.println("\nPlease enter one option from below (Enter number of that option)");
            System.out.println("1. Show Available books ");
            System.out.println("2. ADD NEW BOOK ");
            System.out.println("3. ISSUE A BOOK ");
            System.out.println("4. RETURN A BOOK ");
            System.out.println("5. SHOW ISSUED BOOKS ");
            System.out.println("6. EXIT THE MANAGEMENT SYSTEM");
            System.out.println("Enter your option: ");
            int user_option = sc.nextInt();

            if (user_option == 1) {
                central.available_books();
            }
            else if (user_option == 2) {
                central.add_book();
            }
            else if (user_option == 3) {
                central.issue_book();
            } else if (user_option == 4) {
                central.return_book();
            } else if (user_option == 5) {
                central.given_books();
            } else if (user_option == 6) {
                System.out.println("Thanks for using this system");
                on = false;
            }
            else{
                System.out.println("Invalid choice");
            }

        }

    }
}