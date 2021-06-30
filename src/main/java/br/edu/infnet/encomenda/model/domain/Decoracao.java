package br.edu.infnet.encomenda.model.domain;

public class Decoracao extends Artesanato{
    private String tipo;
    private int qtdPecasConjunto;
    private boolean vidro;

    public Decoracao(String nome, float preco, boolean proprio) {
        super(nome, preco, proprio);
    }

    public Decoracao(String tipo, int qtdPecasConjunto, boolean vidro){
        super();
        this.tipo = tipo;
        this.qtdPecasConjunto = qtdPecasConjunto;
        this.vidro = vidro;
    }

    @Override
    public float calcularValorFinal() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(this.tipo);
        sb.append(";");
        sb.append(this.qtdPecasConjunto);
        sb.append(";");
        sb.append(this.vidro ? "Sim" : "Não");

        return sb.toString();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtdPecasConjunto() {
        return qtdPecasConjunto;
    }

    public void setQtdPecasConjunto(int qtdPecasConjunto) {
        this.qtdPecasConjunto = qtdPecasConjunto;
    }

    public boolean isVidro() {
        return vidro;
    }

    public void setVidro(boolean vidro) {
        this.vidro = vidro;
    }
}
