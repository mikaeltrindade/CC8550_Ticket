import org.junit.Test;
import static org.junit.Assert.*;

public class TicketMachineTest {

    @Test
    public void testSaldoInicial() {
        TicketMachine tm = new TicketMachine(100);
        assertEquals(0, tm.getSaldo());
    }

    @Test
    public void testInserirValorValido() {
        TicketMachine tm = new TicketMachine(100);
        tm.inserir(50);
        assertEquals(50, tm.getSaldo());
    }

    @Test(expected = PapelMoedaInvalidaException.class)
    public void testInserirValorInvalido() throws PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(100);
        tm.inserir(3);  // Valor que não é aceito
    }

    @Test
    public void testImprimirBilhete() throws PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(100);
        tm.inserir(100);
        assertEquals("************\n*** R$ 100,00 ***\n************\n", tm.imprimir());
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void testImprimirComSaldoInsuficiente() throws SaldoInsuficienteException, PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(100);
        tm.inserir(50);  // Inserindo menos do que o necessário
        tm.imprimir();   // Deve lançar uma exceção
    }
}
