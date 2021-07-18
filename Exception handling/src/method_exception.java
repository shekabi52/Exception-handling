import java.io.IOException;

class A
{
    void msg() throws ArithmeticException {
        System.out.println("this is a message");
    }
}
class B extends A{
    void msg() throws NumberFormatException
    {
        System.out.println("this is also a message");
    }
}
public class method_exception {

    public static void main(String[] args) {
        B b=new B();
        try
        {
            b.msg();
        }
       catch (Exception e)
       {
           System.out.println("handled");
       }
    }
}
