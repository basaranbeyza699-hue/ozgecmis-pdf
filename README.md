# Özgeçmiş PDF Oluşturucu

Java kullanarak PDF formatında özgeçmiş hazırlayan bir konsol uygulamasıdır. Arayüz yoktur. Program çalıştırıldığında proje klasöründe `ozgecmis.pdf` dosyası oluşur.

## Özellikler
- Fotoğraf, kişisel bilgiler, GitHub ve LinkedIn bağlantıları
- Hakkımda bölümü
- 3 iş deneyimi
- Eğitim bilgileri (üniversite ve lise)
- Beceriler ve yabancı diller

## Kullanılan Teknolojiler
- Java 21
- Maven
- OpenPDF 1.3.43 (PDF oluşturma kütüphanesi)
- IntelliJ IDEA

## Proje Yapısı
```
src/main/java/org/example/
├── Main.java            # Nesneleri oluşturur, PdfOlusturucu'yu çağırır
├── PdfOlusturucu.java   # PDF üretim işlemi (ayrı sınıf)
├── Kisi.java            # Kişisel bilgiler
├── IsDeneyimi.java      # Tek bir iş deneyimi
└── Egitim.java          # Tek bir eğitim bilgisi
src/main/resources/
└── foto.png             # Özgeçmişteki fotoğraf
```

## Kullanılan Sınıflar ve Nesneler

| Sınıf / Nesne | Ne için kullanıldı? | Neden? |
|---|---|---|
| `Kisi` | Ad, unvan, e-posta, telefon, şehir, bağlantılar ve özet bilgisini tutar | Bir kişiye ait bilgileri tek nesnede toplamak için |
| `IsDeneyimi` | Şirket, pozisyon, tarih ve açıklamayı tutar | Her iş deneyimi ayrı bir nesne olur, 3 nesne oluşturuldu |
| `Egitim` | Okul, bölüm ve yıl bilgisini tutar | Üniversite ve lise için aynı sınıf iki kez kullanıldı |
| `PdfOlusturucu` | PDF dosyasını hazırlar | PDF işlemi `main` içinde değil, ödev şartı gereği ayrı sınıfta yapıldı |
S| `Document` (OpenPDF) | PDF belgesini temsil eder | Sayfaya içerik eklemek için |
| `PdfWriter` (OpenPDF) | Belgeyi dosyaya yazar | PDF'in diske kaydedilmesi için |
| `Paragraph` (OpenPDF) | Metin satırlarını oluşturur | Başlık ve yazıları eklemek için |
| `Font` / `FontFactory` (OpenPDF) | Yazı tipini ve boyutunu belirler | Başlık ve normal yazıyı ayırmak, Türkçe karakter desteği için |
| `Image` (OpenPDF) | Fotoğrafı yükler | Özgeçmişe fotoğraf eklemek için |

## Erişim Düzenleyiciler
- Sınıflardaki alanlar `private`: dışarıdan doğrudan değiştirilemez (kapsülleme).
- Yapıcı metotlar ve getter metotları `public`: nesne dışarıdan oluşturulabilir, bilgiler okunabilir.
- Sınıflar `public` olarak tanımlandı.

## Nesne Yaşam Döngüsü
1. **Oluşturma:** `Main` içinde `new Kisi(...)`, `new IsDeneyimi(...)` gibi çağrılarla nesneler oluşturulur.
2. **Kullanma:** Nesneler `PdfOlusturucu`'ya gönderilir, getter metotlarıyla bilgiler okunup PDF'e yazılır.
3. **Kapatma:** `document.close()` ile PDF belgesi kapatılır.
4. **Temizlenme:** `main` bittiğinde nesnelere erişim kalmaz, Java'nın çöp toplayıcısı (garbage collector) bunları bellekten temizler.

## Çalıştırma
1. Projeyi indir: `git clone https://github.com/basaranbeyza699-hue/ozgecmis-pdf.git`
2. IntelliJ IDEA ile aç, Maven'in bağımlılıkları indirmesini bekle.
3. `Main.java` dosyasını çalıştır.
4. Proje klasöründe oluşan `ozgecmis.pdf` dosyasını aç.

## Yapay Zekâ Kullanımı
Bu projede yapay zekâ asistanı **Claude** (Anthropic) kullanıldı. Yardım aldığım konular:
- Projenin parçalara bölünmesi ve Maven projesinin kurulması
- OpenPDF kütüphanesinin nasıl kullanılacağının öğrenilmesi
- Kodun öğrenme seviyeme göre sadeleştirilmesi
- Hata mesajlarının (derleme hataları, dosya adı sorunları) çözülmesi
- GitHub'a yükleme adımlarının öğrenilmesi

Kodu kendim IntelliJ'e yazdım, çalıştırdım ve hataları düzelttim. Kişisel bilgiler örnek amaçlıdır, iş deneyimlerinden biri ödev gereği hayalidir.