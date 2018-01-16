public class Sj1{
 
    public static void main(String a[])
{
     
        String str = "gautam sood is my mane my name is gautam sood";
        System.out.println("Basic lastIndexOf() example");
        System.out.println("Char 'm' at last occurance: "+str.lastIndexOf('m'));
        System.out.println("String \"jain\" at last occurance: "+str.lastIndexOf("jain"));
        
        System.out.println("first occurance of char 'm' from 24th index backwards: "
                            +str.lastIndexOf('m',24));
        System.out.println("First occurance of String \"jain\" from 26th index backwards: "
                            +str.lastIndexOf("jain",26));
    }
}