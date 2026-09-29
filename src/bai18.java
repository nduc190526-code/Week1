public class bai18 {
    public boolean isPalindrome(int n){
        if(n<0) return false;
        int reversed=0;
        int o=n;
        while (n!=0){
            int digit = n%10;
            reversed=reversed*10+digit;
            n/=10;
        }
        return o==reversed;
    }
    public static void main(String[] args){
        bai18 s= new bai18();
        int[] tests = {0, 1, 121, -121, 1221, 123,
                10, 1001, 2147447412};
        for (int n : tests) {
            System.out.println(n + " -> " + s.isPalindrome(n));
        }
    }
}
