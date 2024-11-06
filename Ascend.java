// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int randMax = Integer.parseInt(args[0]);
		double a = Math.random() * randMax;
		double b = Math.random() * randMax;
		double c = Math.random() * randMax;
		double minNum = Math.min(Math.min(a , b) , c);
		double maxNum = Math.max(Math.max(a , b) , c);
		double midNum = (a + b + c) - minNum - maxNum;
		System.out.println((int) a + " " + (int) b + " " +(int) c);
		System.out.println((int) minNum + " " + (int) midNum + " " +(int) maxNum);

	}
}
