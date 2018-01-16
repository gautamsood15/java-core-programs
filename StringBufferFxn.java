public class StringBufferFxn
{
	public static void main(String[] args){
	
		StringBuffer sb1 = new StringBuffer("java is");


System.out.println(sb1.capacity());
			
	sb1.trimToSize();
	System.out.println(sb1.capacity());
	System.out.println(sb1.length());
	System.out.println(sb1);	
	System.out.println(sb1.insert(4,"are"));
	
	char []c = {'A','B','C','D'};
	String s1 = new String(c);
	
	System.out.println(sb1.insert(4,s1));
	}
}