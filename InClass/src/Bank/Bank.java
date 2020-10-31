package Bank;

import BankAccount.Account;
import BankAccount.CheckingAccount;
import BankAccount.SavingsAccount;

import java.util.HashMap;

public class Bank {
    private String name;
    private int safe;
    private HashMap<String, Client> clients;
    private HashMap<Integer, Account> accounts;
    private Integer clientCount = 0;
    private Integer accountCount = 0;

    public Bank(String name){
        this.name = name;
        clients = new HashMap<>();
        accounts = new HashMap<>();
    }

    public void addClient(String firstName, String lastName){
        clientCount+= 1;
        Client newClient = new Client(firstName, lastName, clientCount.toString());
        clients.put(clientCount.toString(), new Client(firstName, lastName, clientCount.toString()));
    }

    public void AddAccount(String clientId){
    Client client = clients.get(clientId);
    Account newAccount = createAccount(client, ++accountCount, startingBal )
    }
    public Account createAccount(Client client, int accountId, int startingBal) {
        switch(accountType){
            case "checking":
                return new CheckingAccount(accountId, startingBal, client);
            default:
                return null;
            case "savings":
                // need interest
        }
    }


//    public SavingsAccount createSavingsAccount(){
//
//    }
//    public CheckingAccount createCheckingAccount(){
//
//    }
}

