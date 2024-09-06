package br.com.fiap.fintech.controle;

public class Investimento {
    private String tipo;
    private String nomeInvestimento;
    private double valorInvestimento;
    private String dataInvestimento;
    private String dataVencimento;

    public Investimento(String tipo,String nomeInvestimento,double valorInvestimento,String dataInvestimento,String dataVencimento){
        this.tipo=tipo;
        this.nomeInvestimento=nomeInvestimento;
        this.valorInvestimento=valorInvestimento;
        this.dataInvestimento=dataInvestimento;
        this.dataVencimento=dataVencimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeInvestimento() {
        return nomeInvestimento;
    }

    public void setNomeInvestimento(String nomeInvestimento) {
        this.nomeInvestimento = nomeInvestimento;
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public String getDataInvestimento() {
        return dataInvestimento;
    }

    public void setDataInvestimento(String dataInvestimento) {
        this.dataInvestimento = dataInvestimento;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}

