package com.designpatterns.creational.abstractfactorydemo;

public class VisaCardFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD: {
                return new VisaGoldCreditCard();
            }
            case BLACK: {
                return new VisaBlackCreditCard();
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }

}
