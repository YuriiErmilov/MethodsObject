//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product Product1 = new Product(242, " Sneakers ", 3000, " Shoes");
        Product Product2 = new Product(231, " Ski ", 15000, " Sport ");
        Product Product3 = new Product(220, " Snowboard ", 10000, " Sport ");
        Order order = new Order("Yurii", 3);

        order.productBasket[0] = Product1;
        order.productBasket[1] = Product2;
        order.productBasket[2] = Product3;

        Order order2 = new Order("Nastya", 3);
        order2.productBasket[0] = Product3;
        order2.productBasket[1] = Product2;
        order2.productBasket[2] = Product1;

        Order order3 = new Order("Kriss", 3);
        order3.productBasket[0] = Product2;
        order3.productBasket[1] = Product3;
        order3.productBasket[2] = Product1;

        System.out.println(order) ;
        System.out.println(order2) ;
        System.out.println(order3) ;

        System.out.println("Сравниваем заказы");
        System.out.println("order and order2" + order.equals(order2));
        System.out.println("order and order3" + order.equals(order3));

    }
}

