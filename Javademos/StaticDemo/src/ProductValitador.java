public class ProductValitador {//public static class ProductValidator yazarak içindekileride static olarak kullanabilme c# da var burada kullanılmıyo

//constructor çalışmaz new leme yapmadığımız için ama c# da çalışır ikisi farklı...
//ile static constructor oluşturulabilir
//birden fazla olarak eklenebilir hepsi aynı anda çalışılır,yaygın bi kullanım değildir...
    static {

        System.out.println("constructor1");
}
    static {
        System.out.println("constructor2");
}

    public static boolean isValid(Product product){

//bir methodu static yaparsak direk class ismiyle çağrılabilir nesneye gerek yok...

        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

public static class anotherClass{ //inner class temel class dışında static koyabiliyoruz
        public static void Sil(){

        }
}

}
