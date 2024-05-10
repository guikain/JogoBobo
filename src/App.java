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
        lista.add(new Monster("Orc", 2, 100, Comportamento.AGRESSIVO));
        lista.add(new Monster("Goblin", 1, 50, Comportamento.AGRESSIVO));

        // COMENTAR/DESCOMENTAR PARA ADICIONAR/REMOVER INIMIGOS.
        //cena.setMonsters(lista);


        Controller controller = new Controller(cena);
        View view = new View(scanner, controller);
        controller.setView(view);
       
        view.apresentacao();
    }
}
