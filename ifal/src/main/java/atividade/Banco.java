package atividade;

public class Banco {
    private double saldo = 100;

    public class SaldoInsuficiente extends Exception {
        private static final long serialVersionUID = 1L;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double novosaldo) {
        this.saldo = novosaldo;
    }

    public double saque(double saque) throws SaldoInsuficiente {
        if (getSaldo() < saque) {
            throw new SaldoInsuficiente();
        } else {
            double saldotemp = getSaldo();
            setSaldo(saldotemp - saque);
            return getSaldo();
        }
    }
}