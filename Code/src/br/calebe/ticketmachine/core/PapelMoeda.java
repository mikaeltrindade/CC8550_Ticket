package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
    if (valor == 2 || valor == 5 || valor == 10 || valor == 20 || valor == 50 || valor == 100) {
        this.valor = valor;
    } else {
        throw new IllegalArgumentException("Nota inválida: " + valor);
    }
    this.quantidade = quantidade;
    }


    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
