
import java.util.Scanner;

public class new_one {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		int count=0;
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			int x=arr[i];			
			for(int j=i+1;j<N-1;j++)
			{
				if(x>arr[j])
				{
					
				}
			}
		}
		System.out.println(" "+count);	
		}
	}


