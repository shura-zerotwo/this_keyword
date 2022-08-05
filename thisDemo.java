package o4_this_keyword;

//https://youtu.be/3p-EQfHBheI

public class thisDemo {
	
	int a = 100;//instance variable
	static int b = 200;//static variable
	
	void demo1() {
		int a = 10;//local variable
		int b = 20;//local variable
		System.out.println("a="+a);
		System.out.println("instance variable a="+this.a);
		System.out.println("b="+b);
		System.out.println("static variable b="+thisDemo.b);
	} //instance method()
	
	static void demo2() {
		int c = 30;
		int d = 40;
		System.out.println("I am a static method, i can be called directly by the class name");
	} //static method()
	
	public static void main(String[] args) {
		
		thisDemo thisdemo = new thisDemo();
		this.demo1();//calling it in a instance way as sum() is a instance method
		
		demo2();//can be directly called within the same class
	
	}
	
}
