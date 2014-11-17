package exercises;
import java.util.Stack;

public class Braces {

	public static void isMatched(String[] expressions){
		
		for(int i=0; i<expressions.length;i++){//through the array of expressions   
			//prints out the result
			if(matched(expressions[i]))
				System.out.println("1");
			else
				System.out.println("0");

		}
	}
	
	//checks if all the braces are matched
	public static boolean matched(String s){
		Stack<Character> found= new Stack<Character>();//to store the opening brackets
		
		char t;
		int i;
		
		for(i=0;i<s.length();i++){ //goes trough the braces
			 t=s.charAt(i);
			if(t == '(' || t == '{' || t == '['  ){ //if it's an opening brace store it on queue
				found.add(t);
			}
			else{//
				
				if(found.isEmpty())//if found a closing one before there is nothing it means it doesn't close correctly		
					return false;
				
				//check if the brace matches the one in the queue
				else if(found.peek() != typeMatch(t)){
					return false;}
				else{
					found.pop();
				}
			}
		}
		
		
		if(found.isEmpty())
		return true;
		
		//not empty means there was more to close
		return false;
	}
	
	public static char typeMatch(char c){
		if(c =='}')
			return '{';
		
		else if(c ==']')
			return '[';
	
		return '(';
	}
	


}
