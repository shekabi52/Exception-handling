import java.util.Scanner;
class notfirforjob extends Exception
{
    notfirforjob(String s)
    {
        super(s);
    }
}
public class scenario_1 {
    static void fun(boolean status) throws notfirforjob
    {
        if(status==false)
        {
            throw new notfirforjob("not fit");
        }
        else
        {
            System.out.println("permitted");
        }
    }
    public static void main(String[] args) throws notfirforjob {
        Scanner sc = new Scanner(System.in);
        boolean b = sc.nextBoolean();
        fun(b);
    }
}
