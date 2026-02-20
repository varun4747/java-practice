package JavaWorks;
import java.util.ArrayList;

class Cart {
    private ArrayList<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
        System.out.println("Product added to cart.");
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : items) {
            total += p.getTotalProductPrice();
        }
        return total;
    }

    public void showCart() {
        for (Product p : items) {
            p.display();
        }
    }
}