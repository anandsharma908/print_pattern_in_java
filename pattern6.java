package patterns;

import java.util.Scanner;

/*
5
*####
###**
***##
###**
*####
*/
public class patten6
{
   
   public static void main(String[] args)
{
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int k=0,j=0;

for(int i=1;i<=n/2;i++)
{

if(i%2==1)
{
 k=i;
     j=n-i;  
 while(k--!=0)
  {
System.out.print("*");
  }
   while(j--!=0)
   {
System.out.print("#");
   }
}
else
{
k=i;
     j=n-i;  
 while(j--!=0)
  {
System.out.print("#");
  }
   while(k--!=0)
   {
System.out.print("*");
   }
}
System.out.println("");


}
for(int i=(n/2)+1;i<=n;i++)
{

if(i%2==0)
{
 k=i;
     j=n-i;  
 while(k--!=1)
  {
System.out.print("#");
  }
   while(j--!=-1)
   {
System.out.print("*");
   }
}
else
{
k=i;
     j=n-i;  
 while(j--!=-1)
  {
System.out.print("*");
  }
   while(k--!=1)
   {
System.out.print("#");
   }
}
System.out.println("");
}
sc.close();
}
}