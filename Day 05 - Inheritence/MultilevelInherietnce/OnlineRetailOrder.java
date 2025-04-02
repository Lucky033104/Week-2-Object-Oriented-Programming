package Inheritence.MultilevelInherietnce;

import java.time.LocalDate;
class Order {
    String orderId;
    LocalDate orderDate;
    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public String getOrderStatus() {
        return "Order placed on: " + orderDate;
    }
}
class ShippedOrder extends Order {
    String trackingNumber;
    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}
class DeliveredOrder extends ShippedOrder {
    LocalDate deliveryDate;
    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}
public class OnlineRetailOrder {
    public static void main(String[] args) {
        Order order = new Order("71", LocalDate.of(2025, 4, 8));
        ShippedOrder shipped = new ShippedOrder("98", LocalDate.of(2025, 4, 7), "TRK987467");
        DeliveredOrder delivered = new DeliveredOrder("21", LocalDate.of(2025, 4, 6), "TRK89422", LocalDate.of(2025, 4, 9));
        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}

