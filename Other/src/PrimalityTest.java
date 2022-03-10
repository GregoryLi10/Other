/* 
 * Miller-Rabin's Primality Test 
 * 
 * Sieve of Eratosthenes: the first ever way to find prime numbers
 * it has a run time of O(sqrt(n)) or just O(n) where it runs through all primes from 2 to sqrt of n 
 * (essentially testing if every number is prime and "crossing it out")
 * it is the most efficient method for numbers below 10 million
 * 
 * Miller-Rabin's method runs in O(k(log(n))) or just O(log(n)) where k is the number of iterations
 * the first iteration will give a 3/4 chance of being correct, every iteration will increase the likelihood exponentially
 */

public class PrimalityTest {
    static int power(int x, int y, int p) {
         
        int res = 1; // Initialize result
         
        //Update x if it is more than or
        // equal to p
        x = x % p;
        System.out.println(x+" "+y+" "+p);
        while (y > 0) {
             
            // If y is odd, multiply x with result
            if ((y & 1) == 1)
                res = (res * x) % p;
         
            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        System.out.println(res);
        return res;
    }
     
    // This function is called for all k trials.
    // It returns false if n is composite and
    // returns false if n is probably prime.
    // d is an odd number such that d*2<sup>r</sup>
    // = n-1 for some r >= 1
    static boolean miillerTest(int d, int n) {
         
        // Pick a random number in [2..n-2]
        // Corner cases make sure that n > 4
        int a = 2 + (int)(Math.random() % (n - 4));
     
        // Compute a^d % n
        int x = power(a, d, n);
     
        if (x == 1 || x == n - 1)
            return true;
     
        // Keep squaring x while one of the
        // following doesn't happen
        // (i) d does not reach n-1
        // (ii) (x^2) % n is not 1
        // (iii) (x^2) % n is not n-1
        while (d != n - 1) {
            x = (x * x) % n;
            d *= 2;
         
            if (x == 1)
                return false;
            if (x == n - 1)
                return true;
        }
     
        // Return composite
        return false;
    }
     
    // It returns false if n is composite
    // and returns true if n is probably
    // prime. k is an input parameter that
    // determines accuracy level. Higher
    // value of k indicates more accuracy.
    static boolean isPrime(int n, int k) {
        // Corner cases
        if (n <= 1 || n == 4) return false;
        if (n <= 3) return true;
     
        // Find r such that n = 2^d * r + 1; r >= 1
        int d = n - 1;
         
        while (d % 2 == 0)
            d /= 2;
        // Iterate given number of 'k' times
        for (int i = 0; i < k; i++)
            if (!miillerTest(d, n))
                return false;
     
        return true;
    }
    
    public static void main(String args[]) {
         
        int k = 5; // Number of iterations, each iteration is 3/4 more accurate
        System.out.println(isPrime(70001,k));
        
        //primes less than n
//        for (int n = 70000; n < 100000; n++)
//            if (isPrime(n, k)) System.out.print(n + " ");
    }
}

