package br.padroes.strategy.model;

import br.padroes.strategy.strategy.MediaStrategy;

//Classe que representa uma disciplina e usa Strategy para calcular média
 
public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private MediaStrategy estrategia;
    
    //Construtor que recebe a estratégia de cálculo
    public Disciplina(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
    
    //Calcula a média usando a estratégia injetada
    public void calcularMedia() {
    	this.media = estrategia.calcularMedia(this.p1, this.p2);
        this.situacao = estrategia.verificarSituacao(this.media);
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public double getP1() {
        return p1;
    }
 
    public void setP1(double p1) {
        if (p1 < 0 || p1 > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
        this.p1 = p1;
    }
 
    public double getP2() {
        return p2;
    }
 
    public void setP2(double p2) {
        if (p2 < 0 || p2 > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
        this.p2 = p2;
    }
 
    public double getMedia() {
        return media;
    }
 
    public String getSituacao() {
        return situacao;
    }
}