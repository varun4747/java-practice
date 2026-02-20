package JavaWorks;

abstract class Product {

    private int productid;
    private String productName;
    private int productPrice;
    

    public Product(int productid, String productName, int productPrice) {
        this.productid = productid;
        this.productName = productName;
        this.productPrice = productPrice;
       
    }

    public abstract double calculateDiscount();


    public double getTotalProductPrice() {
        return productPrice-calculateDiscount();
    }
    public void display() {
        System.out.println(productName + " - ₹" + getTotalProductPrice());
    }
}