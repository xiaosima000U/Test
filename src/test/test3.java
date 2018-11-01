package test;

public class test3 {
	private static  String name = "zhangsan";
	private static  String sex ="female";
	static synchronized String getname() throws InterruptedException{
		return name;
	}
	public String toString(){
		return name+":"+sex;
	}
	public void show(){
		System.out.println(this);
	}
	static synchronized String getsex() throws InterruptedException{
		Thread thread = new Thread();
		thread.sleep(10000);
		return sex;
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println(getname());
		System.out.println(getsex());
		test3 test3 =new test3();
		test3.show();
	}
}
