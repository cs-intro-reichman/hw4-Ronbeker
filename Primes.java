public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int primeCounter = 0;
        System.out.println("Prime numbers up to " + n + ":");
        boolean[] isPrime = new boolean[n+1];
        for(int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            for(int j = 2; j<isPrime.length;j++) {
                if(j % i == 0 && j != i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i< isPrime.length;i++) {
            if(isPrime[i]) {
                System.out.println(i);
                primeCounter++;
            }
        }
        System.out.println("There are " + primeCounter + " primes between 2 and " + n + " (" + (int)(100 * primeCounter / n) + "% are primes)");
    }
}