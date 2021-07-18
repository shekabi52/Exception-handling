import java.io.IOException;

public class exception {
    static void fun() throws IOException
    {
        throw new IOException();
    }
    public static void main(String[] args) {
        try
        {
            fun();
        }
        catch (Exception e)
        {
            System.out.println("hello");
        }
        finally {
            System.out.println("c");
        }
    }
}
