package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id="Email")
	WebElement EmailTxtBox;

	@FindBy(id="Password")
	WebElement PasswordTxtBox;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement LoginBtn;

	public void UserLogin(String Email,String password)
	{
		setTextElementText(EmailTxtBox,Email);
		setTextElementText(PasswordTxtBox, password);
		clickbtn(LoginBtn);
	}
}
