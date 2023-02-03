/*
 * The function gcd takes two integer parameters a and b and returns the GCD
 * of a and b using the Euclidean algorithm. If b is equal to 0, the function returns a,
 * which is the GCD of a and b. If b is not equal to 0, the function returns the result
 * of gcd(b, a % b), which is the GCD of b and the remainder of the division of a by b.
 */
public class EuclideanAlgorithm_GCD_LCM {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 60;
        int b = 48;
        int gcd = gcd(a, b);
        int lcm = lcm(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }
}

