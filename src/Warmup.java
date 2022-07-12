import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();

		Reverser rev = new Reverser(inputString);
		rev.perform();
	}
}
