## Majority Element II

### Problem Statement
Given an array of integers, find all elements that appear more than ⌊ n/3 ⌋ times.

---

### Brute-Force Approach
1. For each element, count its occurrences by scanning the entire array.
2. If the count is greater than n/3 and the element is not already in the answer, add it.

**Time Complexity:** O(n²)
**Space Complexity:** O(1) (excluding output)

---

### Better Approach (Sorting)
1. Sort the array.
2. Count consecutive occurrences of each element.
3. If the count is greater than n/3, add the element to the answer.

**Time Complexity:** O(n log n)
**Space Complexity:** O(1) (excluding output)

---

### Better Approach 1 (HashMap)
1. Use a HashMap to count the frequency of each element.
2. Iterate through the map and add elements with frequency greater than n/3 to the answer.

**Time Complexity:** O(n)
**Space Complexity:** O(n)

---

### Optimal Approach (Boyer-Moore Voting Algorithm)
1. There can be at most two elements that appear more than n/3 times.
2. Use two candidate variables and their counts.
3. First pass: Find potential candidates.
4. Second pass: Verify the candidates' counts.

**Time Complexity:** O(n)
**Space Complexity:** O(1)
