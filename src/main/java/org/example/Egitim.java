package org.example;

public class Egitim {
    private String okul;
    private String bolum;
    private String yil;

    public Egitim(String okul, String bolum, String yil) {
        this.okul = okul;
        this.bolum = bolum;
        this.yil = yil;
    }

    public String getOkul() { return okul; }
    public String getBolum() { return bolum; }
    public String getYil() { return yil; }
}