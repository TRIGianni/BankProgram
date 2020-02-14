package be.heh.bank;
package be.heh.bank.storage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class BankAccountMemory {

private int nextAcct = 0;

private HashMap<Integer,BankAccount> accounts;

public BankAccountMemory(HashMap<Integer,BankAccount> accounts){
    this.accounts = accounts;
}

public void saveBankAccount(BankAccount bankAccount){
    int acctNum = ++nextAcct;
    bankAccount.setAcctNum(acctNum);
    accounts.put(acctNum,bankAccount);
}

public BankAccount getBankAccount(int acctNum){
    return accounts.get(acctNum);
}

public  Collection<BankAccount> getAllBankAccount(){
    return accounts.values();
}

public int sizeAccounts(){
    return accounts.size();
}


}
