package pgms;

public class revstr {

	public static void main(String[] args)
	{
		
		String str = "penchala";
		String revstr = "";
		char ch;
		for(int i= 0; i < str.length(); i++)
		{
		ch= str.charAt(i);
		revstr = ch + revstr;
		}
		
		
		System.out.println(revstr);
	}
}


		
		
		





