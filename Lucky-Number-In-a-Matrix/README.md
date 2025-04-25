
<h2><a href="https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/">Lucky Number in a Matrix</a></h2>
  <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /> 


## 📘 Problem Description

Given an `m x n` matrix of **distinct** numbers, return **all lucky numbers** in the matrix in **any order**.

A **lucky number** is an element of the matrix such that it is:
- the **minimum element in its row**, and
- the **maximum in its column**.

---

## 🧠 Examples

### Example 1
**Input:**
```
matrix = [
  [3, 7, 8],
  [9, 11, 13],
  [15, 16, 17]
]
```
**Output:** `[15]`  
**Explanation:** 15 is the minimum in its row and the maximum in its column.

---

### Example 2
**Input:**
```
matrix = [
  [1, 10, 4, 2],
  [9, 3, 8, 7],
  [15, 16, 17, 12]
]
```
**Output:** `[12]`

---

### Example 3
**Input:**
```
matrix = [
  [7, 8],
  [1, 2]
]
```
**Output:** `[7]`

---

## ✅ Constraints

- `m == matrix.length`
- `n == matrix[i].length`
- `1 <= m, n <= 50`
- `1 <= matrix[i][j] <= 10⁵`
- All elements in the matrix are **distinct**

