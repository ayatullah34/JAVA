public class Main {

    public static void main(String[] args) {

    Product product=new Product();

	product.setName("laptop");
	product.setId(1);
    product.setPrice(5000);
    product.setStockAmount(3);
    ProductManager productManager=new ProductManager();
    productManager.Add(product);

//PARAMETRELİ CONSTRUCTOR
    Product product1=new Product(2,"TV","TECHNOLOGY",2333,22,"black");

    productManager.Add(product1);
    System.out.println(product.getKod());

    }
}
