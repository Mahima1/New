import java.io.*;
import java.util.*;
import java.lang.* ;

class Main
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for (int i=0;i<n;i++)
       {    
          int num1=sc.nextInt();
           int num2=sc.nextInt();
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);
        StringBuilder input1 = new StringBuilder(); 
        input1.append(str1);  
        input1 = input1.reverse();
        StringBuilder input2 = new StringBuilder(); 
        input2.append(str2);  
        input2 = input2.reverse();
        num1 = Integer.parseInt(input1.toString());
        num2 = Integer.parseInt(input2.toString());
        int sum=num1+num2;
        String str3=Integer.toString(sum);
        StringBuilder input3=new StringBuilder();
        input3.append(str3);
        input3.reverse();
        sum=Integer.parseInt(input3.toString());
        System.out.println(sum);
       }
    }
}
