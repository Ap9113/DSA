## Single Element in a Sorted Array

### Problem Statement
Given a sorted array where every element appears twice except for one element which appears only once, find that single element.

---

### Brute-Force Approach
1. Iterate through the array in steps of 2.
2. For each pair, check if the two elements are different.
3. If they are, return the first element of the pair.
4. If no such pair is found, return the last element.

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

### Optimal Approach (Binary Search)
1. Use binary search to find the single element.
2. For each mid index, ensure it is even (if not, decrement by 1).
3. If `arr[mid] == arr[mid + 1]`, the single element is in the right half; move `low` to `mid + 2`.
4. Otherwise, the single element is in the left half; move `high` to `mid`.
5. Continue until `low` equals `high`. Return `arr[low]`.

**Time Complexity:** O(log n)
**Space Complexity:** O(1)
