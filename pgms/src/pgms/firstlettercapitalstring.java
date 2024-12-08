package pgms;

public class firstlettercapitalstring {
	public static void main(String[] args)
	{
		String str = "penchala";
		String fletter = str.substring(0,1);
		String rletter = str.substring(1,str.length());
		fletter = fletter.toUpperCase();
		str = fletter + rletter;
		System.out.println(str);}
	
		

}
