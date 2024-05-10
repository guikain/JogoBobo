package view;

import java.util.Scanner;

import controller.Controller;

public class View {

    private Scanner scanner; 
    private Controller controller;
    
    public View(Scanner scanner, Controller controller) {
        this.scanner = scanner;
        this.controller = controller;
    }
    
    public void apresentacao(){
        while (true) {
            System.out.println("*** Você esta numa floresta e ouve um barulho! ***");
            System.out.println("--------------------------------------------------");
            System.out.println("Deseja se aproximar?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            controller.aproximar(readInt());
        }
    }

    public void opcaoInvalida(){
        System.out.println("Você nao tem outra opçao.");
        System.out.println("Você vai ou você fica ?");
        System.out.println("1 - Ir");
        System.out.println("2 - Ficar");
        controller.aproximar(readInt());
    }

    public int readInt(){
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

}
