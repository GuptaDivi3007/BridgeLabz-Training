package LoggingTransactions;

import java.util.*;
public class LoggingTransactionMain {
 public static void main(String[] args) {

     List<String> transactionIds = Arrays.asList(
             "TXN1",
             "TXN2",
             "TXN3",
             "TXN4" );
     // Using forEach() to log transactions
     transactionIds.forEach(id ->
             TransactionLogger.log(id)
     );
 }
}
