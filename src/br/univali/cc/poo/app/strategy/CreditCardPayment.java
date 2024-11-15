package br.univali.cc.poo.app.strategy;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Valor pago no cartão de crédito: R$" + amount);
    }

    @Override
    public Integer getPaymentMethod() {
        return 1;
    }
}
