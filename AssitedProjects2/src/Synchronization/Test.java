package Synchronization;


class A
{ 
    public void send(String msg) 
    { 	
        System.out.println("\nSending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String msg; 
    private Thread t; 
    A  sender; 
    ThreadedSend(String m,  A obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 
} 
class Test
{ 
    public static void main(String args[]) 
    { 
        A snd = new A(); 
        ThreadedSend S1 = 
            new ThreadedSend( "GOOD MORNING " , snd ); 
        ThreadedSend S2 = 
            new ThreadedSend( " GOOD NIGHT " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
}