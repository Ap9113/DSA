## Capacity To Ship Packages Within D Days

### Problem Statement
Given an array of package weights and an integer D (days), find the least weight capacity of a ship that will ship all the packages within D days.

---

### Helper Function
- `findDays(weights, cap)`: Returns the number of days needed to ship all packages with a given capacity.

---

### Brute-Force Approach
1. Set the search range for capacity from the maximum single package weight to the sum of all weights.
2. For each capacity in the range, use the helper function to check if all packages can be shipped within D days.
3. Return the first capacity that works.

**Time Complexity:** O((sum(weights) - max(weights) + 1) * n)
**Space Complexity:** O(1)

---

### Optimal Approach (Binary Search)
1. Set the search range for capacity from the maximum single package weight to the sum of all weights.
2. Use binary search:
    - For each mid capacity, use the helper function to check the number of days needed.
    - If the number of days is less than or equal to D, search for a smaller capacity.
    - Otherwise, search for a larger capacity.
3. Return the minimum capacity found.

**Time Complexity:** O(n * log(sum(weights) - max(weights) + 1))
**Space Complexity:** O(1)