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
    int activityNumber = scanner.nextInt();
    scanner.nextLine();

    String[] activity = new String[activityNumber];
    int[] activityWeight = new int[activityNumber];
    int[] activityGrade = new int[activityNumber];
    int sumWeight = 0;
    int sumGrade = 0;

    for (int i = 0; i < activityNumber; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      activity[i] = scanner.nextLine();

      System.out.println("Digite o peso da Atividade " + (i + 1) + ":");
      activityWeight[i] = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Digite a nota obtida para " + activity[i] + ":");
      activityGrade[i] = scanner.nextInt();
      scanner.nextLine();

      sumWeight += activityWeight[i];
      sumGrade += (activityGrade[i] * activityWeight[i]);
    }

    double finalGrade = (double) sumGrade / sumWeight;

    if (finalGrade >= 85) {
      System.out.println("Parabéns! Você alcançou " + finalGrade
          + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
              + finalGrade
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}