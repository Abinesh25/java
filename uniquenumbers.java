import java.util.*;
public class uniquenumbers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int st=sc.nextInt(),en=sc.nextInt(),count=0;
        sc.close();
        for(int i=st;i<=en;i++)
        {
        int a=i%10;
        int b=i/10;
        if(a!=b)count++;
        }
        System.out.println(count);
    }
}
