public class bai21 {
    protected String accountNumber;
    private  double balance;
    private String ownerName;
    public bai21(String accountNumber,String ownerName){
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        this.balance=0;
    }
    public bai21(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance < 0) {
            System.err.println("Số dư không thể âm. Đặt số dư = 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp tiền thành công: " + amount);
        } else {
            System.err.println("Số tiền nạp phải > 0.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public static void main(String[] args) {
        bai21 account =
                new bai21("AC001", "Nguyen Van A", 1000);

        account.deposit(-100);
        System.out.println("Số dư: " + account.getBalance());

        System.out.println("Rút 1500: " + account.withdraw(1500));
        System.out.println("Số dư: " + account.getBalance());

        System.out.println("Rút 300: " + account.withdraw(300));
        System.out.println("Số dư: " + account.getBalance());

        account.deposit(500);
        System.out.println("Số dư cuối: " + account.getBalance());
    }
}

