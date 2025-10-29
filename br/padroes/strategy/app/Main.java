package br.padroes.strategy.app;
 
import br.padroes.strategy.model.Disciplina;
import br.padroes.strategy.strategy.Aritmetica;
import br.padroes.strategy.strategy.Geometrica;
import br.padroes.strategy.strategy.MediaStrategy;
 
public class Main {
 
    public static void main(String[] args) {
        System.out.println("=== TESTE COM ARITMÉTICA ===");
        testarEstrategia(new Aritmetica());
 
        System.out.println("\n=== TESTE COM GEOMÉTRICA ===");
        testarEstrategia(new Geometrica());
    }
 
    private static void testarEstrategia(MediaStrategy estrategia) {
        Disciplina d = new Disciplina(estrategia);
        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();
 
        System.out.printf("Disciplina: %s%n", d.getNome());
        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
    }
}