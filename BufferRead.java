import java.io.*;
class BufferRead
{
	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new FileReader("C:/Users/gaurav/Documents/editplus/java/files/file1.txt"));
		char []s = new char[20]; 
		//bf.read(s,0,15);
		bf.read(s,2,4);
		System.out.println(s);
		bf.close();
	}
}