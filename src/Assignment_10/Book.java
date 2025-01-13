package Assignment_10;

public class Book {
    private int bookId;
    private String title;
    private boolean isAvailable;

    public Book(int bookId, String title, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public void rentBook(){
        try{
            if(!isAvailable){
                throw new IllegalArgumentException("Book is Not Available.");
            }else {
                isAvailable = false;
                System.out.println("You have Successfully rented Book.");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Exception Occur :- "+e.getMessage());
        }
    }
    public void returnbook(){
        isAvailable = true;
        System.out.println("You have Successfully return the book.");
    }
}