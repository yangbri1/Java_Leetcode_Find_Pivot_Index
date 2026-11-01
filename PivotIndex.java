class Solution {
    public int pivotIndex(int[] nums) {
        // System.out.println(nums[0]);

        int pivotIndex = -1;
        int leftSum = 0;
        int rightSum = 0;
        // int leftIndex = 0;
        // int rightIndex = 0;
        // initialzie an empty 'ArrayList' to create a copy of 'nums' 
        List<Integer> numLst = new ArrayList<Integer>();
        // account for the sum on the leftmost edge to be 0 as given
        numLst.add(0);
        // fill in the rest of the elems from given 'nums'
        for(int num : nums){
            numLst.add(num);
        }
        // account for the sum of the rightmost edge to be 0 as well
        numLst.add(0);
        // ex. [0, 2, 1, -1, 0]

        System.out.println(numLst);
        // iterate thru 'numLst' up to but exclude last elem ...
        // ex. [0, 2, 1]
        for(int i = 0; i < numLst.size() - 2; ++i){
            // System.out.println(numLst.get(i));
            // ex. 0
            leftSum += numLst.get(i);
            System.out.println(leftSum);
            System.out.println(".........");
            // loop via 'numLst' elems excluding selected ...
            // ex. [1, -1, 0]
            for(int j = i + 2; j < numLst.size(); ++j){
                System.out.print(numLst.get(j) + ", ");
                // add up all the rest of the elems
                // ex. 1 + (-1) + 0 = 0
                rightSum += numLst.get(j);
                System.out.println("rightSum " + rightSum);
                // if(leftSum < rightSum){
                //     break;
                // }
            }

            System.out.println();

            // checks if sum on left === sum on right of selected index ...
            if(leftSum == rightSum){
                // return(i+1);
                pivotIndex = i;
                System.out.println("pivot " + pivotIndex);

                // return the selected index as the pivot index
                return(i);
            }

            // otw if 'leftSum' != 'rightSum' ...
            else{
                // leftSum = 0;
                // reset 'rightSum' to 0 & restart the summation
                rightSum = 0;
            }
        }
        // return(-1);
        // System.out.println("pivot " + pivotIndex);
        return(pivotIndex);
    }
}