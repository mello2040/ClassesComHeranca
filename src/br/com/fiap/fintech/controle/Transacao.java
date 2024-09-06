package br.com.fiap.fintech.controle;

public abstract class Transacao {
    private double valorTransacao;
    private String descricao;
    private String data ;

    public Transacao (double valorTransacao,String data){
        this.valorTransacao=valorTransacao;
        this.data=data;

    }

    public Transacao (double valorTransacao,String descricao,String data){
        this.valorTransacao=valorTransacao;
        this.data=data;
        this.descricao=descricao;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public abstract String getresumo();

}