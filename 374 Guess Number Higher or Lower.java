/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int ret = 0;
        int l = 1;
        int r = n;
        while(l<=r){
            int mid = l +(r-l)/2;
            if(guess(mid) == 0){
                ret = mid;
                return mid;
            }
            else if(guess(mid) == 1){
                l = mid+1;
            }
            else if(guess(mid) == -1){
                r = mid-1;
            }
        }
        return l;
        
    }
    
}

// first version! Accepted!
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */
/*  
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return solution(1,n); 
    }
    
    private int solution(int l, int r){
        int pivot = l+(r-l)/2;
		int result = guess(pivot);
		if(result == -1) {
			pivot = solution(l,pivot-1);
		}
		if(result == 1) {
			pivot = solution(pivot+1,r);
		}
		if(result == 0){
		    return pivot;
		}
		return pivot;
        
		
	}
}

*/
