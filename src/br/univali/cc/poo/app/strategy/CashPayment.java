package br.univali.cc.poo.app.strategy;

import java.math.BigDecimal;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Valor pago em dinheiro: R$ " + amount);
    }

    public Integer getPaymentMethod() {
        return 0;
    }
}
