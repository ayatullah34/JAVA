public class Main {

    public static void main(String[] args) {

        OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(ogretmenKrediManager);
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}
