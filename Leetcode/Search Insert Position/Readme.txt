## Search Insert Position

### Problem Statement
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be inserted in order.

---

### Brute-Force Approach
1. Iterate through the array.
2. If the current element equals the target, return its index.
3. If the current element is greater than the target, return its index (where the target should be inserted).
4. If the target is greater than all elements, return the length of the array.

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

### Optimal Approach (Binary Search)
1. Use binary search to find the position where the target should be inserted.
2. If the middle element is greater than or equal to the target, move the high pointer left.
3. Otherwise, move the low pointer right.
4. Return the final answer index.

**Time Complexity:** O(log n)
**Space Complexity:** O(1)