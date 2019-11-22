# Remove Duplicates from Sorted Array

Question : 

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length. 
Do not allocate extra space for another array, you must do this in place with constant memory.
For example, given input array A = [1,1,2], your function should return length = 2, and A is now [1,2].
---------------------------------------------------------

Analysis.

Solution First glance : 
Use hash set , but we need extra space. Question already restricted from using extra space
We can adjust the same array and send the result length.

Can do it in o(n) 

Steps

1. Iterate through the elements.
2. track the new index.
3. If previous elements are same then don't increment the new index.


 
