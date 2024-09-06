package br.com.fiap.fintech.controle;

public class Recebimento extends Transacao {

        public Recebimento(double valorTransacao, String data) {
            super(valorTransacao, data);
        }

        public Recebimento(double valorTransacao, String descricao, String data) {
            super(valorTransacao, descricao, data);
        }

        @Override
        public String getresumo() {
            return "Recebimento cadastrado!!\n" + getValorTransacao() + "\n" + getDescricao() + "\n" +getData()+"\n";
        }


    }


