import java.util.ArrayList;

public class Category extends Record {

    // Attributes.
    public ArrayList<Transaction> history;
    public type categoryType;

    // Enumerated category type.
    public enum type {
        INCOME,
        EXPENSE
    }

    // Constructor.
    Category(String name, float amount, type categoryType) {

        super(name, amount);
        this.history = new ArrayList<Transaction>();
        this.categoryType = categoryType;

    }

    // Returns transaction history.
    public ArrayList<Transaction> getHistory() {

        return history;

    }

    // Adds a transaction to history.
    public void addTransaction(Transaction transaction) {

        history.add(transaction);

    }

    // Removes a transaction from history.
    public void removeTransaction() {


        
    }

    // Retrieves the type of category.
    public type getType() {

        return categoryType;

    }

}