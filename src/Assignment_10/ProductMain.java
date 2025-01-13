package Assignment_10;

public class ProductMain {
    public static void main(String[] args) {
        Product obj = new Product(101,"Laptop",10);
        obj.display();
        //Updating Quantity with Possitive number.

        System.out.println("\n Updating Quantity with Positive number.");
        obj.updateProduct(10);
        obj.updateProduct(20);
        obj.updateProduct(40);

        obj.display();

        // with negative numbers.
        System.out.println("\n Updating Quantity with negative numbers.");
        obj.updateProduct(-30);




    }
}
