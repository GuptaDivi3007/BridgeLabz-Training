public class Product {

     int productId;
     private String productName;
     static double price;
     private int stock;

     public Product(int productId, String productName, double price, int stock) {
    	     this.productId = productId;
    	     this.productName = productName;
    	     this.price = price;
    	     this.stock = stock;
     }

     public int getStock() {
    	     return stock;
     }

     public String getProductName() {
    	     return productName;
     }

     public void reduceStock(int quantity) {
    	     stock = stock - quantity;
     }

     public void increaseStock(int quantity) {
    	     stock = stock + quantity;
     }
}
