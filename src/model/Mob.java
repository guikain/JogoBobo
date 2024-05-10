package model;

import util.Util;

public abstract class Mob {
    
    protected int id;
    protected String nome;
    protected int level;
    protected int xpbase;
    protected Comportamento comportamento;


    public Mob(String nome, int level, int xpbase, Comportamento comportamento) {
        this.id = Util.gerarId();
        setNome(nome);
        setLevel(level);
        setXpbase(xpbase);
    }


    public String getNome() {
        return nome;
    }
    public int getLevel() {
        return level;
    }
    public int getXpbase() {
        return xpbase;
    }
    public Comportamento getComportamento() {
        return comportamento;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setLevel(int level) {
        //if simples (uma linha)
        if(Util.isValidNum(level)) this.level = level;
        
    }
    public void setXpbase(int xpbase) {
        //if ternário
        this.xpbase = Util.isValidNum(xpbase)? xpbase: this.xpbase;
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }


    public abstract String agir();
    

    @Override
    public String toString() {
        return "Mob [id=" + id + ", nome=" + nome + ", level=" + level + ", xpbase=" + xpbase + ", comportamento="
                + comportamento + "]";
    }
}
    