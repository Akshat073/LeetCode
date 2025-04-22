
  <h2><a href="https://leetcode.com/problems/roman-to-integer/description/">Roman to Integer</a></h2>
  <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /> 

  <div class="section">
    <h2>🧠 Problem Statement</h2>
    <p>Roman numerals are represented by the following symbols:</p>
    <table>
      <tr><th>Symbol</th><th>Value</th></tr>
      <tr><td>I</td><td>1</td></tr>
      <tr><td>V</td><td>5</td></tr>
      <tr><td>X</td><td>10</td></tr>
      <tr><td>L</td><td>50</td></tr>
      <tr><td>C</td><td>100</td></tr>
      <tr><td>D</td><td>500</td></tr>
      <tr><td>M</td><td>1000</td></tr>
    </table>
    <p>
      Some subtractive combinations are:<br>
      IV = 4, IX = 9, XL = 40, XC = 90, CD = 400, CM = 900.
    </p>
  </div>

  <div class="section">
    <h2>🧾 Example</h2>
    <pre><code>Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4</code></pre>
  </div>

  <div class="section">
    <h2>🔒 Constraints</h2>
    <ul>
      <li>1 &lt;= s.length &lt;= 15</li>
      <li>s contains only characters: I, V, X, L, C, D, M</li>
      <li>s is a valid Roman numeral in the range [1, 3999]</li>
    </ul>
  </div>

  <div class="section">
    <h2>🧩 Approach</h2>
    <ol>
      <li>Create a map of Roman characters to integer values.</li>
      <li>Traverse the string from right to left.</li>
      <li>If the current value is less than the previous, subtract it; otherwise, add it.</li>
    </ol>
  </div>

 
 
