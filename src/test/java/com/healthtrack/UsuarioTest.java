package com.healthtrack;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        assertEquals(69.0, user.getPeso(), "Se espera un error en la actualizacion del peso");
    }

}
