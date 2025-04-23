package bacha.com;

public class NumberUtil {
    public int power(int base, int exponent) {
        if (exponent < 0)
            throw new IllegalArgumentException("Negative exponent not supported");
        int result = 1;
        for (int i = 0; i < exponent; i++)
            result *= base;
        return result;
    }

    public int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int gcd(int a, int b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Only positive integers allowed");
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public int countFactors(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Positive numbers only");
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += (i * i == n) ? 1 : 2;
            }
        }
        return count;
    }
}

