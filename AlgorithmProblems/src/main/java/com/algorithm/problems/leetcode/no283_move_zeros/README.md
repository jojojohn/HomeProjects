## Move Zeros

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations. 

Solution : 

In place solution. iterate through each element and replace all zeros.
Once it reaches the end of the array then fill with zeros.

time complexity : O(n)
space complexity : O(1)

