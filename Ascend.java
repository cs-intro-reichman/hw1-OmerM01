// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int randMax = Integer.parseInt(args[0]);
		double a = Math.random() * randMax;
		double b = Math.random() * randMax;
		double c = Math.random() * randMax;

		System.out.println(a + " " + b + " " + c);
	}
}
