import java.util.Scanner;

public class Pattern_All_in_one {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		do{
		System.out.print("Enter pattern number from 1 to 50:->  ");
		int num=sc.nextInt();
		System.out.print("\n");
		System.out.print("Enter the Range of input line: ");
		int range=sc.nextInt();
		switch(num)
		{
		case 1:
			printOne(range);
			break;
/*
12345
1234
123
12
1
*/	
		case 2:
			printTwo(range);
			break;
/*
12345
2345
345
45
5
*/			
		case 3:
			printThree(range);
			break;
/*
54321
4321
321
21
1
*/			
		case 4:
			printFour(range);
			break;
/*
54321
5432
543
54
5
 */		
		case 5:
			printFive(range);
			break;
/*
1
12
123
1234
12345
 */			
		case 6:
			printSix(range);
			break;
/*
5
45
345
2345
12345			
 */			
		case 7:
			printSeven(range);
			break;
/*
1
21
321
4321
54321
 */			
		case 8:
			printEight(range);
			break;
/*
5
54
543
5432
54321
 */			
		case 9:
			printNine(range);
			break;
/*
1
22
333
4444
55555
 */			
		case 10:
			printTen(range);
			break;
/*
5
44
333
2222
11111
 */		
		case 11:
			printEleven(range);
			break;
/*
55555
4444
333
22
1
 */
		case 12:
			print12(range);
			break;
/*
11111
2222
333
44
5
*/
		case 13:
			print13(range);
			break;
/*
12345
4321
123
21
1
*/
		case 14:
			print14(range);
			break;
/*
1234567
12345
123
1
*/
		case 15:
			print15(range);
			break;
/*
1
01
101
0101
*/
		case 16:
			print16(range);
			break;
/*
13579
3579
579
79
9
*/
		case 17:
			print17(range);
			break;
/*
1
2 4
1 3 5
2 4 6 8
1 3 5 7 9
*/
		case 18:
			print18(range);
			break;
/*
55555
45555
34555
23455
12345			
*/
		case 19:
			print19(range);
			break;
/*
1
23
456
78910
*/
		case 20:
			print20(range);
			break;
/*
1
10
101
1010
10101
*/
		}
		}while(checkNext());
		

	}

	private static void print20(int range) {
		for(int i=1;i<=range;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println("");
		}
		
	}

	private static void print19(int range) {
		// TODO Auto-generated method stub
		
	}

	private static void print18(int range) {
		// TODO Auto-generated method stub
		
	}

	private static void print17(int range) {
		// TODO Auto-generated method stub
		
	}

	private static void print16(int range) {
		// TODO Auto-generated method stub
		
	}

	private static void print15(int range) {
		for(int i=1;i<=range;i++)
		{
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(j%2+" ");					
			}
			System.out.println("");			
		}
		
	}

	private static void print14(int range) {
		for(int i=range;i>=1;i--)
		{				
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}

	private static void print13(int range) {
		for(int i=1;i<=range;i++)
		{
			if(i%2!=0){
			for(int j=1;j<=range-i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
			}
			else
			{
				for(int j=range-i+1;j>=1;j--)
				{
					System.out.print(j+" ");
				}
				System.out.println("");
			}				
		}
		
	}

	private static void print12(int range) {
		int num=0;
		for(int i=1;i<=range;i++)
		{
			num=i;
			for(int j=num;j<=range;j++)
			{
				System.out.print(num+" ");
			}
			System.out.println("");
		}
		
	}

	private static void printEleven(int range) {
		int num=0;
		for(int i=range;i>=1;i--)
		{
			num=i;
			for(int j=1;j<=num;j++)
			{
				System.out.print(num+" ");
			}
			System.out.println("");
		}
		
	}

	private static void printTen(int range) {
		int num=0;
		for(int i=range;i>=1;i--)
		{
			num=i;
			for(int j=num;j<=range;j++)
			{
				System.out.print(num+" ");
			}
			System.out.println("");
		}
		
	}

	private static void printNine(int range) {
		int num=0;
		for(int i=1;i<=range;i++)
		{
			num=i;
			for(int j=1;j<=num;j++)
			{
				System.out.print(num+" ");
			}
			System.out.println("");
		}
		
	}

	private static void printEight(int range) {
		for(int i=0;i<range;i++)
		{
			for(int j=range;j>=range-i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}

	private static void printSeven(int range) {
		for(int i=range;i>=1;i--)
		{
			for(int j=range-i+1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}

	private static void printSix(int range) {
		for(int i=0;i<range;i++)
		{
			for(int j=range-i;j<=range;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}

	private static void printFive(int range) {
		for(int i=1;i<=range;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}

	private static void printFour(int range) {
		for(int i=1;i<=range;i++)
		{
			for(int j=range;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}

	private static void printThree(int range) {
		for(int i=0;i<range;i++)
		{
			for(int j=range-i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}

	private static boolean checkNext() {
		System.out.print("check next pattern(yes/no):=> ");
		String ch=sc.next();
		if(ch.equalsIgnoreCase("yes")){
			System.out.println("welcome again:");
		return true;
		}
		else{
			System.out.println("Thanks for using me good bye:");
			return false;
		}
	}

	private static void printTwo(int range) {
		for(int i=1;i<=range;i++)
		{
			for(int j=i;j<=range;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}

	private static void printOne(int range) {
		for(int i=0;i<range;i++)
		{
			for(int j=1;j<=range-i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}

}
