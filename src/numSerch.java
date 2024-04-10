package box;
import java.util.Scanner;

public class numSerch {
	
	public static String numPrint(String str) {
		str = str.replace("[^1-9]", "");
		return str;
	}
	
	public static void mainn(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(numPrint(str));
	}

}
