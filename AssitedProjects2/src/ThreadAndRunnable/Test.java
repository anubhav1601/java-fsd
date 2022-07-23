package ThreadAndRunnable;

public class Test extends Thread implements Runnable {
	public static int Count = 0;
    public Test()
    {
    }
	public void run1()
 	{
  		System.out.println("Thread Implementation..concurrent thread started running");
     }
	
	public void run2() {
	        while(Test.Count <= 10){
	            try{
	                System.out.println("First Thread: "+(++Test.Count));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    }
	    
	public static void main(String[] args) {
		Test mt = new  Test();
  		mt.start();
  		mt.run1();
  		System.out.println("\n Below is a Runnable Implementation output:-");
  		System.out.println("\nMain Thread Started");
        Test mrt = new Test();
        Thread t = new Thread(mrt);
        t.start();
        while(Test.Count <= 10)
        {
            try
            {
                System.out.println("Main Thread: "+(++Test.Count));
                Thread.sleep(100);
            } catch (InterruptedException iex)
            {
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("\nMain Thread Ended");
    }
}
