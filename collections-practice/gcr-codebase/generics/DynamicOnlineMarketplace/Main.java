import java.util.*;

public class Main {

    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Fundamentals", 500.0, new BookCategory());

        Product<ClothingCategory> shirt = new Product<>("Denim Shirt", 1200.0, new ClothingCategory());

        Product<GadgetCategory> phone = new Product<>("Smartphone", 25000.0, new GadgetCategory());

        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);

        for (Product<?> p : catalog) {
            System.out.println(p.getCategory().getCategoryName() + " | " + p.getName() + " | Price: " + p.getPrice());
        }
    }
}
