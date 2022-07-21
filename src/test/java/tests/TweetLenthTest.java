package tests;

import org.testng.annotations.Test;

import pages.ProfilePage;

public class TweetLenthTest extends TestBase{
	ProfilePage profilePageObject;
	String validContent="use cam link as capture card but no sound windows 10 laptop ,deep field image hubble vs james webb telescope live tracker,qs world university rankings by subject 2022 business & management studies,read csv file in java and python so that no one can deny it and any thing else you.";
	String InvalidContent="we all use cam link as capture card but no sound windows 10 laptop ,deep field image hubble vs james webb telescope live tracker,qs world university rankings by subject 2022 business & management studies,read csv file in java and python so that no one can deny it and any thing else you.";

	@Test
	public void TypeValidLenth() 
	{
		profilePageObject=new ProfilePage(driver);
		profilePageObject.UserTweet(validContent);
		
	}
	@Test
	public void typeInvalidLenth() 
	{
		profilePageObject.UserTweet(InvalidContent);
		
	}
}
