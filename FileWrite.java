import java.io.*;

public class FileWrite
{
	public static void main(String[] args)throws IOException{
	int i;
	FileOutputStream fout;
	fout = new FileOutputStream("C:/Users/gaurav/Documents/editplus/java/files/file1.txt");
	String s  = "my name is gautam sood";
	char  ch[] = s.toCharArray();
	for(i=0;i<s.length();i++)
		fout.write(ch[i]);
	fout.close();
	}
}