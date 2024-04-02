import java.util.Scanner;
public class primepairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        sc.close();
        int count=0;
        for (int i = s; i <= e; i++) {
            if (isPrime(i)) {
                if(isPrime(i+6))
                {
                    count++;
                    System.out.println("("+i+","+(i+6)+")");
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
