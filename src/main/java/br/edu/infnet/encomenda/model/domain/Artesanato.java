package br.edu.infnet.encomenda.model.domain;

import br.edu.infnet.encomenda.model.exceptions.DificuldadeBolsaZeradaException;
import br.edu.infnet.encomenda.model.exceptions.QtdAcessorioZeradaOuNegativaException;
import br.edu.infnet.encomenda.model.exceptions.QtdPecasConjuntoDecoracaoZeradaOuNegativaException;

public abstract class Artesanato {
    private String nome;
    private float valorBase;
    private boolean proprio;

    public Artesanato(){

    }
    public Artesanato(String nome, float valorBase, boolean proprio) {
        this.nome = nome;
        this.valorBase = valorBase;
        this.proprio = proprio;
    }

    public String selecionarItemArtesanato() throws QtdAcessorioZeradaOuNegativaException, QtdPecasConjuntoDecoracaoZeradaOuNegativaException, DificuldadeBolsaZeradaException {

        StringBuilder sb = new StringBuilder();
        sb.append(this.nome);
        sb.append(";");
        sb.append(this.proprio ? "Idelma Criações" : "Outro fornecedor");
        sb.append(";");
        sb.append(this.calcularValorFinal());
        sb.append("\r\n");

        return sb.toString();
    }

    public abstract float calcularValorFinal() throws DificuldadeBolsaZeradaException;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nome);
        sb.append(";");
        sb.append(this.valorBase);
        sb.append(";");
        sb.append(this.proprio ? "Sim" : "Não");

        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public float getValorBase() {
        return valorBase;
    }

    public boolean isProprio() {
        return proprio;
    }
}
