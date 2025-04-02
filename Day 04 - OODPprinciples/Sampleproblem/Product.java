package OODPprinciples.Sampleproblem;
import java.util.ArrayList;
import java.util.List;
class Product {
    private String name;
    private double pricePerUnit;
    private double quantity;
    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }
    public String getName() {
        return name;
    }
    public double getPricePerUnit() {
        return pricePerUnit;
    }
    public double getQuantity() {
        return quantity;
    }
}
class Customer {
    private String customerName;
    private List<Product> cart;
    public Customer(String customerName) {
        this.customerName = customerName;
        this.cart = new ArrayList<>();
    }
    public void addProduct(Product product) {
        cart.add(product);
    }
    public List<Product> getCart() {
        return cart;
    }
    public String getCustomerName() {
        return customerName;
    }
}
class BillGenerator {
    public double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.getCart()) {
            total += p.getTotalPrice();
        }
        return total;
    }
}
 class GroceryStoreApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Lucky");
        customer.addProduct(new Product("Apples", 3.0, 2.0));  // 2 kg @ $3/kg
        customer.addProduct(new Product("Milk", 2.0, 1.0));     // 1 liter @ $2/liter
        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.generateBill(customer);
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Purchased Items:");
        for (Product p : customer.getCart()) {
            System.out.println(" - " + p.getName() + ": " + p.getQuantity() + " units @ $" + p.getPricePerUnit() + " each = $" + p.getTotalPrice());
        }
        System.out.println("Total Bill: " + totalBill);
    }
}
