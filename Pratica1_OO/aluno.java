package br.com.aula2.exercicios;

public class Main {
    public static void main(String [] args) {
        Aluno aluno1 = new Aluno("Ana","SI",123,3,20,30,0);
        System.out.println(aluno1.avaliarAluno);
        System.out.println(aluno1.avaliarRecuperacao);
        aluno.alteranotaAVE(70);
        System.out.println("Alterar nota da Prova Especial");
        System.out.println(aluno1.avaliarRecuperacao);
    }
}