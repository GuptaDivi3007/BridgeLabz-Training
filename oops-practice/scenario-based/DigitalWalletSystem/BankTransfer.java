public class BankTransfer implements TransferService{

	@Override
    public void transfer(User from, User to, double amount) throws InsufficientBalanceException {
        
        from.getWallet().withdrawMoney(amount);
        System.out.println("Transferred " + amount + " from Wallet to Bank Account of " + to.getName());
    }
}
