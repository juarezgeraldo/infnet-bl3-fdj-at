package br.edu.infnet.appArtesanato.model.domain;

import br.edu.infnet.appArtesanato.model.exceptions.DificuldadeBolsaZeradaException;
import br.edu.infnet.appArtesanato.model.exceptions.QtdAcessorioZeradaOuNegativaException;
import br.edu.infnet.appArtesanato.model.exceptions.QtdPecasConjuntoDecoracaoZeradaOuNegativaException;
import br.edu.infnet.appArtesanato.model.exceptions.DivergenciaNosAcessorios;

import java.text.DecimalFormat;

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

    public String selecionarItemArtesanato() throws QtdAcessorioZeradaOuNegativaException, QtdPecasConjuntoDecoracaoZeradaOuNegativaException, DificuldadeBolsaZeradaException, DivergenciaNosAcessorios {

        DecimalFormat formato = new DecimalFormat("R$ #,##0.00");

        StringBuilder sb = new StringBuilder();
        sb.append(this.nome);
        sb.append(";");
        sb.append(this.proprio ? "Idelma Criações" : "Outro fornecedor");
        sb.append(";");
        sb.append(formato.format(this.calcularValorFinal()));
        sb.append("\r\n");

        return sb.toString();
    }

    public abstract float calcularValorFinal() throws DificuldadeBolsaZeradaException, QtdPecasConjuntoDecoracaoZeradaOuNegativaException, QtdAcessorioZeradaOuNegativaException, DivergenciaNosAcessorios;

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
