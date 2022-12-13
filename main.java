import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        String kAdi, sifre, cevap, yeniSifre;

        Scanner i = new Scanner(System.in);

        System.out.print("Kullanici Adi Giriniz : ");

        kAdi = i.nextLine();

        System.out.print("Şifrenizi Giriniz : ");

        sifre = i.nextLine();

        if ((kAdi.equals("mira")) && (sifre.equals("eylul123"))) {

            System.out.println("Giriş Başarılı!!!");

        } else {
            System.out.print("Şifreniz Yanlış. Şifrenizi Yenilemek İster Misiniz? (Evet/Hayir) : ");

            cevap = i.nextLine();

            if (cevap.equals("Evet")) {

                System.out.print("Yeni bir şifre giriniz : ");

                yeniSifre = i.nextLine();

                i.close();

                if (!yeniSifre.equals("eylul123")) {

                    System.out.println("Şifreniz Değişti ");

                } else {
                    System.out.println("Yeni Şifreniz Eski şifreniz ile ayni olamaz.");
                }

            }

        }

    }
}
