package org.example;

public class Main {
    public static void main(String[] args) {

        Kisi kisi = new Kisi(
                "Beyza Başaran",
                "Yazılım Mühendisliği Öğrencisi",
                "basaranbeyza699@gmail.com",
                "0555 079 89 75",
                "Kırklareli",
                "https://github.com/basaranbeyza699-hue",
                "https://www.linkedin.com/in/beyza-ba%C5%9Faran-a77219434/",
                "Kırklareli Üniversitesi Yazılım Mühendisliği 2. sınıf öğrencisiyim. "
                        + "Java, C# ve Python biliyorum, web programlama alanında HTML5 ve CSS öğrenmeye devam ediyorum. "
                        + "Çalışırken eğitimimi sürdürdüğüm için sorumluluk almayı ve zamanı verimli kullanmayı öğrendim. "
                        + "Hedefim, güçlü bir şirkette yazılım mühendisi olarak çalışmak ve kendimi sürekli geliştirmek.");

        IsDeneyimi is1 = new IsDeneyimi("Ghia Cafe", "Garson",
                "1 yıl",
                "Müşteri siparişlerini aldım, servis yaptım ve yoğun saatlerde ekip içinde uyum içinde çalıştım.");

        IsDeneyimi is2 = new IsDeneyimi("Shell Petrol Ofisi", "İstasyon Çalışanı",
                "Yaklaşık 1 yıl - Devam ediyor",
                "Müşterilerle birebir ilgileniyorum, kasa ve istasyon işlerinde sorumluluk alıyorum.");

        IsDeneyimi is3 = new IsDeneyimi("Mavi Yazılım A.Ş.", "Yazılım Stajyeri (Yarı Zamanlı)",
                "Haziran 2026 - Eylül 2026",
                "Java ile basit uygulamalar geliştirdim ve hata ayıklama çalışmalarına destek verdim.");

        Egitim egitim1 = new Egitim("Kırklareli Üniversitesi", "Yazılım Mühendisliği", "2025 - Devam ediyor (2. sınıf)");
        Egitim egitim2 = new Egitim("Tekirdağ Anadolu Lisesi", "Lise", "Mezun");

        String beceriler = "Java, C#, Python, HTML5 ve CSS (öğreniyorum), Git ve GitHub";
        String diller = "İngilizce: B1, Rusça: A2";

        PdfOlusturucu olusturucu = new PdfOlusturucu(kisi, is1, is2, is3, egitim1, egitim2, beceriler, diller);
        olusturucu.olustur("ozgecmis.pdf");

        System.out.println("ozgecmis.pdf olusturuldu.");
    }
}