package com.designpatterns.creational.abstractfactorydemo;

//Abstract factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if(creditScore > 700) {
            return new AmexCardFactory();
        } else {
            return new VisaCardFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
