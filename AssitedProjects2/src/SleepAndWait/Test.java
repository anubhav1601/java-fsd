package SleepAndWait;

public class Test {
	
    private static Object ab = new Object();
   public static void main(String args[]) throws InterruptedException
   {
       Thread.sleep(2000);
       System.out.println("A thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 2 second");
       synchronized (ab) 
       {
           ab.wait(2000);
           System.out.println(" And Object '" + ab + "' is woken after" + " waiting for 2  second");
       }
   }
}