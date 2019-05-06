
public class MyOperator {

	public static void main(String[] args) {
		int x = 5;
		++x; // x is 6 now
		int y = x; // y is 6
		y = x++; // x is 7; y is 6
		System.out.println("x = " + x + "; y = " + y);
		int z = ++x; // x is 8; z is 8
		System.out.println("x = " + x + "; z = " + z);
	}

}
