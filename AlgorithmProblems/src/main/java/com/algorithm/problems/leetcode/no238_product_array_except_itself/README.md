##Product Of Array Except Self
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Solution
1. Create a new array with same length as input, and assign first index with value 1.
    result = new int[input.length];
2. Iterate through the input array from left to right and fill the result array like below 

            result[i] = result[i - 1] * input[i - 1];
3. Create a variable with value 1.

        int value = 1;
4. Iterate the input array from left to right then fill the result array with 

            result[i] *= input[i + 1] * value;
5. And update the value each iteration like below.

            value *= input[i + 1];