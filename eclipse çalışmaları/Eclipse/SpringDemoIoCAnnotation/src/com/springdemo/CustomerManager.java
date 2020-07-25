package com.springdemo;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal customerDal; 
	
	//CONSTRUCTOR INJECTÝON
	public CustomerManager(ICustomerDal customerDal) {  //BURADAKÝ PARAMAETRELÝ CONS DAN DOLAYI APP...XML ÝÇÝNE <constructor-arg ref="database" /> EKLENDÝ BU SAYEDE 
														//PARAMAETRE OLARAK DATABASE KISMI YOLLANARAK SORUN ÇÖZÜLDÜ
		this.customerDal = customerDal;
}

	public void add()
	{
		customerDal.add();
		
	}

	
}
