package br.edu.infnet.encomenda.model.domain;

public class Acessorio extends Artesanato {
    private String tipo;
    private int quantidade;
    private float desconto;


    public Acessorio(String nome, float preco, boolean proprio) {
        super(nome, preco, proprio);
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
        sb.append(this.quantidade);
        sb.append(";");
        sb.append(this.desconto);

        return sb.toString();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanho() {
        return quantidade;
    }

    public void setTamanho(int tamanho) {
        this.quantidade = tamanho;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}
