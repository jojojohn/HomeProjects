### Trapping Rain Water

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
Example:

Input: [0,1,0,2,1,0,1,3,2,1,2,1]

Output: 6

####Solutions
######1.

1. Travel from left to right mark the first value and left boundary
2. Another loop inside travel from the left boundary to the point where the left boundary is less than the current index. During this travel  store the difference between the left boundary and the current index value into the temp array.
3. Then Assign the leftBoundary with the new index where we stopped in step 2.
4. Repeat step 2 with new leftBoundary. Repeat these steps to the last index.
5. After completing above steps then another loop start from right side as right most value in the input array as right boundary.
6. Like step 2 start another loop from right side and add the 
    Math.min(temp[i], rightBoundary-input[i]) into the trappedWater count
7. Whenever the second loop ends assign the rightBoundary with new larger number and repeat the step until the first index.
8. Return the sum.

// See the method trap_1 implementation for solution 1.

######2.

1. Travel from left to right. Assign a max variable with the first index value
2. Each index store the maximum value to the temp array until that position
3. Travel form left to right, Initially assign the right most value as maximum value.
4. Each index calculate the maximum value until that index.
5. Find out the min between the maximum value at that position and value in the temp arry
6. Calculate the difference between the result of step 5 and value at current index. add the this value to total trapped sum.
7. return the sum.
// See the method trap_2 implementation for solution 2.

Both the approaches having the time complexity : O(n)
Space complexity : O(n)

