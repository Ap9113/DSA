## Minimum Number of Days to Make m Bouquets

### Problem Statement
Given an array `bloomDay` where `bloomDay[i]` is the day the i-th flower blooms, and integers `m` (number of bouquets) and `k` (flowers per bouquet), find the minimum number of days required to make m bouquets. Each bouquet must be made from k adjacent flowers that have bloomed.

---

### Helper Function
- `possible(arr, day, m, k)`: Checks if it's possible to make m bouquets on a given day using k adjacent bloomed flowers.

---

### Brute-Force Approach
1. If the total number of flowers is less than `m * k`, return -1.
2. For each day from the minimum to the maximum bloom day:
    - Use the helper function to check if it's possible to make m bouquets.
    - Return the first day for which it's possible.

**Time Complexity:** O((maxDay - minDay) * n)
**Space Complexity:** O(1)

---

### Optimal Approach (Binary Search)
1. If the total number of flowers is less than `m * k`, return -1.
2. Set the search range from the minimum to the maximum bloom day.
3. Use binary search:
    - For each mid day, use the helper function to check if it's possible to make m bouquets.
    - If possible, update answer and search for a smaller day.
    - Otherwise, search for a larger day.
4. Return the minimum day found.

**Time Complexity:** O(n * log(maxDay - minDay))
**Space Complexity:** O(1)
