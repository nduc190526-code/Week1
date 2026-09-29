import java.util.Scanner;
public class bai16 {
    public boolean isPrime(int n){
        if(n<=0){
            return false;
        }
        else if(n==1){
            return false;

        }
        for(int i=2;i<n;i++ ){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        bai16 solution=new bai16();
        boolean kq=solution.isPrime(n);
        if(kq){
            System.out.println("la so nguyen to");

        }else System.out.println("khong la so nguyen to");
        v.close();
    }
}
