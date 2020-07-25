package SpringIntro;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal customerDal; 
	
	//CONSTRUCTOR INJECT�ON
	//public CustomerManager(ICustomerDal customerDal) {  //BURADAK� PARAMAETREL� CONS DAN DOLAYI APP...XML ���NE <constructor-arg ref="database" /> EKLEND� BU SAYEDE 
														//PARAMAETRE OLARAK DATABASE KISMI YOLLANARAK SORUN ��Z�LD�
	//	this.customerDal = customerDal;
//}

	
	//SETTER INJECT�ON
	public void setCustomerDal(ICustomerDal customerDal) {  //CONSTRUCTOR A ALTERNAT�F YOL XML KODUNA PROPERTY EKLENEREK KULLANILIR
		this.customerDal = customerDal;  
	}
	
	public void add()
	{
		customerDal.add();
		
	}

	
}
