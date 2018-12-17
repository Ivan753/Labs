package pr8_1;

public class Test {

    public static void main(String[] args) {


        // Тестируем Заказ, непосредственно составленного в магазине
        TableOrdersManager orderManager = new TableOrdersManager();

        Order to = new TableOrder();
        to.add(new Drink("имя", "описание", 500));
        to.add(new Dish("напиток","описание",340));

        Order to1 = new TableOrder();
        to1.add(new Drink("имя", "описание", 1004));
        to1.add(new Dish("напиток","описание",10));

        orderManager.add(to, 1);
        orderManager.add(to1, 2);

        // выводим полную цену заказа
        System.out.println(to.costTotal());

        // получаем количество элементов в заказе
        System.out.println(((TableOrder) to).getSize());

        // выводим полную цену заказа
        System.out.println(orderManager.ordersCostSummary());



        // Тестируем Заказ, непосредственно составленного в магазине
        InternetOrdersManager internetOrderManager = new InternetOrdersManager();

        Order Ito = new InternetOrder();
        Ito.add(new Drink("напиток, заказанный в интернете", "описание", 5000));
        Ito.add(new Dish("посуда","описание",140));

        Order Ito1 = new InternetOrder();
        Ito1.add(new Drink("имя11", "описание", 1004));
        Ito1.add(new Drink("имя11", "описание", 704));
        Ito1.add(new Dish("напиток1","описание",10));

        internetOrderManager.add(Ito);
        internetOrderManager.add(Ito1);

        // выводим полную цену заказа
        System.out.println(Ito.costTotal());
        System.out.println(Ito1.costTotal());

        // получаем количество элементов в заказе
        System.out.println(((InternetOrder) Ito).getSize());




    }

}
