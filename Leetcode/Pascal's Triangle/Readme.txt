## Pascal's Triangle

### Problem Statement
Given an integer numRows, generate the first numRows of Pascal's Triangle.

---

### Approach (As Written in Main.java)
1. Initialize an empty list to store the rows of the triangle.
2. For each row from 0 to numRows - 1:
    - Start the row with 1.
    - For each position j (from 1 to i-1), set the value as the sum of the two values above it: `ans[i-1][j-1] + ans[i-1][j]`.
    - End the row with 1 (if i > 0).
    - Add the row to the answer list.
3. Return the list of rows.

**Time Complexity:** O(numRows²)
**Space Complexity:** O(numRows²)
