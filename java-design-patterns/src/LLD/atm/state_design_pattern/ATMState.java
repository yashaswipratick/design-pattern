package LLD.atm.state_design_pattern;

import LLD.atm.dto.ATM;
import LLD.atm.dto.Card;
import LLD.atm.dto.TransactionType;

public class ATMState {

    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin){
        System.out.println("OOPS!! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType txnType){
        System.out.println("OOPS!! Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount){
        System.out.println("OOPS!! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card){
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard(){
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(ATM atm){
        System.out.println("OOPS!! Something went wrong");
    }

}
