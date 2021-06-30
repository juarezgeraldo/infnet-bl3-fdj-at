package br.edu.infnet.encomenda.model.domain;

import java.time.LocalDateTime;

public class Encomenda {
    private LocalDateTime data;
    private boolean feira;
    private String observacao;

    public Encomenda(LocalDateTime data, boolean feira, String observacao) {
        this.data = data;
        this.feira = feira;
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.data);
        sb.append(";");
        sb.append(this.feira ? "Pela Feira" : "Pelo Telefone");
        sb.append(";");
        sb.append(this.observacao);
        sb.append(";");
        return sb.toString();
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isFeira() {
        return feira;
    }

    public void setFeira(boolean feira) {
        this.feira = feira;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
