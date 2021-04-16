import java.util.Scanner;

public class InnerScanner {
	Scanner scanner = new Scanner(System.in);
	public int scanner_int() {
		int integer = scanner.nextInt();
		return integer;
	}
	public String scanner_string() {
		String string = scanner.next();
		return string;
}
}
