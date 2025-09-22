## Koko Eating Bananas

### Problem Statement
Given an array of piles of bananas and an integer H (hours), find the minimum integer eating speed K such that Koko can eat all the bananas within H hours.

---

### Brute-Force Approach
1. Try every possible eating speed from 1 to the maximum pile size.
2. For each speed, calculate the total hours needed to eat all piles.
3. If the total hours is less than or equal to H, return the current speed.

**Time Complexity:** O(maxPile * n)
**Space Complexity:** O(1)

---

### Optimal Approach (Binary Search)
1. Set the search range for speed from 1 to the maximum pile size.
2. Use binary search to find the minimum speed:
    - For each mid speed, calculate the total hours needed.
    - If hours > H, increase the speed (search right).
    - Otherwise, decrease the speed (search left).
3. Return the minimum speed found.

**Time Complexity:** O(n * log(maxPile))
**Space Complexity:** O(1)