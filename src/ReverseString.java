public class ReverseString {

	public static void main(String[] args) {
		// String string = null;
		String str = "Jitendra";
		int i = str.length();
		while (i > 0) {
			System.out.print(str.charAt(i - 1));
			i--;

		}

	}
}
