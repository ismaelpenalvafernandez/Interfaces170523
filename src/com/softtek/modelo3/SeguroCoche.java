package com.softtek.modelo3;

public class SeguroCoche {
    private Taller t;
    private String aseguradora;
    public SeguroCoche(Taller t, String aseguradora) {
        this.t = t;
    }

    public void setT(Taller t) {
        this.t = t;
    }

    public String getAseguradora() {
        return aseguradora;
    }
    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
    public String reparar(Coche c) {
        return t.reparar(c);
    }
}
