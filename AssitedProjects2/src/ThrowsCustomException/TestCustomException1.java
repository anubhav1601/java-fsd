package ThrowsCustomException;

class  InvalidAgeException1  extends Exception  
{  
    public  InvalidAgeException1 (String str)  
    {  
       
        super(str);  
    }  
}  
    

public class TestCustomException1  
{  
  
   
    static void validate (int age) throws InvalidAgeException1{    
       if(age < 18){  
  

        throw new InvalidAgeException1("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    
    public static void main(String args[])  
    {  
        try  
        {  
              
            validate(13);  
        }  
        catch (InvalidAgeException1 ex)  
        {  
            System.out.println("Caught the exception");  
    
        
            System.out.println("Exception occured: " + ex);  
        }  
  finally {
        System.out.println("rest of the code...");    
    }  
} } 


