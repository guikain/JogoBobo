package model;

public class Monster extends Mob {

    public Monster(String nome, int level, int xpbase, Comportamento comportamento) {
        super(nome, level, xpbase, comportamento);
    }

    private String atacar() {
        return " Parte para cima de você.";
    }
    private String gritar() {
        return "AAAAAAAARRRRG!!";
    }

    @Override
    public String agir() {
        String saida = "";
        saida += gritar() + "\n";
        saida += nome + atacar();
        return saida;
    }

    @Override
    public String toString() {
        return "Monster []";
    }   
}
