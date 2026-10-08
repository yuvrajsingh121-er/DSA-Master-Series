# DSA Master Series 🚀

Welcome to my Data Structures and Algorithms repository! This project is a collection of various DSA concepts, problems, and solutions implemented in Java.

## 📂 Repository Structure

* *Arrays*: Basic and advanced array operations.
* *Sorting Algorithms*: Implementations like Bubble Sort, Selection Sort, etc.
* *Searching*: Linear and Binary search.

## 🛠️ Tech Stack
* *Language:* Java
* *IDE:* Visual Studio Code / IntelliJ IDEA

## Time Complexity & Space Complexity Guide

Ye guide software engineering aur competitive programming me algorithms ko analyze karne ke liye use hone wali **Time Complexity** aur **Space Complexity** ke baare me hai.

---

## 1. Time Complexity Kya Hai?
**Time Complexity** kisi algorithm dwara input size (n) ke badhne ke sath-sath execution time me hone wale growth rate ko measure karti hai. Iska matlab ye nahi hai ki code kitne seconds me chalega, balki ye batata hai ki operations input ke size ke mukable kitni tezi se badhenge.

Isse represent karne ke liye **Big O Notation ($O$)** ka use kiya jata hai, jo worst-case (bura se bura) scenario batata hai.

### Common Types of Time Complexity (Fastest to Slowest):

1. **Constant Time - $O(1)$**
   * **Explanation:** Input size kitna bhi bada ho, execution time hamesha same rahega.
   * **Example:** Array ke kisi specific index se element nikalna (e.g., `arr[0]`).

2. **Logarithmic Time - $O(\log n)$**
   * **Explanation:** Har step me problem size aadha (half) ho jata hai.
   * **Example:** Binary Search.

3. **Linear Time - $O(n)$**
   * **Explanation:** Time input size ke sath-sath linearly badhta hai (ek loop chalana).
   * **Example:** Ek unsorted array me kisi element ko linear search se dhundhna.

4. **Linearithmic Time - $O(n \log n)$**
   * **Explanation:** Linear aur logarithmic ka combination, jo efficient sorting algorithms me hota hai.
   * **Example:** Merge Sort, Heap Sort, Quick Sort (average case).

5. **Quadratic Time - $O(n^2)$**
   * **Explanation:** Nested loops ka use hota hai (loop ke andar loop). Input badhne par time bahut tezi se badhta hai.
   * **Example:** Bubble Sort, Selection Sort, Insertion Sort.

6. **Exponential Time - $O(2^n)$**
   * **Explanation:** Input size me thoda sa bhi increment hone par time double ho jata hai. Recursive solutions me dekha jata hai.
   * **Example:** Fibonacci sequence ka naive recursive calculation.

7. **Factorial Time - $O(n!)$**
   * **Explanation:** Sabse slow complexity. Isme saare possible permutations/combinations calculate kiye jate hain.
   * **Example:** Traveling Salesperson Problem (Brute Force approach).

---

## 2. Space Complexity Kya Hai?
**Space Complexity** ye batati hai ki kisi algorithm ko run hone ke liye kitni extra memory (RAM) ki zarurat padegi. Isme input ke dwara li gayi memory ke alawa algorithm ke variables, data structures aur function call stack ki memory ko count kiya jata hai.

Isse bhi **Big O Notation ($O$)** me hi measure kiya jata hai.

### Types of Space Complexity:

1. **Constant Space - $O(1)$**
   * **Explanation:** Algorithm ko extra memory ki zarurat nahi padti chahe input kitna bhi bada ho. Sirf kuch variables (jaise loop counters) ke liye thodi si memory milti hai.
   * **Example:** Do numbers ka sum nikalna, ya array ko in-place reverse karna.

2. **Linear Space - $O(n)$**
   * **Explanation:** Memory ki zarurat input size ($n$) ke proportional badhti hai.
   * **Example:** Input array ke elements ko kisi naye array ya list me store karna, ya recursive function ka call stack jo $n$ depth tak jaye.

---

## Quick Comparison Table

| Big O Notation | Name | Example Algorithm / Operation |
| :--- | :--- | :--- |
| $O(1)$ | Constant | Array indexing, Push/Pop in Stack |
| $O(\log n)$ | Logarithmic | Binary Search |
| $O(n)$ | Linear | Simple Loop, Linear Search |
| $O(n \log n)$ | Linearithmic | Merge Sort, Quick Sort |
| $O(n^2)$ | Quadratic | Nested Loops, Bubble Sort |
| $O(2^n)$ | Exponential | Recursive Fibonacci |
| $O(n!)$ | Factorial | Permutations generation |

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone [https://github.com/yuvrajsingh121-er/DSA-Master-Series.git](https://github.com/yuvrajsingh121-er/DSA-Master-Series.git)
