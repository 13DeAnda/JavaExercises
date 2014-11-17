package exercises;

public class Anagram {

	public void isAnagram(String[] firstWords, String[] secondWords){
		int i,j,k;
		
		for(i=0; i<firstWords.length;i++){//through the array of words
			boolean isAnagram=true;
			boolean[] isUsed=new boolean[secondWords[i].length()];//checks if character on second word was used to match on first word
			
			
			if(firstWords[i].length() ==secondWords[i].length())//must be same length
			for(j=0; j<firstWords[i].length();j++){//through the characters of first word
							
				if(!isAnagram) //if letter not found on past search
					break;
				for(k=0;k<secondWords[i].length();k++){//goes through elements of second word
					if(firstWords[i].charAt(j) == secondWords[i].charAt(k)) //check for match on second word characters
						if(!isUsed[k]){
							isUsed[k]=true; //sets that character as used
						}//
						else
							isAnagram=false;
				}//k loop second word
			}//j loop first word
			else//not same size
				isAnagram=false;
			
			//print out the result of word
			if(isAnagram)
				System.out.println("1");
			else
				System.out.println("0");
			//it will set the one for the other right and it will be done
			
		} //i loop the array
	}
}
