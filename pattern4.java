package hello;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	      *
	     * *
	    * * *
	   * * * *
	  * * * * * 
	  * * * * *
	   * * * *
	    * * *
	     * *
	      * 
*/
		int space=4;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<space;j++)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
				System.out.print("* ");
			System.out.print("\n");
			space--;
		}
		space=0;
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<space;j++)
				System.out.print(" ");
			for(int j=0;j<i;j++)
				System.out.print("* ");
			System.out.print("\n");
			space++;
		}
		
	}

}
