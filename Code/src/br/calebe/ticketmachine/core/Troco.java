package br.calebe.ticketmachine.core;

import java.util.Iterator;

public class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        int[] notas = {100, 50, 20, 10, 5, 2};
        papeisMoeda = new PapelMoeda[notas.length];

        for (int i = 0; i < notas.length; i++) {
            int quantidade = valor / notas[i]; // Calcula quantas cédulas dessa nota são necessárias
            if (quantidade > 0) {
                papeisMoeda[i] = new PapelMoeda(notas[i], quantidade);
                valor -= quantidade * notas[i]; // Atualiza o valor restante
            }
        }

        if (valor > 0) {
            throw new IllegalArgumentException("Não foi possível fornecer troco exato.");
        }
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        private int currentIndex = 0;

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

    public TrocoIterator getTroco() {
    try {
        return new TrocoIterator(this.troco);
    } catch (Exception e) {
        throw new RuntimeException("Erro ao calcular o troco.", e);
    }
    }


        @Override
        public boolean hasNext() {
            return this.papeisMoeda.length > 0 && posicao < this.papeisMoeda.length;
        }


        @Override
        public PapelMoeda next() {
            if (hasNext()) {
                return troco.papeisMoeda[currentIndex++];
            }
            return null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operação não suportada.");
        }
    }
}
