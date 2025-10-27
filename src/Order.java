import java.util.Arrays;
import java.util.Objects;

public class Order {
    public String customer;
    public Product [] productBasket;

    public Order(String customer, int size) {
        this.customer = customer;
        this.productBasket = new Product[size] ;
    }

    @Override
    public String toString() {
        return "Customer " + customer + "Product Basket " + Arrays.toString(productBasket);
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        if (!Objects.equals(customer, order.customer)) return false;
        if (productBasket.length != order.productBasket.length) return false;
        for (int i = 0; i < productBasket.length; i++) {
            Product product1 = productBasket[i];
            Product product2 = order.productBasket[i];
            if (product1 == null && product2 != null) return false;
            if (product1 != null && product2 == null) return false;
        }
        return true;
    }

}
