package finalnstatic;
//i've changed the file

public class StaticDemo2 {
	public void abc() {
		System.out.println("non static");
	}

	public static void abcd() {
		System.out.println("static");
	}

	public static void main(String[] args) {

		Thread.currentThread();

		abcd();

		StaticDemo2 sd = new StaticDemo2();
		sd.abc();
		sd.abcd();

	}
}
