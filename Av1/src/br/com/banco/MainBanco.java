package br.com.banco;

public class MainBanco {

    public static void main(String[] args) {
        Corrente cc1 = new Corrente("Belo Horizonte", "MG", "Fernando", "Rua Queluzita", "31080090", 600, 200, 1669, 4);

        cc1.depositar(600);
        System.out.println(cc1.getSaldo());

        cc1.saque(200);
        System.out.println(cc1.getSaldo());

        Poupanca pp1 = new Poupanca("Belo Horizonte", "SP", "Fernando", "Rua Newton", "33156489", 800, 80, 1661, 4);
        
        pp1.depositar(800);
        System.out.println(pp1.getSaldo());

        pp1.saque(80);
        System.out.println(pp1.getSaldo());

    }
}