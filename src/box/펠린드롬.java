package box;

import java.util.Scanner;

public class 펠린드롬 {

public static String solution(String str) {
		
		String result = "YES";
				
		str = str.toUpperCase().replaceAll("[^A-Z]","");
		
		StringBuffer sb = new StringBuffer(str);
		
		if(!sb.reverse().toString().equalsIgnoreCase(str)) result = "NO";
			
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);			
			String str = sc.nextLine();	
			
			System.out.println(solution(str));
			
		
	}

}
