package com.salahbkd.advanced.exceptions;

public class Compte {
    private float balance = 0;

    public void withdraw(float amount) throws CompteException {
        if (amount > balance) {
            /*chaining exception with initCause() method*/
//			SoldeMakafichException soldeException = new SoldeMakafichException("walou solde...");
//			CompteException comptException = new CompteException();
//			comptException.initCause(soldeException);
//			throw comptException;

            /*Chaining exceptions with the constructor*/
            throw new CompteException(new SoldeMakafichException());
        }

    }
}
