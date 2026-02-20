package JavaWorks;

interface Payment {
    void pay(double amount);
}

public class AllPayments implements Payment {
    
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }

}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}