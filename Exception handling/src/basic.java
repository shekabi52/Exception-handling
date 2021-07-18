import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class basic {
    static void fun() throws ArithmeticException
    {
       try
       {
           int c=10/0;
       }
       catch(Exception e)
       {

           System.out.println("handled");
           throw e;
       }
    }
    public static void main(String[] args) throws IOException {
        int a=10;
        try
        {
            fun();
        }
        catch (Exception e) {
            System.out.println("exception handled in main");
        }
    }
}
