package Assignment_10;

public class Product {
    private int prodId;
    private String prodName;
    private int quantity;

    public Product(int prodId, String prodName, int quantity) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.quantity = quantity;
    }

    public void updateProduct(int changequantity){
        try{
            if(changequantity < 0){
                throw new IllegalArgumentException("Quantity cannot be negative.");
            }else{
                quantity+=changequantity;
                System.out.println(changequantity+" Quatity Update Sucessfully.");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Exception Is Happened becouse :- "+e.getMessage());
        }
    }

    public void display(){
        System.out.println("\n*** Details Of Product ***");
        System.out.println("Product Id :- "+prodId);
        System.out.println("Product Name :- "+prodName);
        System.out.println("Product Quantity :- "+quantity);
    }
}
