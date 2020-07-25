public abstract class GameCalculator { //abstract ile base class daki fonksiyonu diğer classlarda inherit ederken başına abstract yazdığımız ->
    //fonksiyonların inherit eden classların tekrar yazarak içeriğini istediği gibi oluşturmasına izin verir override ı zorunla kılar...

    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("oyun bitti...");
    }
}
