package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int qtdAtividades = Integer.parseInt(scanner.next());

    String[] nomesAtividades = new String[qtdAtividades];
    double[] pesosAtividades = new double[qtdAtividades];
    double[] notasAtividades = new double[qtdAtividades];
    double somaPesos = 0;

    for (int i = 0; i < qtdAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      String nome = scanner.next();
      nomesAtividades[i] = nome;
      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      String peso = scanner.next();
      pesosAtividades[i] = Integer.parseInt(peso);
      System.out.println("Digite a nota obtida para " + nome + ":");
      String nota = scanner.next();
      notasAtividades[i] = Integer.parseInt(nota);
      somaPesos += Integer.parseInt(peso);
    }

    if (somaPesos != 100.0d) {
      // System.out.println("A soma dos pesos deve ser igual a 100. Por favor recomece o
      // programa.");
      System.exit(0);
      scanner.close();
    }

    double nota = 0;
    for (int i = 0; i < qtdAtividades; i++) {
      nota += notasAtividades[i] * pesosAtividades[i];
    }

    double notaFinal = nota / 100.0d;

    if (notaFinal > 85.0d) {
      System.out.println("Parabéns! Você alcançou " + notaFinal
          + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, " + notaFinal
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }

    // System.out.println("A nota final é: " + notaFinal);

    scanner.close();
  }
}
