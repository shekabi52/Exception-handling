class invalidageexception extends Throwable
{
    invalidageexception(String s)
    {
        super(s);
    }
}
public class custom_exception {
    public static void main(String[]args) throws invalidageexception{
        int age=17;
        if(age<18)
        {
            throw new invalidageexception("not eligible");
        }
        else
        {
            System.out.println("can vote");
        }
    }
}
