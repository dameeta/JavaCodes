package ThreadPack;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable task1 = () -> {
          System.out.println("Executing1 Task1  At " + System.nanoTime());
        };

        System.out.println("Submitting task1 at " + System.nanoTime() + " to be executed after 5 seconds.");
        scheduledExecutorService.schedule(task1, 5, TimeUnit.SECONDS);
        Runnable task2 = () -> {
            System.out.println("Executing Task2 At " + System.nanoTime());
          };
          System.out.println("Submitting task2 at " + System.nanoTime() + " to be executed after 5 seconds.");
          scheduledExecutorService.schedule(task2, 7, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}
