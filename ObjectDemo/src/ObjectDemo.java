
public class ObjectDemo {
	
	public static void main(String[] args)
	{
		Object obj =  new Object();
		Object obj1 = new String("Java Everywhere");
		Object obj2 = new String("Java Everywhere");
		Object obj3 = new String("Java is funny");
		String str = (String)obj3;
		
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.equals(obj2));
		System.out.println(str.toUpperCase());
	}

}