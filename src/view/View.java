package view;

import controller.Controller;

public class View {

    private Controller controller;
    
    public View(Controller controller) {
        this.controller = controller;
    }
    
    public void apresentacao(){
        while (true) {
            System.out.println("*** Você esta numa floresta e ouve um barulho! ***");
            System.out.println("--------------------------------------------------");
            System.out.println("Deseja se aproximar?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            controller.aproximar();
        }
    }

    public void opcaoInvalida(){
        System.out.println("Você nao tem outra opçao.");
        System.out.println("Você vai ou você fica ?");
        System.out.println("1 - Ir");
        System.out.println("2 - Ficar");
        controller.aproximar();
    }
}
