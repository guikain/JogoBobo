import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.Controller;
import model.Comportamento;
import model.Cena;
import model.Monster;
import view.View;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Cena cena = new Cena();
        List<Monster> lista = new ArrayList<>();
        //lista.add(new Monster("Orc", 2, 100, Comportamento.AGRESSIVO, "ARRRRRR!!!"));
        lista.add(new Monster("Brunna", 1, 50, Comportamento.NEUTRO, "Vou te mataaaar!"));

// COMENTAR/DESCOMENTAR PARA ADICIONAR/REMOVER INIMIGOS.
        cena.setMonsters(lista);


        Controller controller = new Controller(scanner, cena);
        View view = new View(controller);
        controller.setView(view);
       
        view.apresentacao();
    }
}
