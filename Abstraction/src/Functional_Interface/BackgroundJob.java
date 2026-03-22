package Functional_Interface;

public class BackgroundJob {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Task is running in background...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Task interrupted");
            }
            System.out.println("Task completed!");
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}