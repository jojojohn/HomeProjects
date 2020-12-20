Problem : 
#Given an array, find the average of all contiguous subarrays of size ‘K’ in it

Array : [1,3,2,6,-1,4,1,8,2],  k = 5

Output : [2.2, 2.8, 2.4, 3.6, 2.8]

This problem can be done using the nested for loop . 
Outer loop will go through each elements until length - k. 
Inner loop will fetch next k elements and will take the average of  k elements.

Time complexity O(nk) -> n is the size of the element. K Is the subarray size. 

This solution can be resolved more efficiently by using the algorithm sliding window. According to this concept a window of size will slide over the elements. 

