package be.heh.bank;

import java.util.*;

public class Bank {

   private BankAccountMemory bankAccountMemory;  

   public Bank(BankAccountMemory bankAccountMemory) {
      this.bankAccountMemory = bankAccountMemory;
   }

   public int newAccount(boolean isforeign) {
      
      BankAccount ba = new BankAccount();
      ba.setForeign(isforeign);
      bankAccountMemory.saveBankAccount(ba);
      return ba.getAcctNum();
   }

   public int getBalance(int acctNum) {
      BankAccount ba = bankAccountMemory.getBankAccount(acctNum);
      return ba.getBalance();
   }

   public void setForeign(int acctNum, boolean isforeign) {
      BankAccount ba = bankAccountMemory.getBankAccount(acctNum);
      ba.setForeign(isforeign);
   }

   public void deposit(int acctNum, int amt) {
      BankAccount ba = bankAccountMemory.getBankAccount(acctNum);
      ba.deposit(amt);
   }

   public boolean authorizeLoan(int acctNum, int loanamt) {
      BankAccount ba = bankAccountMemory.getBankAccount(acctNum);
      return ba.hasEnoughCollateral(loanamt);
   }

   public String toString() {
      String result = "The bank has " + bankAccountMemory.sizeAccounts() + " accounts.";
      for (BankAccount ba : bankAccountMemory.getAllBankAccount())
         result += "\n\t" + ba.toString();
      return result;
   }

   public void addInterest() {
      for (BankAccount ba : bankAccountMemory.getAllBankAccount())
         ba.addInterest();
   }
}



