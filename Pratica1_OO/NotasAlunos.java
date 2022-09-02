package br.com.aula2.exercicios;
import java.util.Scanner;

public class NotasAlunos {
    private String nome, curso;
    private int matricula, periodo;
	private float notaAV1, notaAV2, notaAVE;

    NotasAlunos (String nome, String curso, int matricula, int periodo, float notaAV1, float notaAV2, float notaAVE) {
        super();
        this.nome = nome;
        this.curso = nome;
        this.matricula = matricula;
        this.periodo = periodo;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAVE = notaAVE;
    }
}