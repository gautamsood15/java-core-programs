package pack2;
import pack2.Student;
public class ImportExample
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setRollno(100);
		s1.setName("gautam");
		System.out.println("Your rollno is :"+s1.getRollno());
		System.out.println("Your name is :"+s1.getName());
	}
}
