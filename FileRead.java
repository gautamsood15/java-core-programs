import java.io.*;
public class FileRead
{
	public static void main(String[] args) throws IOException
	{
		int i;
		File f = new File("C:/Users/gaurav/Documents/editplus/java/files/file1.txt");

		FileInputStream fm = new FileInputStream(f);

		do
		{
			i=fm.read();
			if (i!=-1)
			{
				System.out.print((char)i);

			}
		}
		while (i!=1);
		fm.close();


}}