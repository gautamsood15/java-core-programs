class Up
{
public static void main(String ar[])
	{
	
	String str1="";
	int len=ar[0].length();
		for(int i=0;i<len;i++)
		{
		char c=ar[0].charAt(i);
		int temp=(int) c;
			if(c>=67&&c<=90)
			{
			temp=temp+32;
			c=(char) temp;
			str1=str1+c;
			}
			if(c>=97&&c<=122)
			{
			temp=temp-32;
			c=(char) temp;
			str1=str1+c;
			}
		}
	System.out.println(str1);
	}
}