package exercises;


/*
 * the difference between the sum of the elements in the right subsequence and the sum of 
 * the elements in the left subsequence is maximum difference possible
 * from left and right sums get the right-left difference that would give the biggest difference
 * 
 */
//    0   1  2  3      4   5   6   7  8
// v: 3, -5, 1, -2,     8, -2, 3, -2, 1
//     L: -5, 1, -2   R: 8, -2, 3.
public class maximunDifference {
 
	public void getMAxDif(int[] v){
	int sumR=0,sumL=0; //the sum of right and left 
	int mDif=0; // the maximun difference found so far
	int dif;//difference on every combination
	
	int i,j;
	//would asume it's even and mantains same size in both
	
	
	
	//increases from corners to center
	for(i=0,j=v.length-1; i<j; i++,j--){		
		sumR=v[j]+sumR;
		sumL=v[i]+sumL;
		
		dif=sumR-sumL; //dif between right and left
		if(dif >mDif)
			mDif=dif;
	}
	

	
	//from middle to corners. decreases corners
	for(i=0,j=v.length-1; i<j; i++,j--){
		
		sumR=sumR-v[j];
		sumL=sumL-v[i];
		
		dif=sumR-sumL;
		if(dif >mDif)
			mDif=dif;
	}	
	
	
	System.out.println(mDif);
	
		}
		
		
	
		

	
}
