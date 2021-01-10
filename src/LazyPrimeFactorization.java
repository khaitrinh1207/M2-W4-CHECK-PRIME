import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable{
    public static boolean isPrimeNumber(int n){
        if ( n < 2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i < squareRoot; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    @Override
    public void run() {
        System.out.println("Nhập giới hạn n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" Tất cả các số nguyên tố nhỏ hơn n :");
        if( n >= 2){
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (isPrimeNumber(i)){
                System.out.print(" "+i);
            }
        }
    }
}
