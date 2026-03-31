package LoggingTransactions;

import java.time.LocalDateTime;

class TransactionLogger {

 // Logs a transaction with timestamp
 public static void log(String transactionId) {
     System.out.println(LocalDateTime.now()+" - Transaction: "+transactionId);
 }
}

