package br.univali.cc.poo.app.strategy;

import java.math.BigDecimal;

public class DebitCardPayment implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Valor pago no cartão de débito: R$" + amount);
    }

    @Override
    public Integer getPaymentMethod() {
        return 2;
    }
}
