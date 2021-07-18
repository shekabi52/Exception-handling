public class basic1 {
    static  void fun1() throws ArithmeticException{
        try
        {
            throw new ClassNotFoundException("error");
        }
        catch (Exception e)
        {
            System.out.println("handled in method");
        }
    }
    static void fun()
    {
        try
        {
            fun1();
        }
        catch (Exception e)
        {
            System.out.println("handled");
        }
    }
    public static void main(String[] args) {
        fun();
    }
}
