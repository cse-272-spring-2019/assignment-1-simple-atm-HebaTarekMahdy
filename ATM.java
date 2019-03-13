package atm;

public class ATM {
    private final String cardNumber;
    private double currentBalance=0;
    int transactionIndex=0;
    String[] transType = new String[5];
    double[] transAmount = new double[5];

    public ATM(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public String getCardNumber(){
        return cardNumber;
    }
     
   public double currentBalance(){
        return currentBalance;
    }

    public void withdraw(double amount){
        currentBalance = currentBalance - amount;
        transType[transactionIndex] = "Withdrawal"; 
        transAmount[transactionIndex] = amount; 
        transactionIndex++;
    }
    public void deposit(double amount){
        currentBalance = currentBalance + amount;
        transType[transactionIndex] = "Deposit"; 
        transAmount[transactionIndex] = amount; 
        transactionIndex++;
    }
    
    
}
