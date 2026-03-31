package CloningPrototypeObjects;

public class PrototypeDemo {
	public static void main(String[] args) throws CloneNotSupportedException {

        
        Product original = new Product(1, "Laptop", 75000);

       
        Product copy1 = (Product) original.clone();
        Product copy2 = (Product) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Copy 1  : " + copy1);
        System.out.println("Copy 2  : " + copy2);
    }
}
