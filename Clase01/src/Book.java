public class Book {
    String title;
    String author;
    int year;
    String gender;
    boolean isBusy;

    public Book(){
       title = "Unknown" ;
       author = "N/A";
       year = 0;
       gender = "";
       isBusy = false;
    }

    public Book(String tittle, String author, int year, String gender, boolean isBusy){
        this.title = tittle;
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isBusy = isBusy;
    }

    public Book(String title, String author, int year, String gender) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isBusy = false;
    }

    public void showInfo(){
        System.out.println("Tittle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Gender: " + gender);
        System.out.println("Is Busy: " + isBusy);
    }

    public void getBook(){
        if (!isBusy){
            isBusy = true;
            System.out.println("The book: " + title + " has been lent out");
        } else System.out.println("The book: " + title + " is already lent out");
    }

    public void returnBook(){
        if (isBusy){
            isBusy = false;
            System.out.println("The book: " + title + " has been returned");
        } else System.out.println("The book: " + title + " is available");
    }
}
