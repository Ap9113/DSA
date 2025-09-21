## Find Peak Element

### Problem Statement
Given an array of integers, find a peak element and return its index. A peak element is an element that is strictly greater than its neighbors.

---

### Brute-Force Approach
1. Check if the first or last element is a peak.
2. For each element from index 1 to n-2, check if it is greater than both its neighbors.
3. Return the index of the first peak found.

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

### Optimal Approach (Binary Search)
1. Use binary search to find a peak element.
2. For the middle element, check if it is a peak:
    - If yes, return its index.
    - If the left neighbor is greater, search the left half.
    - Otherwise, search the right half.
3. Repeat until a peak is found.

**Time Complexity:** O(log n)
**Space Complexity:** O(1)