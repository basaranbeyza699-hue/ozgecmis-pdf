package org.example;

public class IsDeneyimi {
    private String sirket;
    private String pozisyon;
    private String tarihAraligi;
    private String aciklama;

    public IsDeneyimi(String sirket, String pozisyon,
                      String tarihAraligi, String aciklama) {
        this.sirket = sirket;
        this.pozisyon = pozisyon;
        this.tarihAraligi = tarihAraligi;
        this.aciklama = aciklama;
    }

    public String getSirket() { return sirket; }
    public String getPozisyon() { return pozisyon; }
    public String getTarihAraligi() { return tarihAraligi; }
    public String getAciklama() { return aciklama; }
}
