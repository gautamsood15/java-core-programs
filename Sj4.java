class data
{
String name;
data(String n){ name=n; }
void disp()
{

System.out.println("Name :"+name);
int c=0;
int len=name.length();
for(int i=0;i<len;i++)
if(name.charAt(i)=='A'||name.charAt(i)=='a')
{
c++;
System.out.println("number of occurance :"+c);
System.out.println("Possition :"+(i+1));
}
if(c==0)
System.out.println("there is no 'A' available in the string");
}
}
class Sj4
{
public static void main(String ar[])
{
data d1=new data("shail sood");
d1.disp();
data d2=new data("gautam sood");
d2.disp();
}
}
