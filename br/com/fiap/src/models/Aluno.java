package br.com.fiap.src.models;

import java.util.Random;

public class Aluno {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAulasTeoricas() {
        return aulasTeoricas;
    }

    public void setAulasTeoricas(int aulasTeoricas) {
        this.aulasTeoricas = aulasTeoricas;
    }

    public int getAulasPraticas() {
        return aulasPraticas;
    }

    public void setAulasPraticas(int aulasPraticas) {
        this.aulasPraticas = aulasPraticas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    private int idade;
    private int aulasTeoricas;
    private int aulasPraticas;
    private boolean aprovado = false;


    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void agendarAulaTeorica() {
        this.aulasTeoricas += 1;
    }

    public void agendarAulaPratica() {
        this.aulasPraticas += 1;
    }

    public void cancelarAulaTeorica() {
        this.aulasTeoricas -= 1;
    }

    public void cancelarAulaPratica() {
        this.aulasPraticas -= 1;
    }

    public void realizarExame() {
        if (aulasPraticas >= 5 || aulasTeoricas >= 5) {
            Random choice = new Random();
            boolean escolha = choice.nextBoolean();
            this.aprovado = escolha;
        } else {
            System.out.printf("Você não fez o minimo de aulas praticas e teoricas para realizar o exame");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Idade: " + idade);
        System.out.println("Aulas Teóricas: " + aulasTeoricas);
        System.out.println("Aulas Práticas: " + aulasPraticas);
        System.out.println("Aprovado: " + (aprovado ? "Sim" : "Não"));
    }
}
