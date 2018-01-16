class player
{
	public int i=0;
}

class cricket_player extends player
{
	public void fxn(){
		System.out.println("this is cricket class");
		System.out.println(i);
	}

}

class football_player extends player{

public void fxn(){
		System.out.println("this is football class");
		System.out.println(i);	

	
	}

}
class hockey_player extends player{

public void fxn(){
		System.out.println("this is hockey class");
		System.out.println(i);
	}


}

public class example2
{
	public static void main(String[] args){
		football_player f1 = new football_player();
		cricket_player c1 = new  cricket_player();
		hockey_player h1 = new hockey_player();
	f1.fxn();
	h1.fxn();
	c1.fxn();
	}
}