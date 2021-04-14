package atividade;

public class Banco {
    private double saldo = 100;

    private double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double novosaldo) {
        this.saldo = novosaldo;
    }

    public double saque(double saque) {
        double saldotemp = getSaldo();
        setSaldo(saldotemp - saque);
        return getSaldo();
    }
}