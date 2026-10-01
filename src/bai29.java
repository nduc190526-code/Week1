import java.util.Scanner;

 class Product29 {
    private String name;
    private double price;
    private int quantity;
    private double discount;

    private static double taxRate = 0.1;
    private static double totalRevenue = 0;

    public Product29(String name, double price, int quantity, double discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public static void updateTaxRate(double newRate) {
        if (newRate >= 0) {
            taxRate = newRate;
        }
    }

    public double calculateFinalPrice() {
        return (price - discount) * (1 + taxRate);
    }

    public void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= price) {
            this.discount = newDiscount;
        }
    }

    public void sell(int amount) {
        if (amount <= quantity && amount > 0) {
            quantity -= amount;

            double revenue = amount * calculateFinalPrice();
            totalRevenue += revenue;

            System.out.println(
                    "Bán thành công " + amount + " sản phẩm " + name
                            + ". Doanh thu: " + revenue
            );
        } else if (amount > quantity) {
            System.err.println("Không đủ hàng trong kho");
        } else {
            System.err.println("Số lượng mua phải > 0");
        }
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập p1: name price quantity discount");
        String name1 = scanner.nextLine();
        double price1 = scanner.nextDouble();
        int quantity1 = scanner.nextInt();
        double discount1 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Nhập p2: name price quantity discount");
        String name2 = scanner.nextLine();
        double price2 = scanner.nextDouble();
        int quantity2 = scanner.nextInt();
        double discount2 = scanner.nextDouble();

        Product29 p1 = new Product29(name1, price1, quantity1, discount1);
        Product29 p2 = new Product29(name2, price2, quantity2, discount2);

        System.out.print("Số lượng mua p1: ");
        int amount1 = scanner.nextInt();
        p1.sell(amount1);

        System.out.print("Số lượng mua p2: ");
        int amount2 = scanner.nextInt();
        p2.sell(amount2);

        System.out.println("\nGiá cuối trước khi đổi thuế:");
        System.out.println("p1: " + p1.calculateFinalPrice());
        System.out.println("p2: " + p2.calculateFinalPrice());

        Product29.updateTaxRate(0.08);

        System.out.println("\nSau khi giảm VAT xuống 8%:");
        System.out.println("p1: " + p1.calculateFinalPrice());
        System.out.println("p2: " + p2.calculateFinalPrice());

        p1.updateDiscount(10.0);

        System.out.println("\nSau khi p1.updateDiscount(10.0):");
        System.out.println("p1: " + p1.calculateFinalPrice());
        System.out.println("p2: " + p2.calculateFinalPrice());

        System.out.println("\nTổng doanh thu: " + Product29.getTotalRevenue());

        scanner.close();
    }
}
