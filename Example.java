 class Box 
{

	int length,width,height;
	public void setdimension(int l,int b,int h){
		length=l;
		height=h;
		width = b;
	
	}
	public void printdimension(){
		System.out.println("L="+length);
		System.out.println("W="+width);
		System.out.println("H="+height);
	
	}}

public class Example
{
	public static void main(String[] args){
		Box smallBox = new Box();
		smallBox.setdimension(21,22,23);
		smallBox.printdimension();
		
	}
}
