import java.io.*;

class BufferWriter
{
	public static void main(String[] args)throws IOException{
		FileWriter fw = new FileWriter("./files/file1",true);
		BufferedWriter bf = new BufferedWriter(fw);
		//BufferedWriter bf = new BufferedWriter(new FileWriter("C:\Users\gaurav\Documents\editplus\java\files",true));
		bf.write("\n computer");
		bf.close();
	}
}