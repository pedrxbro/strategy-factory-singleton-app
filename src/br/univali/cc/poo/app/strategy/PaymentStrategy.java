package br.univali.cc.poo.app.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    void pay(BigDecimal amount);
    Integer getPaymentMethod();
}
