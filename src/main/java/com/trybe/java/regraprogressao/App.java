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
    String value = scanner.nextLine();
    int qtdAtividades = Integer.parseInt(value);

    String[] nomesAtividades = new String[qtdAtividades];
    double[] pesosAtividades = new double[qtdAtividades];
    double[] notasAtividades = new double[qtdAtividades];

    for (int i = 0; i < qtdAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      nomesAtividades[i] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      pesosAtividades[i] = scanner.nextDouble();
      System.out.println("Digite a nota obtida para " + nomesAtividades[i] + ":");
      notasAtividades[i] = scanner.nextDouble();
    }

    double somaPesos = 0;
    for (double peso : pesosAtividades) {
      somaPesos += peso;
    }

    if (somaPesos != 100) {
      System.out.println("A soma dos pesos deve ser igual a 100. Por favor recomece o programa.");
      System.exit(0);
    }

    double notaFinal = 0;
    for (int i = 0; i < qtdAtividades; i++) {
      notaFinal += notasAtividades[i] * pesosAtividades[i];
    }

    System.out.println("A nota final é: " + notaFinal / 100);

    scanner.close();
  }
}
