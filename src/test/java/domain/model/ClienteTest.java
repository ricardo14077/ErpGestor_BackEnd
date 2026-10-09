package domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class ClienteTest {

    @Test
    void deveCriarClienteComId() {

        Cliente cliente = new Cliente();

        assertNotNull(cliente.getId());
    }
    @Test
    void deveCriarClientesComIdsDiferentes() {

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        assertNotEquals(
                cliente1.getId(),
                cliente2.getId()
        );
    }
}