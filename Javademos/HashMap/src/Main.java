import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> sozluk=new HashMap<String, String>();//STRİNG-İNT, İNT-İNT DE OLABİLİR

        sozluk.put("book","kitap");//SOL TARAF KEY SAĞ TARAF VALUE(KARŞILIĞI)
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println(sozluk.size());

        for (String item:sozluk.keySet()){//SADECE KEYLERİ DOLAŞIR VE BASMAMIZI SAĞLAR
            System.out.println(item);
        }

        for (String item:sozluk.keySet()){
            System.out.println("ELEMAN- "+item+" DEĞER- "+sozluk.get(item));
        }

        System.out.println(sozluk);
        System.out.println(sozluk.get("table"));

        sozluk.remove("table");
        System.out.println(sozluk.get("table"));//TABLE YERİNE NULL BASAR




        //sozluk.clear();

    }
}
