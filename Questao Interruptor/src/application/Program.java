package application;

import util.Lampada;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
    Scanner tc = new Scanner(System.in);

        System.out.println("Programa interruptor");
        Lampada lampada = new Lampada();
        System.out.println("Escolha uma opção:\n" +
                "0- Encerrar!\n" +
                "1- Ligar!\n" +
                "2- Apagar!");
        int opcao = tc.nextInt();

        while (opcao != 0){


            switch (opcao){
                case 1:
                    lampada.ligarLampada();
                    break;
                case 2:
                    lampada.apagarLampada();
                    break;
                default:
                    System.out.println("[ERRO]Opção invalida!");
                    break;
            }

            System.out.println("Escolha uma opção:\n" +
                    "0- Encerrar!\n" +
                    "1- Ligar!\n" +
                    "2- Apagar!");
            opcao = tc.nextInt();
        }
    }
}
