package test;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Person {
	public static void main(String[] args) {
		ThreadLocalTest asdf = new ThreadLocalTest();
		Class clazz = asdf.getClass();
		System.out.println(clazz.getSuperclass());
	}
	
}