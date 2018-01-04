/*import java.io.*;
public class CompileTimeExcp
{
	public static void main(String[] args)throws IOException
		{
		
		throw new IOException();
		//System.out.println("hey pussy");
	
	}
}

*/

import java.io.*;
public class CompileTimeExcp
{
	public static void main(String[] args){
	
		try{
		
			throw new IOException("this is an IO exception");
		}
		catch(IOException e){
		
			System.out.println("Exception :"+e.getMessage());
		}
	}
}