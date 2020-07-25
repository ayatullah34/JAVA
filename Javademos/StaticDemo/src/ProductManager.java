public class ProductManager {
    public  void add(Product product){
//NESNELİ KULLANIM STATİC OLD. İÇİN İHTİYAÇ YOK...
        //ProductValitador valitador=new ProductValitador();
        //if(valitador.isValid(product))

        if(ProductValitador.isValid(product)){

            System.out.println("ürün eklendi");
        }
        else{
            System.out.println("ürün bilgileri geçersiz");
        }

    }
}
