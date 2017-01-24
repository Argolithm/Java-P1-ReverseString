import java.util.Scanner; 

public class ReverseString {
	
	public static String ReverseMe (String s){
		int length = s.length();
		String result = null;
		
			
		for (int i = 0;i < s.length(); i++){
			if(result == null){
				result = Character.toString(s.charAt(length-1) );
			}
			else {
				result += s.charAt(length - 1);
			}
			
			length--;
			
		}
		
		return result;
	}
	
	
	

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
	
		System.out.println("Reversing String: " + ReverseMe(input) );
		
		
	}
	
}