package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageBase{

	public ProfilePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(css = "div.public-DraftStyleDefault-block public-DraftStyleDefault-ltr")
	WebElement TweetTxtField;
	
	@FindBy(css = "span.css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0")
	WebElement Tweetbtn;
	
	@FindBy(css = "svg.r-1cvl2hr r-4qtqp9 r-yyyyoo r-z80fyv r-dnmrzs r-bnwqim r-1plcrui r-lrvibr r-19wmn03")
	WebElement ImageUploadIcon;
	
	
	public void UserTweet(String content) 
	{
		setTextElementText(TweetTxtField, content);
		clickbtn(Tweetbtn);
	}
	
	public void ImageUpload() 
	{
		String ImageName="Chocolate.jpg";
		String ImagePath= System.getProperty("user.dir")+"/Uploads/"+ImageName;
		ImageUploadIcon.sendKeys(ImagePath);
	}
	

}
