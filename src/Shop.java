
public class Shop {
    public static void main(String[] args) {
        Product watch = new Product("Orient", "RC-65", 500000);

        Category accessories  = new Category("Watches");
        accessories.addProduct(watch);

        User ani = new User("Ani Manukyan", "animanukyan@gmail.com", "+37478458989");

        Registration register = new Registration();
        register.createAccount(ani);

    }
}
