package pattern;

public class piramid1 {

	public static void main(String[] args) {
		int i=1,s=5;
		for(String str="1";str!="11111";i++)
		{
			if(i<=5){
			int s1=s-i;
			while(s1>0){
				System.out.print(" ");
				s1--;
			}
			int num=Integer.parseInt(str);
			System.out.print(num*num);
			str+="1";
			System.out.print("\n");
		}
			else
				break;
		}

	}

}
