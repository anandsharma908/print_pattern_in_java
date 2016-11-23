
import java.io.*;
import java.util.*;
import java.lang.*;
class first_task
{
    public static boolean check_to_proceed(String str)
     {
         if(str.startsWith("a")||str.startsWith("ab")||str.startsWith("abc"))
             return true;
         else
             return false;
     }
     
    public static int get_number_of_drops(String str)
    {
        int count=0;
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            if(str.charAt(i)=='a')
            {
                if(str.charAt(i+1)!='b' && l>=i+1)
                    count++;
                else if(str.charAt(i+2)!='c' && l>=i+2)
                    count++;
            }
            else if(str.charAt(i)=='b')
            {
                if(str.charAt(i+1)!='c' && l>=i+1)
                    count++;
            }
            else if(str.charAt(i)=='c')
            {
                if(str.charAt(i+1)!='a')
                    count++;
            }
            else
                count++;
            
        }
 return (count-1);        
    }
    
    public static void main(String args[]) throws IOException
    { try{
        Scanner sc = new Scanner(System.in);
        first_task obj = new first_task();
        int t=sc.nextInt();
       for(int i=0;i<t;i++)
       {
    	   String str=sc.next();
           boolean flag = obj.check_to_proceed(str);
             if(flag)
             {
                 
                int count =obj.get_number_of_drops(str);
                System.out.println(count);
             }
       }

             
    }
    catch(Exception e)
    {
        System.out.println(e);
        }
        
    }
}