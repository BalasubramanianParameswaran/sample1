package finalnstatic;

public class StaticDemo1 {
	int a = 10;

	static int b = 10;
	final int c=20;

	public void abc() {
		a=a+10;
		b = b + 10;
	//	c=b;
		//int c = 4;
		// static int dddb = 234;
		// static varibale decalare global only
		System.out.println(a);
		System.out.println(b);
	}

	public static void abcd() {
		// System.out.println(a);
		// variable 'a' is nonstatic
		//System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		StaticDemo1 sd = new StaticDemo1();
		sd.abc();
		StaticDemo1 sd2=new StaticDemo1();
		sd2.abc();
	//	sd.abcd();
	}
}
