public class Order {
    String[] menu = new String[16];
    int cost;
    String orderTime;

    Order(String[] menu, int cost, String orderTime) {
        this.menu = menu;
        this.cost = cost;
        this.orderTime = orderTime;
    }
}
