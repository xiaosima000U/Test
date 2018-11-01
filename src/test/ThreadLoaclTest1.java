package test;

import java.util.Random;

public class ThreadLoaclTest1 {
//	private static ThreadLocal<ThreadLocalStatic> threadlocalstaticData = new ThreadLocal<ThreadLocalStatic>();
	public static void main(String[] args) {
		for(int i=0;i<2;i++){
		new Thread(new Runnable(){

			@Override
			public void run() {
				Integer i = new Random().nextInt();
				ThreadLocalStatic.getInstance().setAge(i+"");
				ThreadLocalStatic.getInstance().setName("name"+i);
				
				new classA().getA();
				new classB().getB();
			}
			
		}).start();
		}
	}
	static class classA{
		 void getA(){
			ThreadLocalStatic a = ThreadLocalStatic.getInstance();
			System.out.println(Thread.currentThread().getName()+">>>A:name:"+a.getName()+",age:"+a.getAge());
		}
	}
	static class classB{
		 void getB(){
			ThreadLocalStatic b = ThreadLocalStatic.getInstance();
			System.out.println(Thread.currentThread().getName()+">>>B:name:"+b.getName()+",age:"+b.getAge());
		}
	}
	
}
class  ThreadLocalStatic{
	private ThreadLocalStatic(){}
	private String name;
	private  String age;
	private static ThreadLocal<ThreadLocalStatic> threadlocalstatic = new ThreadLocal<ThreadLocalStatic>();
	public static ThreadLocalStatic getInstance(){
		ThreadLocalStatic threadlocal = threadlocalstatic.get();
		if(threadlocal == null){
			threadlocal = new ThreadLocalStatic();
			threadlocalstatic.set(threadlocal);
		}
		return threadlocal;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
