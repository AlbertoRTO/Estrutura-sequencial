package com.example.demo;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    int inteiro = n1 + n2;
    int negativo = n1 - n2;
    int divisao = n1 / n2;

    System.out.println("Soma dos inteiros = " + inteiro);
    System.out.println("Negativo = " + negativo);
    System.out.println("Div = " + divisao);
    // double area = largura * comprimento;
    // double preco = area * metroQuadrado;

    // System.out.printf("Area = %.2f%n ", area);
    // System.out.printf("Preco = %.2f%n ", preco);

    sc.close();

  }

}
