public class Reverser {

	private final String inputString;
	private String reversedString;

	public Reverser(String inputString) {
		this.inputString = inputString;
	}

	//I know about StringBuilder, but it's too easy )
	private String reverse() {

		char[] arr = inputString.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			char tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
		return new String(arr);
	}

	public void perform(){

		System.out.println(inputString);

		for (int i = 1000; i <= 100000; i *= 10) {
			long start = System.currentTimeMillis();
			for (int j = 0; j < i; j++) {
				reversedString = reverse();
			}
			if (i == 1000) {
				System.out.println(reversedString);
			}
			long end = System.currentTimeMillis();
			System.out.print((end - start) + " ");
		}
	}

}
