package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{
    @Test
	public void verify_account_registration() {
		
		HomePage hopage=new HomePage(driver);
		hopage.clickMyAccount();
		hopage.clickRegister();
		
		AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
		regpage.setFirstName("Sarthak");
		regpage.setLastName("Malkunaik");
		regpage.setEmail("sarthaknaik07@gmail.com");
		regpage.setTelephone("9146760280");
		regpage.setPassword("sarthak07");
		regpage.setConfirmPassword("sarthak07");
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
    }
}
