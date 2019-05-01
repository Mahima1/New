import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {   
            long num=sc.nextLong();
            //System.out.println("num is : "+num);
            if (num<5)
            {
                System.out.println("0");
            }
            else
            {
                double x=Math.log(num);
                double y=Math.log(5);
                double add=x/y;
                add=(long)add;
                long total=0;
                long z=5;
                long a=1;
                for (;a<=add;a++)
                {
                    
                    long add1=(long)Math.pow(z,a);
                    long zeroes=num/add1;
                    total=total+zeroes;
                    
                }
                System.out.println(total);
            }           
        }
	}
}
