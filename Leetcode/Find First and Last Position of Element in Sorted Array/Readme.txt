## Find First and Last Position of Element in Sorted Array

### Problem Statement
Given a sorted array of integers and a target value, find the starting and ending position of the target value. If the target is not found, return [-1, -1].

---

### Brute-Force Approach
1. Iterate through the array to find the first occurrence of the target.
2. Continue iterating to find the last occurrence of the target.
3. Return the indices of the first and last occurrence.

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

### Optimal Approach (Binary Search)
1. Use binary search to find the lower bound (first occurrence) of the target.
2. Use binary search to find the upper bound (last occurrence) of the target.
3. If the target is not found, return [-1, -1].
4. Otherwise, return [lower bound, upper bound - 1].

**Time Complexity:** O(log n)
**Space Complexity:** O(1)