# Remove Duplicates from Sorted Array II

Question :

Follow up for "Remove Duplicates"(no 26):
What if duplicates are allowed at most twice?
For example, given sorted array A = [1,1,1,2,2,3],
your function should return length = 5, and A is now [1,1,2,2,3].
So this problem also requires in-place array manipulation.

Analysis :

In this case we need to increment the new index when i - 2 elements are not equal.
time : O(n)

Solution :

1. Use index and newIndex for iteration
2. index should start from the 3rd position and increment 
3. if elements in index and index - 2 are not equal 
    then increment newIndex
4. Return newIndex + 1


