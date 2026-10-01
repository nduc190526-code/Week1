 class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;

        return title.equals(other.title)
                && author.equals(other.author)
                && Double.compare(price, other.price) == 0;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        long bits = Double.doubleToLongBits(price);
        result = 31 * result + (int) (bits ^ (bits >>> 32));
        return result;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basic", "Nguyen Van A", 100.0);
        Book b2 = new Book("Java Basic", "Nguyen Van A", 100.0);

        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b1.equals(b2): " + b1.equals(b2));
    }
}

