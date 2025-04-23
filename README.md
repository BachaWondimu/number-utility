# 🔢 NumberUtils – Java Math Utility Library with JUnit Tests

This project provides a **lightweight Java utility class** called `NumberUtils`, containing stateless, reusable methods for solving **common number-based problems**. It's a perfect practice ground for **algorithm thinking**, **clean method design**, and **JUnit 5 test writing**.

---

## 🎯 Purpose

- Sharpen your understanding of number operations and simple math algorithms
- Practice Test-Driven Development (TDD) using **JUnit 5**

---

## 📦 What's Included?

### ✅ `NumberUtils.java`
A pure utility class (no state) with methods that perform mathematical logic:

| Method              | Description                                  |
|---------------------|----------------------------------------------|
| `power(int, int)`   | Calculates base raised to exponent           |
| `sumOfDigits(int)`  | Returns sum of all digits of a number        |
| `gcd(int, int)`     | Returns Greatest Common Divisor              |
| `lcm(int, int)`     | Calculates Least Common Multiple             |
| `countFactors(int)` | Counts all positive divisors of a number     |

Each method is input-validated and throws exceptions on invalid input where necessary.

---

## 🧪 Unit Tests

### ✅ `NumberUtilsTest.java`

A full suite of **JUnit 5** tests is provided to verify each method’s correctness and edge cases.

#### Sample test cases:
```java
@Test
void testPower() {
    assertEquals(27, NumberUtils.power(3, 3));
    assertThrows(IllegalArgumentException.class, () -> NumberUtils.power(2, -1));
}

@Test
void testSumOfDigits() {
    assertEquals(6, NumberUtils.sumOfDigits(123));
}

@Test
void testLCM() {
    assertEquals(20, NumberUtils.lcm(4, 5));
}

@Test
void testCountFactors() {
    assertEquals(6, NumberUtils.countFactors(28)); // 1, 2, 4, 7, 14, 28
}
