import java.io.*;
class BufferReadLine
{
	public static void main(String[] args)throws IOException{
		FileReader fr = new FileReader("C:/Users/gaurav/Documents/editplus/java/files/file1.txt");
		BufferedReader bf =  new BufferedReader(fr);
		String s1;
		while ((s1 = bf.readLine())!=null)
		{
			System.out.println(s1);
		}
		bf.close();	
	}
}