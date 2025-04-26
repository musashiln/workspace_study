package atguigu07.object.equals.exer1;

/**
 * ClassName: Order
 * Package: atguigu07.object.equals.exer1
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/24 22:47
 * @Version 1.0
 */
public class Order {

    private int orderId;

    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }

        if (obj instanceof Order) {
            Order order = (Order) obj;
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }

        return false;
    }
}
