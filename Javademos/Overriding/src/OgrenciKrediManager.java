public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        return tutar * 1.10;
    }
    //BASEDEKİ HESAPLA FONK. İLE AYNI OLD. İÇİN OVERRİDE OLUR VE BU KOD ÇALIŞIR BASE DEKİ KODU EZER C# DA VIRTUAL GİBİ ÖZELLİKLERLE YAPILIR...
    //JAVA DA EKSTRA Bİ ŞEY YAZMAYA GEREK YOK INHERITANCE ÖZELLİĞİ İÇİNDE OVERRIDE VARDIR...
}
