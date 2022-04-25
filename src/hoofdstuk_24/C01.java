package hoofdstuk_24;

import java.io.File;
import java.io.IOException;

public class C01 {




    public static void main(String[] args) {
        ///---> Değişken ve File Sınıfının Tanımlanma İşlemleri <---\\\
        String ayrac = new String(new char[15]).replace("\0", "-");
        File file = new File("//Users/nihat//Documents//Java Proje txt//test2.txt");
        ///---> Belirlediğimiz Dizin Yolunda İlgili Dosyanın Bulunup Bulunmadığını Kontrol Ediyor <---\\\
        System.out.println(ayrac+"\n< Java Dosya İşlemleri >\n"+ayrac);
        if(file.exists()){
            ///---> Dosyanın Dizin Üzerinde Bulunup Bulunmadığını Kontrol Ediyoruz <---\\\
            System.out.println("-> Belirlemiş Olduğunuz Dizin Üzerinde İlgili Dosya Bulunuyor.\n"+ayrac);
        }
        else{
            ///---> Dosya Belirlemiş Olduğumuz Dizin Üzerinde Bulunmuyorsa Dosyanın Oluşmasını Sağlayacak Kodu Yazıyoruz <---\\\
            try{
                file.createNewFile();//
                System.out.println("-> Dizin Üzerinde Dosya Oluşturuldu !!!\n"+ayrac);
            }
            catch (IOException e){
                System.out.println("-> Dosya Oluşturulurken Hata Oluştu !!!\n-> Hata Mesajı: "+ e.getMessage()+"\n"+ayrac);
            }
        }
        System.out.println("-> Dosyanın Adı: " + file.getName());
        System.out.println("-> Dosyanın Dizin Yolu: "+ file.getPath()+"\n"+ayrac);

        System.out.println("File name "+file.getName());
        System.out.println("File length "+file.length());

        System.out.println("-> Dosyanın Mevcut Adını [\""+file.getName()+"\"] Değiştirerek [\"dosya-metotlari.txt\"] Yapalım.");

        File degistir = new File("//Users/nihat//Documents//Java Proje txt//dosya-metotlari.txt");
        file.renameTo(degistir); ///---> Dosyamızın İsmi Değiştirildi <---\\\

        System.out.println("File last name "+degistir.getName());

    }


}
