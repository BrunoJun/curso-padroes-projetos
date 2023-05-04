package proxy.exemplo1.bank.services;

public class ATM implements BankOperations{

    private BankOperations bankOperations;

    public ATM(BankOperations bankOperations) {

        this.bankOperations = bankOperations;
    }

    @Override
    public void deposit(Long account, Long amount) {

        System.out.println("ATM proxy sending request to bank");
        bankOperations.deposit(account, amount);
    }

    @Override
    public void withdraw(Long account, String passwd, Long amount) {

        if(amount > 300) {
            System.out.println("You may not withdraw amounts over 300 here");
            return;
        }
        System.out.println("ATM proxy sending request to bank");
        bankOperations.withdraw(account, passwd, amount);
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {

        System.out.println("You must go to the bank to perform this operation");
        return;
    }
}
