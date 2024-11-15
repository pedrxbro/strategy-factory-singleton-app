package br.univali.cc.poo.app.factory;

import br.univali.cc.poo.app.strategy.PaymentStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

    public class PaymentFactory {
        private final Map<Integer, PaymentStrategy> strategies = new HashMap<>();

        public PaymentFactory(Set<PaymentStrategy> strategySet) {
            strategySet.forEach(s ->strategies.put(s.getPaymentMethod(), s));
        }
        public PaymentStrategy getStrategy(Integer paymentMethod) throws Exception {
            PaymentStrategy strategy = strategies.get(paymentMethod);
            if (strategy == null) {
                throw new Exception("Método de pagamento inválido.");
            }
            return strategy;
        }
    }
