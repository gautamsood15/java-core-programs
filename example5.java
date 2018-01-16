import java.lang.String;

class employee
{
	int empid;
	String name;
	double salary;

	employee(){
	
	System.out.println("hi i am the base class default constructor");
	}
	employee(int a,String b,double c){
		empid=a;
		name = b;
		salary = c;
	
	}

	void emp_name(employee e1){
	
	System.out.println("the name ofemployee is "+e1.name);
	}

void emp_salary(employee e2){
	
	System.out.println("the name ofemployee is "+e1.salary);
	}

	void increasesalary(double per){

	
		double sal = salary;
		double x =  (sal*per)/100;
	    sal =  sal  + x;
		salary = sal;
		System.out.println("increased salary is :"+ sal);
	
	}

}


class manager extends employee
{
	String dept;
manager(String s,int i,String a,double c){
		super(i,a,c);
	this.dept = new String(s);


}}


public class example5
{
	public static void main(String[] args)throws ArrayIndexOutOfBoundsException 
		{

		try{
		employee e1 = new employee(1233,"gautam",500000);
		manager m1 = new manager("Engg");

		System.out.println("Enter Name,ID,Salary,dept,Increase of the employee :");
			e1.name = args[0];
			e1.empid  = Integer.parseInt(args[1]);
			e1.salary = Double.parseDouble(args[2]);
			m1.dept = args[3];
		System.out.println("the name of employee is :"+e1.name);
		System.out.println("the ID of employee is :"+e1.empid);
		System.out.println("the salary of employee is :"+e1.salary);
		System.out.println("the department of manager is :"+m1.dept);
		
		
		double per = Double.parseDouble(args[4]);
		e1.increasesalary(per);
		}

		catch(ArrayIndexOutOfBoundsException e){
		
		System.out.println("you must enter the correct input");
		
		}
				
		


}}