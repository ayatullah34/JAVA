package com.springdemo;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal customerDal; 
	
	//CONSTRUCTOR INJECT�ON
	public CustomerManager(ICustomerDal customerDal) {  //BURADAK� PARAMAETREL� CONS DAN DOLAYI APP...XML ���NE <constructor-arg ref="database" /> EKLEND� BU SAYEDE 
														//PARAMAETRE OLARAK DATABASE KISMI YOLLANARAK SORUN ��Z�LD�
		this.customerDal = customerDal;
}

	public void add()
	{
		customerDal.add();
		
	}

	
}
