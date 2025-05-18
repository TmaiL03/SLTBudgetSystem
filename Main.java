public class Main {
    
    public static void main(String[] args) {
        
        // Testing the creation of a category and using its methods. (Less the interaction with the Transaction class.)
        Category category = new Category("Rent", 1000.00f, Category.type.EXPENSE);

        System.out.println("Category Name: " + category.getName());
        System.out.println("Category Amount: " + category.getAmount());
        System.out.println("Category Type: " + category.getType());

    }
}
