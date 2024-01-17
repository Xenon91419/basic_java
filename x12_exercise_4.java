class Library{
    int no_of_books = 0;
    String[] books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    public void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added");
    }
    public void showAvailableBook(){
        System.out.println("Available books are :");
        for (String book: this.books) {
            if(book == null) {
                continue;
            }
            System.out.println("* " +book);

        }
    }
    public void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("the book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("this book does not exist");
    }
    public void returnBook(String book){
        addBook(book);
    }
}
public class x12_exercise_4 {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("think and grow");
        centralLibrary.addBook("algorithms");
        centralLibrary.addBook("rich dad poor dad");
        centralLibrary.showAvailableBook();
        centralLibrary.issueBook("rich dad poor dad");
        centralLibrary.showAvailableBook();
    }
}
