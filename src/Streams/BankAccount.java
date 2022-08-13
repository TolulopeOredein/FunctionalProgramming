package Streams;

import java.time.Instant;

public class BankAccount {
    private String firstName;
    private String lasName;
    private String email;
    private String phoneNumber;
    private Integer accountBalance;
    private AccountType accountType;
    private AccountDenomination denomination;
    private Instant dateCreated;
    public BankAccount(String firstName, String lasName, String email, String phoneNumber,
                       Integer accountBalance, AccountType accountType,
                       AccountDenomination denomination, Instant dateCreated) {
        this.firstName = firstName;
        this.lasName = lasName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
        this.denomination = denomination;
        this.dateCreated = dateCreated;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    public AccountDenomination getAccountDenominaton() {
        return denomination;
    }

    public void setAccountDenomination(AccountDenomination denomination) {
        this.denomination = denomination;
    }

    Instant getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", lasName='" + lasName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountType=" + accountType +
                ", denomination=" + denomination +
                ", dateCreated=" + dateCreated +
                '}';
    }
    public boolean firstNameCheck(String firstName){
        this.firstName = firstName;
        return firstName.isEmpty();
    }

    public boolean lastNameCheck(String firstName){
        this.firstName = firstName;
        return firstName.isEmpty();

    }
    public enum AccountType { SAVINGS, CURRENT, FIXED_DEPOSIT, DOMICILIARY_ACCOUNT}
    public enum AccountDenomination { NAIRA, DOLLAR, POUNDS, YEN, SWISS_FRANC}
}
