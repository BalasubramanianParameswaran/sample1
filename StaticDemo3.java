package finalnstatic;

class Stat {

	public void abc() {
		System.out.println("non static");
	}

	public static void abcd() {
		System.out.println("staticccccccccc");
	}
}

public class StaticDemo3/* extends Stat */{
	public static void main(String[] args) {
		Stat.abcd();

		Stat ob = new Stat();
		ob.abc();
		ob.abcd();
	}
}
