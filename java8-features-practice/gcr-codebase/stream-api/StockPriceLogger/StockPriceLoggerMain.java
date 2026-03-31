package StockPriceLogger;

import java.util.*;
public class StockPriceLoggerMain {
 public static void main(String[] args) {
     List<Stock> liveFeed = Arrays.asList(
             new Stock("Maruti Suzuki", 14880.50),
             new Stock("HCL Tech.", 1713.50),
             new Stock("Reliance Industry", 1445.00),
             new Stock("LIC", 840.00));
     // Using forEach() to display stock price updates
     liveFeed.forEach(stock -> System.out.println(stock));
 }
}

