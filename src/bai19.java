public class bai19 {
    public int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        int sum=0;
        while(n!=0){
            int tmp=n%10;
            sum+=tmp;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        bai19 s = new bai19();

        int[] tests = {0, 12345, -12345, 999999999, Integer.MIN_VALUE};

        for (int n : tests) {
            System.out.println("sumOfDigits(" + n + ") = " + s.sumOfDigits(n));
        }
    }
}
