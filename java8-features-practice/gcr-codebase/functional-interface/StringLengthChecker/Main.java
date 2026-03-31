package StringLengthChecker;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

       
        int maxLimit = 20;

        
        Function<String, Integer> getLength = message -> message.length();

        
        checkMessage("Hello World", maxLimit, getLength);
        checkMessage("This message is definitely too long", maxLimit, getLength);
        checkMessage("Short msg", maxLimit, getLength);
    }

   
    static void checkMessage(String message,
                             int limit,
                             Function<String, Integer> function) {

        int length = function.apply(message);

        if (length > limit) {
            System.out.println("Message too long (" + length + " characters)");
        } else {
            System.out.println("Message accepted (" + length + " characters)");
        }
    }

}
