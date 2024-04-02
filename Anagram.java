import java.util.*;
public class Anagram
{
    public static void main(String args[])
    {
        Scanner  in =new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        int c=0,d=0;
        in.close();
        for(int i=0;i<a.length();i++)
           c+=(int)a.charAt(i);
        for(int j=0;j<b.length();j++)
           d+=(int)b.charAt(j);
        if(c==d)
         System.out.println("Anagram");
        else
         System.out.println("Not anagram");
    }
}