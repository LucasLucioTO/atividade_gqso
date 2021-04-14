package atividade;

public class Banco {
    private double saldo = 100;

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double novosaldo) {
        this.saldo = novosaldo;
    }

    public double saque(double saque) {
        if (getSaldo() < saque) {
            return getSaldo();
        } else {
            double saldotemp = getSaldo();
            setSaldo(saldotemp - saque);
            return getSaldo();
        }
    }
}