public class Main {
    public static void main(String[] args) {
        HashTable<String, Order> orders = new HashTable<>();
        System.out.println(orders.isEmpty());
        orders.put("1", new Order(new String[] {"fried potatoes", "pepsi"}, 250, "21:00"));
        System.out.println(orders.size());

        orders.put("2", new Order(new String[] {"shrimp salad", "apple juice"}, 1399, "21:33"));
        System.out.println(orders.size());
        System.out.println(orders.getValue("2").orderTime);

        orders.remoteKey("1");
        System.out.println(orders.size());
        System.out.println(orders.getValue("1"));
    }
}
