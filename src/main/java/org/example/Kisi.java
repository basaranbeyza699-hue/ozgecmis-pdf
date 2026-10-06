package org.example;

public class Kisi {
    private String adSoyad;
    private String unvan;
    private String eposta;
    private String telefon;
    private String sehir;
    private String github;
    private String linkedin;
    private String ozet;

    public Kisi(String adSoyad, String unvan, String eposta, String telefon,
                String sehir, String github, String linkedin, String ozet) {
        this.adSoyad = adSoyad;
        this.unvan = unvan;
        this.eposta = eposta;
        this.telefon = telefon;
        this.sehir = sehir;
        this.github = github;
        this.linkedin = linkedin;
        this.ozet = ozet;
    }

    public String getAdSoyad() { return adSoyad; }
    public String getUnvan() { return unvan; }
    public String getEposta() { return eposta; }
    public String getTelefon() { return telefon; }
    public String getSehir() { return sehir; }
    public String getGithub() { return github; }
    public String getLinkedin() { return linkedin; }
    public String getOzet() { return ozet; }
}