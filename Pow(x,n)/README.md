<h2><a href="https://leetcode.com/problems/powx-n/description/">Pow(x,n)</a></h2>
  <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' />



## Problem Description
Implement the function `pow(x, n)`, which calculates `x` raised to the power `n` (`x^n`).

- **x** is a double-precision floating-point number.
- **n** is an integer.
- The goal is to compute the result efficiently, ideally in **O(log n)** time.



## Examples

| Input | Output | Explanation |
|:-----|:------|:------------|
| x = 2.00000, n = 10 | 1024.00000 | 2<sup>10</sup> = 1024 |
| x = 2.10000, n = 3 | 9.26100 | 2.1<sup>3</sup> = 9.261 |
| x = 2.00000, n = -2 | 0.25000 | 2<sup>-2</sup> = 1/2<sup>2</sup> = 0.25 |

---

## Constraints
- `-100.0 < x < 100.0`
- `-2<sup>31</sup> <= n <= 2<sup>31</sup> - 1`
- `n` is an integer.
- You must **handle negative powers**.
- The result should have **precision within 10<sup>-5</sup>**.

---



