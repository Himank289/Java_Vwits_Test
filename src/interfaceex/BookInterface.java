package interfaceex;


//Managing bookinterface
interface BookManager {
 void addBook(String title, String author);
 void removeBook(String title);
 static int getTotalBooks() {
     //static method to return count of number of books
     return 3;
 }
 
 default void add(String item) {
     addBook(item, ""); // default method
 }
}

//Interface for managing users
interface UserManager {
 void addUser(String username);
 default void welcomeUser(String username) {
     System.out.println("Welcome, " + username + "!");
 }
 
 default void add(String item) {
     addUser(item); // default method
 }
}

//Implementation of Library 
class Library implements BookManager, UserManager {

 //overriding bookmanager methods
 @Override
 public void addBook(String title, String author) {
     System.out.println("Adding book: " + title + " by " + author);
 }

 @Override
 public void removeBook(String title) {
     System.out.println("Removing book: " + title);
 }

 // Overriding user manager methods
 @Override
 public void addUser(String username) {
     System.out.println("Adding user: " + username);
 }



//  Resolve the conflict by providing an implementation for the add method
 @Override
 public void add(String item) {
     BookManager.super.add(item);
}
}



