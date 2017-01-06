// this is a program that output the numbers from 1 to n
// But for multiples of three, output "Fizz" instead of the number, for muliples of five, output "Buss".
// For numbers which are multiples of both three and five, output "FizzBuzz"
// the runtime complexity of it is O(n)
// Space complexity is O(n)

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<String>();
        int threeCount = 3;
        int fiveCount = 5;
        for(int i = 1;i<=n;i++){
            String s = "";
            threeCount--;
            fiveCount--;
            if(threeCount != 0 && fiveCount != 0){
                s = Integer.toString(i);
         
            }
            if(threeCount ==0) {
                s+="Fizz";
                threeCount = 3;
            }
            if(fiveCount == 0){
                s+="Buzz";
                fiveCount = 5;
            }
            ret.add(s);
        }
        return ret;
    }
}
