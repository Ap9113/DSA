## Pythagorean Triplet Approaches

### Brute Force Approach

- Use three nested loops to try every triplet `(i, j, k)`.
- Compute the square of each number.
- Check if any pair satisfies $a^2 + b^2 = c^2$.

**Time Complexity:** O(n³)  
**Space Complexity:** O(1)

---

### Better Approach – Check all (a, b), store c²

- Precompute squares of all elements and store in an array.
- Loop through all pairs `(i, j)`, compute $a^2 + b^2$, and check if this sum exists in the array of squares.

**Time Complexity:** O(n²)  
**Space Complexity:** O(n)

---

### Optimal Approach – Sort + Two Pointers

- Square all elements.
- Sort the squared array.
- Fix $c^2$ as the last element, and use two pointers from the start and end to find if $a^2 + b^2 = c^2$.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1) (if modifying input), O(n) otherwise