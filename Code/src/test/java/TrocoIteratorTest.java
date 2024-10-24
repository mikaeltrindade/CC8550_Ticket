import org.junit.Test;
import static org.junit.Assert.*;

public class TrocoIteratorTest {

    @Test
    public void testTrocoIteratorSemCédulas() {
        Troco troco = new Troco(0);
        TrocoIterator iterator = new TrocoIterator(troco);
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testTrocoIteratorComCédulas() {
        Troco troco = new Troco(100);
        TrocoIterator iterator = new TrocoIterator(troco);
        assertTrue(iterator.hasNext());
        assertNotNull(iterator.next());
    }
}
