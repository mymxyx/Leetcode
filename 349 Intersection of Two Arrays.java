public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> hash = new HashSet<>();
        int i =0,j =0;
        while(i<nums1.length & j<nums2.length)
        {
            if(nums1[i] == nums2[j])
            {
                if(!hash.contains(nums1[i]))
                {
                    hash.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        int size = hash.size();
        int[] ret = new int[size];
        int index = 0;
        for(Integer num: hash)
        {
            ret[index++] = num;
        }
        return ret;
    }
}
