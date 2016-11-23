package hello;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 		      *
		 		     * *
		 		    * * *
		 		   * * * *
		 		  * * * * * 
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

	}

}
