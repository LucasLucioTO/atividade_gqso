package atividade;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividade.Banco.SaldoInsuficiente;
import atividade.Banco.ValorNegativo;

public class BancoTest {
    Banco banco;

    @Test
    public void testSaque() {
        assertEquals(100, banco.saque(100));
    }

}