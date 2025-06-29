package com.healthtrack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioRegresionTest {

    private Usuario user;

    @BeforeEach
    public void setUp() {
        user = new Usuario("Regresion", 100.0);
    }

    @Test
    public void testPesoCorrecto() {
        user.actualizarPeso(75.0);

        assertEquals(75.0, user.getPeso(), "El peso no se actualizo correctamente");

    }

    @Test
    public void testPesoDecreseMismoValor() {
        double pesoInicial = user.getPeso();
        user.actualizarPeso(pesoInicial);
        assertEquals(pesoInicial, user.getPeso(), "El peso no debe cambiar si se actualiza con el mismo valor");
    }

    @Test
    public void testPesoDescuentaUnKilo() {
        double pesoInicial = user.getPeso();
        user.actualizarPeso(75.0);
        assertEquals(pesoInicial - 1, user.getPeso(), "El peso no debe decrecer en 1kg");

    }
}
