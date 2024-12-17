import java.io.*;
import java.util.*;
class StringPalindrome
 {
    public static void main(String args[])
     {
        int i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        int l=s.length();
        for(i=0;i<l;i++)
         {
            if(s.charAt(i)!=s.charAt(l-i-1))
             {
                flag++;
                break;
             }
         }
        if(flag==0)
         {
            System.out.println(s+" "+"is a palindrome");
         }
        else
         {
            System.out.println(s+" "+"is not a palindrome");
         }
     }
 }