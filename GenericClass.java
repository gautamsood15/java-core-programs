
class MyData<T>{
	T i;
	public void add(T i1){ i = i1; }

	public T get(){ return i; }
	
}
public class GenericClasses {
	MyData<Integer> m1 = new MyData<Integer>();
	MyData<String> m2 = new MyData<String>();
	Integer in  = new Integer(5);
	String str = new String("Gautam");
	
	m1.add(in);
	m2.add("gautam");

}
