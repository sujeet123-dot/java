package Thread;

// TODO: Define PrinterTask class that implements Runnable
class PrinterTask implements Runnable {
  @Override
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(Thread.currentThread().getName() + ": Running task " + i);
      try {
        Thread.sleep(100); // Small delay for better interleaving (optional)
      } catch (InterruptedException e) {
        System.out.println("Thread interrupted: " + e.getMessage());
      }
    }
  }
}

public class Main {
  public static void main(String[] args) {
    // TODO: Create a single PrinterTask object
    PrinterTask pt = new PrinterTask();

    // TODO: Create two threads using the same task
    // Name them "Worker-1" and "Worker-2"
    Thread t1 = new Thread(pt, "Worker-1");
    Thread t2 = new Thread(pt, "Worker-2");

    // TODO: Start both threads
    t1.start();
    t2.start();

    // TODO: Use join() to wait for both threads to finish
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted: " + e.getMessage());
    }
    System.out.println("Main thread: All tasks completed.");
  }
}
