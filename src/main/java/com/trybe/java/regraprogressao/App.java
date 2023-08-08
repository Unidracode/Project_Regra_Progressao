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

    String[] activities = new String[activityNumber];
    int[] activityValue = new int[activityNumber];

    for (int i = 0; i < activityNumber; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      activities[i] = scanner.nextLine();

      System.out.println("Digite o peso da Atividade " + (i + 1) + ":");
      activityValue[i] = scanner.nextInt();
      scanner.nextLine();
    }
  }
}