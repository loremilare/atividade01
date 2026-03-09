package geometria;

import java.util.Scanner;

public class calculadora {


private double lado;
private double base;
private double altura;
private double raio;
private int opcao;


public void menu() {
    System.out.println("1 - Calcular Área do Quadrado");
    System.out.println("2 - Calcular Área do Retângulo");
    System.out.println("3 - Calcular Área do Círculo");
    System.out.println("0 - Sair");
    System.out.print("Escolha uma opção: ");
}


public void executar() {

    Scanner scanner = new Scanner(System.in);

    do {
        menu();
        opcao = scanner.nextInt();

        switch (opcao) {

            case 1:
                System.out.print("Digite o lado do quadrado: ");
                lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.printf("Área do Quadrado: ", areaQuadrado);
                break;

            case 2:
                System.out.print("Digite a base do retângulo: ");
                base = scanner.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                altura = scanner.nextDouble();
                double areaRetangulo = base * altura;
                System.out.printf("Área do Retângulo: ", areaRetangulo);
                break;

            case 3:
                System.out.print("Digite o raio do círculo: ");
                raio = scanner.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                System.out.printf("Área do Círculo: ", areaCirculo);
                break;

            case 0:
                System.out.println("Encerrando o programa...");
                break;

            default:
                System.out.println("Opção inválida!\n");
        }

    } while (opcao != 0);

    scanner.close();
}
