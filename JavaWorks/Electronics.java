package JavaWorks;

class Electronics extends Product {

    public Electronics(int productid, String productName, int productPrice) {
        super(productid, productName, productPrice);
    }

    @Override
    public double calculateDiscount() {
        return getTotalProductPrice() * 0.1; 
    }
}

class Cloths extends Product {

    public Cloths(int productid, String productName, int productPrice) {
        super(productid, productName, productPrice);
    }

    @Override
    public double calculateDiscount() {
        return getTotalProductPrice() * 0.2; 
    }
}
