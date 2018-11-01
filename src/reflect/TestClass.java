package reflect;

import java.io.ObjectInputStream.GetField;

public class TestClass {

	public static void main(String[] args) throws ClassNotFoundException {
		SubClass asdf = new SubClass();
		Class clazz = Class.forName("reflect.SubClass");
//		ClassLoader classLoader = 	
//		System.out.println(clazz.getName());
//		System.out.println(clazz.getInterfaces()[0].getName());
		System.out.println(getasdf());;
	}
	
	public static String getasdf (){
		String[] asdf = {"1","2","3"};
		String aaa = new String();
		try {
			aaa= asdf[8];
		} catch (Exception e) {
//			e.printStackTrace();
			aaa = "asdfasdfasdfasdf";
		}
		return aaa;
		
		
	}
}
