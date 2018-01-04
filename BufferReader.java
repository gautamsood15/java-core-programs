import java.io.*;
class BufferReader
{
	public static void main(String[] args)throws IOException{
	
	FileReader fr = new FileReader("C:/Users/gaurav/Documents/editplus/java/files/file1.txt");
	BufferedReader bf = new BufferedReader(fr);
	
	//int ch;
	//BufferedReader bf = new BufferedReader(new FileReader("C:/Users/gaurav/Documents/editplus/java/files/files1.txt"));
	/*while ((ch = bf.read())!=-1)
	{
		System.out.print((char)ch);
	}
	bf.close();  */

	String s1;
	while ((s1=bf.readLine())!=null)
	{
		System.out.println(s1);
	}
	
	bf.close();

	}
}
									