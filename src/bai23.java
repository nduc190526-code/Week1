public class bai23 {
    private int value;

    public bai23(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void swap(bai23 a, bai23 b) {
        bai23 temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        bai23 n1 = new bai23(5);
        bai23 n2 = new bai23(10);

        System.out.println("Trước swap: n1 = " + n1.getValue()
                + ", n2 = " + n2.getValue());

        swap(n1, n2);

        System.out.println("Sau swap: n1 = " + n1.getValue()
                + ", n2 = " + n2.getValue());
        System.out.println("Kết quả không đổi vì Java truyền tham trị.");
    }
}
