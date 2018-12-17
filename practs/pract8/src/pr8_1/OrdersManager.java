package pr8_1;

interface OrdersManager {

    public int itemsQuantity(String itemName);
    public int itemsQuantity(MenuItem item);
    public Order[] getOrders(MenuItem item);
    public int ordersCostSummary();
    public int ordersQuantity();

}
