package br.com.aula2.exercicios;

public class NotasAlunos {
    private String nome, curso;
    private int matricula, periodo;
	private float notaAV1, notaAV2, notaAVE;

    public NotasAlunos (String nome, String curso, int matricula, int periodo, float notaAV1, float notaAV2, float notaAVE) {
        super();
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.periodo = periodo;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAVE = notaAVE;
    }
    public void alteraNotaAV1 (float nota) {
        this.notaAV1 = nota;
    }
    public void alteraNotaAV2 (float nota) {
        this.notaAV2 = nota;
    }
    public void alteraNotaAVE (float nota) {
        this.notaAVE = nota;
    }
}