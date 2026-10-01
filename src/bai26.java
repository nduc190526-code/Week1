 class Account {
    private final String accountId;
    private double balance;
    private Transaction[] history;
    private int transactionCount;

    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
        this.history = new Transaction[10];
        this.transactionCount = 0;
    }

    public void addTransaction(Transaction t) {
        if (t == null) return;

        if (transactionCount == history.length) {
            Transaction[] newHistory =
                    new Transaction[history.length * 2];

            for (int i = 0; i < history.length; i++) {
                newHistory[i] = history[i];
            }
            history = newHistory;
        }

        history[transactionCount++] = t;
    }
    public Transaction[] getHistory() {
        Transaction[] copy = new Transaction[transactionCount];

        for (int i = 0; i < transactionCount; i++) {
            copy[i] = history[i];
        }

        return copy;
    }

    public void printHistory() {
        for (int i = 0; i < transactionCount; i++) {
            Transaction t = history[i];
            System.out.println(t.getTransactionId() + " | "
                    + t.getAmount() + " | " + t.getTimestamp());
        }
    }
    public static void main(String[] args) {
        Account account = new Account("ACC01", 1000);

        account.addTransaction(
                new Transaction("T001", 500, "2026-09-26 10:00"));

        Transaction[] hackerHistory = account.getHistory();
        hackerHistory[0] = null;
        System.out.println("Lịch sử gốc sau khi hacker sửa:");
        account.printHistory();

    }
}
 final class Transaction {
     private final String transactionId;
     private final double amount;
     private final String timestamp;

     public Transaction(String transactionId, double amount, String timestamp) {
         this.transactionId = transactionId;
         this.amount = amount;
         this.timestamp = timestamp;
     }

     public String getTransactionId() {
         return transactionId;
     }

     public double getAmount() {
         return amount;
     }

     public String getTimestamp() {
         return timestamp;
     }
 }
