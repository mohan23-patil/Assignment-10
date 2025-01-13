package Assignment_10;

public class Bookmain {
    public static void main(String[] args) {
        Book obj = new Book(101,"Rich Dad And Poor Dad",true);
        Book obj2 = new Book(2, "1984",false);

        obj.rentBook();// book is available.
        obj.rentBook();// exception throw book not available.

        // After return the book.
        obj.returnbook();
        obj.rentBook();
        obj2.rentBook();//exception happen becouse we set value book is not available.


    }
}
