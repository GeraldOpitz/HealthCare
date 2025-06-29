package com.healthtrack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void testActualizarPeso() {
        Usuario user = new Usuario("Maria", 60.0);
        user.actualizarPeso(55.0);
        assertEquals(55.0, user.getPeso(), "Se espera que el peso se actualice correctamente");
    }

    @Test
    public void testActualizarPeso_Error() {
        Usuario user = new Usuario("Miguel", 70.0);
        user.actualizarPeso(65.0);
        assertNotEquals(69.0, user.getPeso(), "Se comprueba que el peso no se actualiza incorrectamente");
    }

}
