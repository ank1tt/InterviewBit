public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0; i < A.size(); i++){
            curr += A.get(i);
            if(curr > max){
                max  = curr;
            }
            if(curr < 0){
                curr = 0;
            }
        }
        return max;
    }
}

/* KADANE ALGORITHM :
1 2 3 - 4 7

curr sum = 1 max = 1
curr sum = 3 now curr > max so max = 3
curr sum = 6 now curr > max so max = 6
curr sum =  2 but curr < max so max = 6
curr sum = 9 now curr > max so max = 9.

the basic logic is whenever we get the curr value in negative we break the 
subarray and compare the maxsum with next subarray sum.
/*
