package br.com.fiap.fintech.view;

import br.com.fiap.fintech.controle.*;


public class Main {

    public static void main(String[] args){
        Login login = new Login("Nathan","555027" );
        System.out.println("Bem vindo " + login.getUsername());

        Recebimento recebimento = new Recebimento(270.25,"Salário","20/03/2024");
        System.out.println(recebimento.getresumo());

        Gastos gastos = new Gastos(300.00,"Mercado","20/03/2024");
        System.out.println(gastos.getresumo());

        Meta meta = new Meta("Carro novo",22.554);
        System.out.println("Meta adicionada!!\n" + meta.getNomeMeta() + "\n" + meta.getValorMeta()+ "\n");

        Investimento investimento = new Investimento("CDB","Renda Fixa",250.00,
        "20/05/2024","31/10/2025");
        System.out.println("Investimento adicionada!!\n" + investimento.getTipo() + "\n" + investimento.getNomeInvestimento()+ "\n"+
        investimento.getValorInvestimento()+ "\n"+ "Compra:"+investimento.getDataInvestimento()+ "\n"+"Vencimento:"+ investimento.getDataVencimento());


    }

}