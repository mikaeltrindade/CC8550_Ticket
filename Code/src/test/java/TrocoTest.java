import org.junit.Test;
import static org.junit.Assert.*;

public class TrocoTest {

    @Test
    public void testTrocoZerado() {
        Troco troco = new Troco(0);
        assertNull(troco.getProximo());
    }

    @Test
    public void testTrocoValido() {
        Troco troco = new Troco(150);
        assertNotNull(troco.getPapeisMoeda());
        assertEquals(3, troco.getPapeisMoeda().length);  // Verifica se há 3 cédulas no troco
    }
}
