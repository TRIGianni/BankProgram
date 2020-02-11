package be.heh.bank;

public class BankAccount {
   private double rate = 0.01;
   private int acctNum;
   private int balance = 0;
   private boolean isforeign = false;

   public BankAccount() {
     
   }

   public void setAcctNum(int acctNum){
      this.acctNum = acctNum;
   }

   public int getAcctNum() { 
      return acctNum; 
   }

   public int getBalance() { 
      return balance; 
   }

   public boolean isForeign() {
      return isforeign;
   }

   public void setForeign(boolean b) {
      isforeign = b;
   }

   public void deposit(int amt) {
      balance += amt;
   }

   public boolean hasEnoughCollateral(int loanamt) {
      return balance >= loanamt / 2;
   }

   public String toString() {
      return "Account " + acctNum + ": balance=" + balance 
            + ", is " + (isforeign ? "foreign" : "domestic");
   }

   public void addInterest() {
      balance += (int) (balance * rate);
   }
}
