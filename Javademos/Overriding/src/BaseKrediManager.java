public class BaseKrediManager {
    public /*final*/ double hesapla(double tutar){
        return tutar * 1.18;
    }
}
//EĞER public final double ŞEKLİNDE YAZSAYDIK OVERRIDE YAPILMASINA İZİN VERMEZDİ
//EZME DURUMU OLMAYACAĞI İÇİN OgrenciKrediManager deki AYNI İSİMDEKİ KOD ÇALIŞMAZDI...
