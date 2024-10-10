package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valorTicket) {
        this.saldo = 0;
        this.valorTicket = valorTicket;
    }


    public void inserir(int valor) {
    if (valor == 2 || valor == 5 || valor == 10 || valor == 20 || valor == 50 || valor == 100) {
        saldo += valor;
    } else {
        throw new IllegalArgumentException("Valor inserido inválido: " + valor);
    }
    }


    public int getSaldoRestante() {
        return saldo;
    }


    public Iterator<Integer> getTroco() {
        return null;
    }

    public boolean verificarSaldoSuficiente() {
        return saldo >= valorTicket;
    }


    public void imprimir() throws IllegalStateException {
        if (saldo >= valorTicket) {
            // Lógica de impressão do ticket
        } else {
            throw new IllegalStateException("Saldo insuficiente para imprimir o ticket.");
        }
    }

}
