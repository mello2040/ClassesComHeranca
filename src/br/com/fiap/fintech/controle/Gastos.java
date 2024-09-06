package br.com.fiap.fintech.controle;

public class Gastos extends Transacao {

    public Gastos(double valorTransacao, String data) {
        super(valorTransacao, data);
    }

    public Gastos(double valorTransacao, String descricao, String data) {
        super(valorTransacao, descricao, data);
    }

    @Override
    public String getresumo() {
        return "Gasto cadastrado!!\n" + getValorTransacao() + "\n" + getDescricao() + "\n" +getData()+"\n";
    }


}
