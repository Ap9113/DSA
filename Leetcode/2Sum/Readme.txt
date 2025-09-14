## 2Sum Problem Approaches

### Brute Force Approach

1. Loop through each element of the array with index `i`.
2. For each element at index `i`, loop through the rest of the array (from index `i+1` to end) with index `j`.
3. For each pair `(i, j)`, check if `arr[i] + arr[j] == target`.
4. If true, return the indices `{i, j}`.

This checks all possible pairs, so it's guaranteed to find the answer (based on problem guarantee).

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

### Better Approach (Using HashMap)

1. Initialize a HashMap to store `value → index`.
2. Iterate through the array:
	- For each number `arr[i]`, calculate its complement as `target - arr[i]`.
	- Check if the complement exists in the map:
		- If it does, we’ve found the two numbers → return their indices.
		- If it doesn’t, put the current number and its index into the map.

This way, we only loop once, and lookups in the map are constant time.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)