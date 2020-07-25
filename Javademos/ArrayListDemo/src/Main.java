import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList sayilar=new ArrayList();

        sayilar.add(1);//ELEMAN EKLEME
        sayilar.add(10);
        sayilar.add("ankara");

        System.out.println(sayilar.size());//DİZİ BOYUT

        System.out.println(sayilar.get(2));//İSTENİLEN ELEMANI YAZDIRMA

        sayilar.set(0,100);//ELEMANI GÜNCELLEME 1.ELEMAN 100 OLARAK DEĞİŞTİRİLDİ

        System.out.println("1.eleman: "+sayilar.get(0));

        sayilar.remove(0);//1.ELEMAN SİLİNDİ 2.ELEMAN 1.ELEMANIN YERİNE GEÇEREK LİSTE KAYAR

        System.out.println("1.eleman: "+sayilar.get(0));

        //sayilar.clear();//TÜM ELEMANLARI SİLER

        for (Object i:sayilar) {//İNT STRİNG VB. YERİNE ELEMANLAR İÇİN 'Object' KULLANILIR
            System.out.println(i);
        }

    }
}
