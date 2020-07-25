public class MySqlCustomerDal implements ICustomerDal,IRepository{//BİRDEN FAZLA INTERFACE İMPLENT EDİLEBİLİYO


    @Override
    public void Add() {
        System.out.println("Mysql eklendi...");
    }
}
