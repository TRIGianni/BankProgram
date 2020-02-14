package be.heh.bank;
package be.heh.bank.core;

import java.util.*;

public class BankProgram {
   public static void main(String[] args) {
      HashMap<Integer,BankAccount> accounts = new HashMap<>();
      BankAccountMemory bankAccountMemory = new BankAccountMemory(accounts);
      Bank bank = new Bank(bankAccountMemory);
      Scanner scanner = new Scanner(System.in);
      UIConsole client = new UIConsole(scanner, bank);
      client.run();
   }
}
