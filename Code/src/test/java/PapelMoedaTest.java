import org.junit.Test;
import static org.junit.Assert.*;

public class PapelMoedaTest {

    @Test
    public void testPapelMoedaValido() {
        PapelMoeda papelMoeda = new PapelMoeda(50, 2);
        assertEquals(50, papelMoeda.getValor());
        assertEquals(2, papelMoeda.getQuantidade());
    }

    @Test
    public void testQuantidadeNegativaNaoPermitida() {
        PapelMoeda papelMoeda = new PapelMoeda(50, -1);
        assertEquals(0, papelMoeda.getQuantidade());
    }
}
