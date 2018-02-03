package com.dfmzone;

public class Main {



    public static void main(String[] args) {

        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("Diego", "ITAU", "002", 1000, 200.00);
        wallet[1] = new CreditCard("Correa", "ITAU", "322", 1000, 200.00);
        wallet[2] = new CreditCard("Jose", "ITAU", "013", 1000, 200.00);

        for (int i = 1; i <= 16; i++) {
            wallet[0].charge(3*i);
            wallet[1].charge(2 * i);
            wallet[2].charge(i);
        }

        for (CreditCard card: wallet) {
            CreditCard.printSummary(card);
            while (card.getBalance() > 200) {
                card.makePayment(-200);
                System.out.println("New balance " + card.getBalance());
            }
        }
    }

    public void inputAllBaseTypes() {

    }
}
