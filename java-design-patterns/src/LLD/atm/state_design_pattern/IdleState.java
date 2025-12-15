package LLD.atm.state_design_pattern;

import LLD.atm.dto.ATM;
import LLD.atm.dto.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }

}
