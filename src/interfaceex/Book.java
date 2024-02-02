package interfaceex;


public class Book {
 public static void main(String[] args) {
//     Library library = new Library();

     // Adding books and users
//     library.addBook("OOPS", "BalaSwamy");
//     library.addBook("JavaSE 8", "Kathy");
//     library.addUser("Shivam");
//     library.removeBook("OOPS");
	 
	 
	 // Using the static method to get total books
     System.out.println("Total books in the library: " + BookManager.getTotalBooks());

     // Using the default method to welcome a user
     UserManager user = new Library();
     user.welcomeUser("Shiv");
	
	 BookManager b;
	 b=new Library();
	 b.addBook("SPOS", "Tushar");
	 b.addBook("COOA", "Rashi");
	 b.removeBook("SPOS");
     	
 }
 
 
 

 static void func(BookManager b,String tit,String auth)
{
	b.addBook(tit,auth);
	b.addBook(tit,auth);
	b.removeBook(tit);
	
}
}