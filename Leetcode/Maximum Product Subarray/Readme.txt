## Maximum Product Subarray

### Problem Statement
Given an array of integers, find the contiguous subarray within the array (containing at least one number) which has the largest product.

---

### Brute-Force Approach
1. Use two nested loops to consider every possible subarray.
2. For each subarray, calculate the product and track the maximum product found.

**Time Complexity:** O(n²)
**Space Complexity:** O(1)

---

### Optimal Approach (Dynamic Programming)
1. Initialize `maxSoFar`, `minSoFar`, and `result` to the first element.
2. Iterate through the array:
    - If the current element is negative, swap `maxSoFar` and `minSoFar`.
    - Update `maxSoFar` as the maximum of the current element and `maxSoFar * current element`.
    - Update `minSoFar` as the minimum of the current element and `minSoFar * current element`.
    - Update `result` as the maximum of `result` and `maxSoFar`.
3. Return `result`.

**Time Complexity:** O(n)
**Space Complexity:** O(1)
