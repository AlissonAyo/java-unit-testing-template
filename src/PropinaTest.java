import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PropinaTest {

    @Test
    void totalConPropina_calculaPropinaNormal() {
        double obtenido = Propina.totalConPropina(100.0, 10.0);
        assertEquals(110.0, obtenido, 0.000001);
    }

    @Test
    void totalConPropina_sinPropina() {
        double obtenido = Propina.totalConPropina(100.0, 0.0);
        assertEquals(100.0, obtenido, 0.000001);
    }

    @Test
    void totalConPropina_propinaCienPorciento() {
        double obtenido = Propina.totalConPropina(100.0, 100.0);
        assertEquals(200.0, obtenido, 0.000001);
    }

    @Test
    void totalConPropina_subtotalNegativo_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> Propina.totalConPropina(-1.0, 10.0));
    }

    @Test
    void totalConPropina_propinaNegativa_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> Propina.totalConPropina(100.0, -5.0));
    }

    @Test
    void totalConPropina_propinaMayorACien_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> Propina.totalConPropina(100.0, 150.0));
    }
}
