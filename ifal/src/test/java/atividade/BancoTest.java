package atividade;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividade.Banco.SaldoInsuficiente;

public class BancoTest {
    Banco banco;

    @BeforeEach
    public void setUp() {
        banco = new Banco();
    }

    @Test
    public void testSaque() throws SaldoInsuficiente {

        assertEquals(banco.getSaldo(), banco.saque(110));
    }

}