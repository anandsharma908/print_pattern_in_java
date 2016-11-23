public class Demo {
	
	public static void main(String args[]) {
		
		String text = "aaa bbb ccc aaa bbb ccc aaa bbb ccc";
 
		String[] str1 = text.split("aaa");
		String[] str2 = text.split("bbb");
		
		for(int i=1; i<str1.length; i++)			
			System.out.println(str1[i]);		
		System.out.println();		
		for(int i=1; i<str2.length; i++) 	
			System.out.println(str2[i]);
		
		String str="anandsharma";
		System.out.println(str.replaceFirst("an", "AN"));
		System.out.println(str.endsWith("and"));
		int x=str.codePointAt(0);
		System.out.println(x);
		int x1=str.codePointBefore(2);
		System.out.println(x1);
		int codeCount = text.codePointCount(1, 6);
		System.out.println(codeCount);
	}
}