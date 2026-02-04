package BackgroundJobExecution;

public class Main {
	public static void main(String[] args) {

        System.out.println("Main thread started");

       
        Runnable backgroundTask = () -> {
            System.out.println("Background task started");

            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Background task completed");
        };

       
        Thread backgroundThread = new Thread(backgroundTask);
        backgroundThread.start();

        System.out.println("Main thread continues its work");
    }
}
