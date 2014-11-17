package exercises;

public class Testing {

	public static void main(String args[]) {
		
   System.out.println("Anagram");
	String[] firstWords ={"cinema", "host", "aba", "train"};
	String[] secondWords= {"iceman", "shot", "bab", "rain"};
	
	Anagram t1=new Anagram();
	t1.isAnagram(firstWords, secondWords);
	
	
	System.out.println("Braces");
	String[] expressions= {")(){}", "[]({})", "([])", "{()[]}","([)]"};
	
	
	Braces b=new Braces();
	b.isMatched(expressions);
	
	
	System.out.println("Sort");
	Hill hill = new Hill();
	int[] list ={5, 4, 3, 2, 8};
	hill.sort(list);
	
	
	//maximun difference
	
	System.out.println("maximun Difference");
	int[] v={3, -5, 1, -2, 8, -2, 3, -2, 1};
	maximunDifference m= new maximunDifference();
	m.getMAxDif(v);
	
	}
	

	


}
