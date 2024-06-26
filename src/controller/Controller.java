package controller;

import java.util.Scanner;

import model.Cena;
import model.Comportamento;
import model.Monster;
import view.View;

public class Controller {

    private Cena cena;
    private View view;
    private Scanner scanner;
    
    public Controller(Scanner scanner, Cena cena) {
        this.cena = cena;
        this.scanner = scanner;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void aproximar(){
        Monster monster = cena.getMonsters().stream().findFirst().orElse(null);
        switch (readInt()) {
            case 1:
                if (monster != null){
                    if(monster.getComportamento() == Comportamento.AGRESSIVO){
                        System.out.println(monster.agir());
                        System.out.println("Você morreu!");
                        System.exit(0);
                    }else{
                        System.out.println("Era um " + monster.getNome() + " e estava tranquilo.");
                    }
                    
                }
                
                else{
                    System.out.println("Era apenas um galho que caiu com o vento.");
                }
                break;
            case 2:
                if (monster != null){
                    if(monster.getComportamento() == Comportamento.AGRESSIVO)
                        System.out.println("Sua escolha me pareceu boa, poderia ser algum monstro, quem sabe até um " + monster.getNome());
                    else 
                        System.out.println("Poderia ser qualquer coisa, quem sabe até um " + monster.getNome());
                }else{
                    System.out.println("Você parece ser muito medroso para esta aventura.");
                    System.exit(0);
                }
                break;
            default:
                view.opcaoInvalida();
                break;
        }
    }

    public int readInt(){
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
}
