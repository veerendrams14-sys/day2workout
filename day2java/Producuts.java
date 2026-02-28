class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative!");
        }
    }
    public void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}
public class Producuts {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);

        p1.displayProduct();

        p1.setPrice(60000);
        System.out.println("\nAfter Price Update:");
        p1.displayProduct();
    }
}