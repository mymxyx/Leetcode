/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1; int r = n;
        int ret = 0;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(isBadVersion(mid)){
                if(!isBadVersion(mid-1)){
                    ret = mid;
                    return mid;
                }
                else{
                    r = mid-1;
                }
            }
            else{
                l = mid +1;
            }
        }
        return ret;
    }
}
