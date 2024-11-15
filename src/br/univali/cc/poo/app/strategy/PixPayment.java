package br.univali.cc.poo.app.strategy;

import java.math.BigDecimal;

public class PixPayment implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Valor pago no PIX: R$" + amount);
    }

    @Override
    public Integer getPaymentMethod() {
        return 3;
    }
}
