import Streams.BankAccount;

public class PredicateImpl {
    public static String firstName = "Adeolu";
    public static String lastName = "";
    static Predicate<String> predicate= x-> {
        return x.isEmpty();};

    public static void main(String[] args) {
        System.out.println(predicate.test(firstName));
        System.out.println(predicate.test(lastName));
    }
}
