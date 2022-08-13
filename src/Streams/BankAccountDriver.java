package Streams;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BankAccountDriver {
    public static void main(String[] args) {
        List<BankAccount>accounts = Arrays.asList(
                new BankAccount("Adewale","Olusegun","","",55000,
                        BankAccount.AccountType.CURRENT, BankAccount.AccountDenomination.DOLLAR, Instant.now()),
                new BankAccount("","Mohammed","aliumohammed@gmail.com","08028745612",200000,
                        BankAccount.AccountType.DOMICILIARY_ACCOUNT, BankAccount.AccountDenomination.POUNDS, Instant.now()),
                new BankAccount("Oluseyi","Peter","oluseyipeter","08136892345",35000,
                        BankAccount.AccountType.SAVINGS, BankAccount.AccountDenomination.SWISS_FRANC, Instant.now()),
                new BankAccount("Chiamaka","Okoro","chiamakaokoro@gmail.com","09039047821",900000,
                        BankAccount.AccountType.SAVINGS, BankAccount.AccountDenomination.DOLLAR,Instant.now()),
                new BankAccount("Feyi","Bello","feyibello@yahoo.com","08055903456",5000000,
                        BankAccount.AccountType.FIXED_DEPOSIT, BankAccount.AccountDenomination.DOLLAR,Instant.now())
        );
        System.out.println(accounts.get(1));

        List<String>dollarAccounts = accounts.stream()
                .filter(account->account.getAccountDenominaton().equals(BankAccount.AccountDenomination.DOLLAR))
                .filter(account->account.getAccountBalance() >= 900000)
                .map(BankAccount::getFirstName)
                .limit(3)
                .collect(Collectors.toList());
        dollarAccounts.add("Adetona");
        dollarAccounts.add("Anna");
        dollarAccounts.add("Folawiyo");
        dollarAccounts.remove(3);
        System.out.println(dollarAccounts);

         Predicate<BankAccount> predicate= account-> {
            return account.firstNameCheck(account.getFirstName());};
            System.out.println(predicate.test(accounts.get(1)));
    }
}
