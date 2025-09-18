## Subarray Sum Equals K

### Problem Statement
Given an array of integers and an integer k, find the total number of continuous subarrays whose sum equals to k.

---

### Brute-Force Approach
1. Use two nested loops to consider every possible subarray.
2. For each subarray, calculate the sum and check if it equals k.
3. Increment the count if the sum matches k.

**Time Complexity:** O(n²)
**Space Complexity:** O(1)

---

### Better Approach (Prefix Sum + HashMap)
1. Use a HashMap to store the frequency of prefix sums.
2. For each element, calculate the prefix sum.
3. If (prefixSum - k) exists in the map, add its frequency to the count.
4. Update the map with the current prefix sum.

**Time Complexity:** O(n)
**Space Complexity:** O(n)

---

### Optimal Approach (Sliding Window, Only Non-Negative Numbers)
1. Use two pointers to maintain a window and a running sum.
2. Expand the window by moving the right pointer and adding to the sum.
3. Shrink the window from the left if the sum exceeds k.
4. If the sum equals k, increment the count.

**Time Complexity:** O(n)
**Space Complexity:** O(1)

*Note: The optimal approach works only for arrays with non-negative elements.*
