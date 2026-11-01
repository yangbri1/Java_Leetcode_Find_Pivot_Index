/* LOL below solution works for "Find Pivot Index" --- but soooo poorly optimized ;_; 
** honestly feel like I might be able to use a conjunction of built-in 
** array -> lst of subarray/sublist w/ index up to selected indx w/o inclusion & sum
** stream? */
class Solution {
    public int pivotIndex(int[] nums) {
        
        // initialization block for respective variables to be altered later
        int leftSum = 0;
        int rightSum = 0;

        int totalSum = 0;

        // enhanced for-loop which iterates via given int[] ary 'nums' ...
        for(int num : nums){
            // ... while adding up each individual 'num'
            totalSum += num;
        }

        // breakdown: 
        // total sum = left sum + index + right sum

        // standard looping way thru 'nums' ...
        for(int i = 0; i < nums.length; ++i){
            // initialize the 'int' at index like so
            int pivotIndex = nums[i];
            // logically speaking, the equation above to find the pivot index could be rearranged 
            // right sum = total sum - left sum - index
            rightSum = totalSum - leftSum - pivotIndex;
            // right half finally equates to left half ...
            if(leftSum == rightSum){
                // return the selected index 'i' as the pivot index
                return(i);
            }
            // otw ...
            else{
                // this index did not bring balance so add it to 'leftSum' ...
                // ... the search continues for the Avatar (tm) *cough cough* sorry --- the _pivot index_
                leftSum += nums[i];
            }
        }

        // if after all of the above computation were NOT able to find a decisive pivot index ...
        // ... just output -1 ;_;
        return(-1);

        // System.out.println(nums[0]);
        /* ------------ brute force --- require further optimization below ------------- */
        // int pivotIndex = -1;
        // int leftSum = 0;
        // int rightSum = 0;
        // // int leftIndex = 0;
        // // int rightIndex = 0;
        // // initialzie an empty 'ArrayList' to create a copy of 'nums' 
        // List<Integer> numLst = new ArrayList<Integer>();
        // // account for the sum on the leftmost edge to be 0 as given
        // numLst.add(0);
        // // fill in the rest of the elems from given 'nums'
        // for(int num : nums){
        //     numLst.add(num);
        // }
        // // account for the sum of the rightmost edge to be 0 as well
        // numLst.add(0);
        // // ex. [0, 2, 1, -1, 0]

        // // System.out.println(numLst); -------- debugging use
        // // iterate thru 'numLst' up to but exclude last elem ...
        // // ex. [0, 2, 1]
        // for(int i = 0; i < numLst.size() - 2; ++i){
        //     // System.out.println(numLst.get(i));
        //     // ex. 0
        //     leftSum += numLst.get(i);
        //     // System.out.println(leftSum); -------
        //     // System.out.println("........."); ------
        //     // loop via 'numLst' elems excluding selected ...
        //     // ex. [1, -1, 0]
        //     for(int j = i + 2; j < numLst.size(); ++j){
        //         // System.out.print(numLst.get(j) + ", "); -------
        //         // add up all the rest of the elems
        //         // ex. 1 + (-1) + 0 = 0
        //         rightSum += numLst.get(j);
        //         // System.out.println("rightSum " + rightSum); -----
        //         // if(leftSum < rightSum){
        //         //     break;
        //         // }
        //     }

        //     // System.out.println(); --------

        //     // checks if sum on left === sum on right of selected index ...
        //     if(leftSum == rightSum){
        //         // return(i+1);
        //         pivotIndex = i;
        //         // System.out.println("pivot " + pivotIndex); --------

        //         // return the selected index as the pivot index
        //         return(i);
        //     }

        //     // otw if 'leftSum' != 'rightSum' ...
        //     else{
        //         // leftSum = 0;
        //         // reset 'rightSum' to 0 & restart the summation
        //         rightSum = 0;
        //     }
        // }
        // // return(-1);
        // // System.out.println("pivot " + pivotIndex);
        // return(pivotIndex);
    }
}