 <h2><a href="https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/description/">Find Valid Matrix</a></h2>
  <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' />


## Problem Description

You are given two arrays `rowSum` and `colSum` of non-negative integers where `rowSum[i]` is the sum of the elements in the *i*th row and `colSum[j]` is the sum of the elements of the *j*th column of a 2D matrix. In other words, you do not know the elements of the matrix, but you do know the sums of each row and column. 

- The sum of elements of the *i*th row is equal to `rowSum[i]`.
- The sum of elements of the *j*th column is equal to `colSum[j]`.

Return *any* matrix that fulfills the above conditions.

## Constraints

- `1 <= rowSum.length, colSum.length <= 500`
- `0 <= rowSum[i], colSum[i] <= 10^8`
- `sum(rowSum) == sum(colSum)` 

## Example

**Input:**


```
rowSum = [3, 8]
colSum = [4, 7]

```

**Output:**


```
[[3, 0],
 [1, 7]]

```
