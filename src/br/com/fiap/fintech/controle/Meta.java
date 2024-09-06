package br.com.fiap.fintech.controle;

public class Meta {
    private String nomeMeta;
    private double valorMeta;


    public Meta(String nomeMeta,double valorMeta){
        this.nomeMeta=nomeMeta;
        this.valorMeta=valorMeta;
    }

    public String getNomeMeta() {
        return nomeMeta;
    }

    public void setNomeMeta(String nomeMeta) {
        this.nomeMeta = nomeMeta;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }
}
