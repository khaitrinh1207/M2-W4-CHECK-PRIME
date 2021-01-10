public class Main {
    public static void main(String[] args) throws InterruptedException {
        LazyPrimeFactorization LPF = new LazyPrimeFactorization();
        OptimizedPrimeFactorization OPF = new OptimizedPrimeFactorization();
        Thread t1 = new Thread(LPF);
        Thread t2 = new Thread(OPF);
        t1.start();
        t1.join();
        t2.start();
    }
}
