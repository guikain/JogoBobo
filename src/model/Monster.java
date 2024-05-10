package model;

public class Monster extends Mob {

    private String grito;

    public Monster(String nome, int level, int xpbase, Comportamento comportamento, String grito) {
        super(nome, level, xpbase, comportamento);
        this.grito = grito;
    }

    private String atacar() {
        return " Parte para cima de você.";
    }
    private String gritar() {
        return grito;
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
