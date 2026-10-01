 class Inventory {
    private Product[] items;

    public Inventory(Product[] initialItems) {
        // Deliberately shallow copy to demonstrate the exercise.
        this.items = initialItems;
    }

    public void printItems() {
        for (Product p : items) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Product[] arr = {
                new Product(1, "Laptop", 1000),
                new Product(2, "Mouse", 20)
        };

        Inventory kho = new Inventory(arr);

        System.out.println("Trước khi sửa arr[0]:");
        kho.printItems();

        arr[0].setPrice(5000);

        System.out.println("\nSau khi arr[0].setPrice(5000):");
        kho.printItems();

        System.out.println(
                "\nKết quả: Inventory cũng thay đổi vì mảng và Product đang dùng chung reference."
        );
    }
}
 class Product {
     private int id;
     private String name;
     private double price;

     public Product(int id, String name, double price) {
         this.id = id;
         this.name = name;
         this.price = price;
     }

     public int getId() { return id; }
     public String getName() { return name; }
     public double getPrice() { return price; }

     public void setPrice(double price) {
         this.price = price;
     }

     @Override
     public String toString() {
         return id + " - " + name + " - $" + price;
     }
 }

