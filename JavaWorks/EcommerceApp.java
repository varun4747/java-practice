package JavaWorks;

import java.util.*;

public class EcommerceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Electronics(1,"Laptop", 60000));
        products.add(new Cloths(2,"T-Shirt", 1000));

        Cart cart = new Cart();

        while (true) {
            System.out.println("\n1. View Products");
            // System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (Product p : products) {
                        p.display();
                    }
                    break;

                // case 2:
                //     System.out.println("Enter Product ID:");
                //     int id = sc.nextInt();

                //     for (Product p : products) {
                //         if (p.getId() == id) {
                //             cart.addProduct(p);
                //         }
                //     }
                //     break;

                case 2:
                    cart.showCart();
                    break;

                case 3:
                    double total = cart.calculateTotal();
                    System.out.println("Total Amount: ₹" + total);

                    Payment payment = new UpiPayment();
                    payment.pay(total);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
