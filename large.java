# pro4.java
import java.io.*;
import java.util.*;
public class large
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int j=s.nextInt();
        int k=s.nextInt();
        if(i>=k && i>=j)
        {
            System.out.println(i);
        }
        if(j>=i && j>=k)
        {
            System.out.println(j);
        }
        if(k>=i && k>=j)
        {
            System.out.println(k);
        }
    }
}
