package com.Servlet;

 public class LoginDaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginDaoImpl logindao=new LoginDaoImpl();
		Login login=new Login("rahul","12345");
		boolean result=logindao.validation(login);
		if(result==true)
			System.out.println("Suucess");
		else
			System.out.println("Unsuccess");

	}  

}
