package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
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
