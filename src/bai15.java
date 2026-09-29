import java.util.Scanner;

public class bai15 {

    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int a = v.nextInt();
        int b = v.nextInt();
        bai15 solution = new bai15();
        int result = solution.gcd(a, b);
        System.out.println(result);
        v.close();
    }
}