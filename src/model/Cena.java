package model;

import java.util.ArrayList;
import java.util.List;

public class Cena {
    
    List<Monster> monsters;

    public Cena() {
        this.monsters = new ArrayList<>();
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    @Override
    public String toString() {
        return "Cena [monsters=" + monsters + "]";
    }
}
