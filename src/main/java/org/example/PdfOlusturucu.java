package org.example;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PdfOlusturucu {

    private Kisi kisi;
    private IsDeneyimi is1;
    private IsDeneyimi is2;
    private IsDeneyimi is3;
    private Egitim egitim1;
    private Egitim egitim2;
    private String beceriler;
    private String diller;

    public PdfOlusturucu(Kisi kisi, IsDeneyimi is1, IsDeneyimi is2, IsDeneyimi is3,
                         Egitim egitim1, Egitim egitim2, String beceriler, String diller) {
        this.kisi = kisi;
        this.is1 = is1;
        this.is2 = is2;
        this.is3 = is3;
        this.egitim1 = egitim1;
        this.egitim2 = egitim2;
        this.beceriler = beceriler;
        this.diller = diller;
    }

    public void olustur(String dosyaAdi) {
        Document document = new Document();

        try {
            Font baslik = FontFactory.getFont(FontFactory.HELVETICA_BOLD, "Cp1254", 16);
            Font yazi = FontFactory.getFont(FontFactory.HELVETICA, "Cp1254", 12);

            PdfWriter.getInstance(document, new FileOutputStream(dosyaAdi));
            document.open();

            // Fotoğraf
            Image foto = Image.getInstance("src/main/resources/foto.png");
            foto.scaleToFit(100, 130);
            document.add(foto);

            // Kişisel bilgiler
            document.add(new Paragraph(kisi.getAdSoyad(), baslik));
            document.add(new Paragraph(kisi.getUnvan(), yazi));
            document.add(new Paragraph("E-posta: " + kisi.getEposta(), yazi));
            document.add(new Paragraph("Telefon: " + kisi.getTelefon(), yazi));
            document.add(new Paragraph("Şehir: " + kisi.getSehir(), yazi));
            document.add(new Paragraph("GitHub: " + kisi.getGithub(), yazi));
            document.add(new Paragraph("LinkedIn: " + kisi.getLinkedin(), yazi));
            document.add(new Paragraph(" "));

            // Hakkımda
            document.add(new Paragraph("HAKKIMDA", baslik));
            document.add(new Paragraph(kisi.getOzet(), yazi));
            document.add(new Paragraph(" "));

            // İş deneyimleri
            document.add(new Paragraph("İŞ DENEYİMİ", baslik));
            document.add(new Paragraph(is1.getPozisyon() + " - " + is1.getSirket(), yazi));
            document.add(new Paragraph(is1.getTarihAraligi(), yazi));
            document.add(new Paragraph(is1.getAciklama(), yazi));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(is2.getPozisyon() + " - " + is2.getSirket(), yazi));
            document.add(new Paragraph(is2.getTarihAraligi(), yazi));
            document.add(new Paragraph(is2.getAciklama(), yazi));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(is3.getPozisyon() + " - " + is3.getSirket(), yazi));
            document.add(new Paragraph(is3.getTarihAraligi(), yazi));
            document.add(new Paragraph(is3.getAciklama(), yazi));
            document.add(new Paragraph(" "));

            // Eğitim
            document.add(new Paragraph("EĞİTİM", baslik));
            document.add(new Paragraph(egitim1.getOkul(), yazi));
            document.add(new Paragraph(egitim1.getBolum() + " (" + egitim1.getYil() + ")", yazi));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(egitim2.getOkul(), yazi));
            document.add(new Paragraph(egitim2.getBolum() + " (" + egitim2.getYil() + ")", yazi));
            document.add(new Paragraph(" "));

            // Beceriler
            document.add(new Paragraph("BECERİLER", baslik));
            document.add(new Paragraph(beceriler, yazi));
            document.add(new Paragraph(" "));

            // Diller
            document.add(new Paragraph("YABANCI DİLLER", baslik));
            document.add(new Paragraph(diller, yazi));

            document.close();

        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}