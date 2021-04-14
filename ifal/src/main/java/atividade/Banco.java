package atividade;

public class Banco {
    private double saldo;

    

    public class SaldoInsuficiente extends Exception{
        private static final long serialVersionUID = 1L;
    }

    public class ValorNegativo extends Exception{
        private static final long serialVersionUID = 1L;
    }

    public void deposito (double deposito) throws ValorNegativo {
        
    } 

    public void saque (double saque) {
        return ;
    }   
}