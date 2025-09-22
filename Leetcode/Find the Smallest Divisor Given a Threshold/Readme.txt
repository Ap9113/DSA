## Find the Smallest Divisor Given a Threshold

### Problem Statement
Given an array of integers and a threshold, find the smallest divisor such that the sum of the division results (rounded up) is less than or equal to the threshold.

---

### Brute-Force Approach
1. Try every possible divisor from 1 to the maximum number in the array.
2. For each divisor, calculate the sum of `(num + divisor - 1) / divisor` for all elements.
3. If the sum is less than or equal to the threshold, return the current divisor.

**Time Complexity:** O(maxNum * n)
**Space Complexity:** O(1)

---

### Optimal Approach (Binary Search)
1. Set the search range for the divisor from 1 to the maximum number in the array.
2. Use binary search to find the smallest divisor:
    - For each mid divisor, calculate the sum of `(num + mid - 1) / mid` for all elements.
    - If the sum is less than or equal to the threshold, search for a smaller divisor (move high left).
    - Otherwise, search for a larger divisor (move low right).
3. Return the smallest divisor found.

**Time Complexity:** O(n * log(maxNum))
**Space Complexity:** O(1)