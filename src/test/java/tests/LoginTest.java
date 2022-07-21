package tests;

import org.testng.annotations.Test;

import pages.HomePage;


   public class LoginTest extends TestBase{

		HomePage homepageObject;
		String email="test@test.com";
		String pass="123456789";
   @Test
   public void userLogin() 
		{
		   homepageObject=new HomePage(driver);
		   homepageObject.UserLogin(email, pass);
		}
	}

